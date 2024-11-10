import java.util.EmptyStackException;
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
            stack.pop(); // Попытка извлечь элемент из пустого стека
        } catch (EmptyStackException e) {
            System.out.println("Ошибка: попытка извлечь элемент из пустого стека");
            e.printStackTrace();
        }
    }
}