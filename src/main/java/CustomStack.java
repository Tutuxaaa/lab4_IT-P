import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;


public class CustomStack {
    public static void main(String[] args) {
        Stack<Object> stack = new Stack<>();

        try {
            stack.push("one");
            stack.push("banana");
            System.out.println("Верхний элемент: " + stack.peek());
            while (!stack.isEmpty()) {
                System.out.println("Извлекаем: " + stack.pop());
            }
            System.out.println(CustomEmptyStack(stack));

        } catch (CustomEmptyStackException e) {
            logException(e);
            System.out.println("Ошибка: попытка извлечь элемент из пустого стека");
        }
    }

    public static Object CustomEmptyStack(Stack<Object> stack) throws CustomEmptyStackException {

        if (stack.isEmpty()){
            throw new CustomEmptyStackException("Попытка извлечь элемент из пустого стека");
        }
        return stack.pop(); // Попытка извлечь элемент из пустого стека
    }

    private static void logException(Exception e) {
        try (FileWriter writer = new FileWriter("exceptions.log", true)) { // true для добавления в конец файла
            writer.write(e.getMessage() + "\n");
        } catch (IOException ioException) {
            System.err.println("Не удалось записать в файл: " + ioException.getMessage());
        }
    }
}