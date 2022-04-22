package lesson2;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(int row, int col) {
        super(String.format("Не возможно получить число из элемента по адресу arry [%d][%d]",row, col));

    }
}
