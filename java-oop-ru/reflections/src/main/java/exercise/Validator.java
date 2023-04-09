package exercise;

import java.lang.reflect.Field;
import java.util.*;

// BEGIN
class Validator {
    public static List<String> validate( Object o ){
        List<String> result = new ArrayList<>();

        for( Field field : o.getClass().getDeclaredFields() ){
            NotNull annotation = field.getAnnotation(NotNull.class);
            if(Objects.isNull(annotation)){
                continue;
            }
            try{

                field.setAccessible(true);
                var value = field.get(o);

                if( Objects.isNull(value) ){
                    result.add(field.getName());
                }

            }catch( Exception e ){
                System.out.println(e);
            }
        }

        return result;
    }

    public static Map<String, List<String>> advancedValidate( Object o ) {
        Map<String, List<String>> result = new HashMap<>();

        for( Field field : o.getClass().getDeclaredFields() ){
            NotNull notNullAnnotation = field.getAnnotation(NotNull.class);
            if( !Objects.isNull(notNullAnnotation) ){
                try{

                    field.setAccessible(true);
                    var value = field.get(o);

                    if( Objects.isNull(value) ){
                        List<String> errors = result.getOrDefault(field.getName(), new ArrayList<>());
                        errors.add("can not be null");
                        result.put(field.getName(), errors);
                    }

                }catch( Exception e ){
                    System.out.println(e);
                }
            }

            MinLength minLengthAnnotation = field.getAnnotation(MinLength.class);
            if( !Objects.isNull(minLengthAnnotation) ){
                field.setAccessible(true);
                try {
                    var value = String.valueOf( field.get(o) );
                    int minLength = minLengthAnnotation.minLength();

                    if( value.length() < minLength ){

                        List<String> errors = result.getOrDefault(field.getName(), new ArrayList<>());
                        errors.add("length less than " + minLength);
                        result.put(field.getName(), errors);

                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return result;
    }
}
// END
