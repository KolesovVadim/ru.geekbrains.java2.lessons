package lesson2;

public class Main {

    public static final String[][] STRINGS = new String[][]{
        {"1","2","3","4"},
        {"1","2","3","4"},
        {"1","2","3","4"},
        {"1","2","3","4"}
    };
    public static final int REQUIRED_ARRAY_SISE = 4;





    public static void main(String[] args) {
        try {
            int sum = sumArrayValues(STRINGS);
            System.out.println(sum);
        }catch (MyArraySizeException e){
            System.out.println(e.getMessage());
        }catch (MyArrayDataException e){
            System.out.println(e.getMessage());
        }


    }
    public static int  sumArrayValues(String[][] array) {
        checkArraySize(array);

        int sum = 0;

        for (int rowIndex = 0; rowIndex < array.length; rowIndex++) {
            String[] row = array[rowIndex];
            for (int colIndex = 0; colIndex < row.length; colIndex++) {
                String value = row[colIndex];
                try {
                    sum += Integer.valueOf(value);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(rowIndex, colIndex);
                }

            }
        }
        return sum;
    }
    private static void checkArraySize(String[][] arry){
        if (arry.length != REQUIRED_ARRAY_SISE){
            throw new MyArraySizeException();
        }

        for (String[] row : arry) {
            if (row.length != REQUIRED_ARRAY_SISE){
                throw new MyArraySizeException();
            }

        }
    }






}
