import java.util.Deque;
import java.util.LinkedList;

public class MSWord {
  private StringBuilder text;
  // ! LIFO, FIFO
  private Deque<Character> undoQueue;
  private Deque<Character> redoQueue;

  public MSWord() {
    // ! abc -> ab (undo, redoQ=c) -> a (undo, redoQ=cb) -> ab (redo, undoQ=b) -> abc (redo)
    // ! abc -> ab (undo, redoQ=c) -> a (undo, redoQ=cb) -> ab (redo, undoQ=b) -> a (undo) -> ab (redo)
    // ! abc -> ab (undo, redoQ=c) -> a (undo, redoQ=cb) -> a! (action) -> No redo anymore
    this.text = new StringBuilder();
    this.undoQueue = new LinkedList<>();
    this.redoQueue = new LinkedList<>();
  }

  // ! ONLY Action (assumption)
  // addChar action -> prepare undo action
  public void addChar(char ch) {
    this.text.append(ch);
    this.redoQueue.clear();
    this.undoQueue.addLast(ch);
  }

  // undo -> prepare redo action
  public void undo() {
    if (!this.undoQueue.isEmpty()) {
      char lastChar = this.undoQueue.pollLast();
      this.redoQueue.addLast(lastChar);
      if (this.text.length() >= 1) {
        this.text.deleteCharAt(this.text.length() - 1); // abc -> ab
      }
    }
  }

  // ! redo -> StringBuilder append -> prepare undo action
  public void redo() {
    if (!this.redoQueue.isEmpty()) {
      char lastChar = this.redoQueue.pollLast();
      this.text.append(lastChar);
      this.undoQueue.addLast(lastChar);
    }
  }

  public String getText() {
    return this.text.toString();
  }

  public static void main(String[] args) {
    MSWord ms = new MSWord();
    ms.addChar('a');
    ms.addChar('b');
    ms.addChar('c');
    ms.undo(); // ab
    ms.undo(); // a
    ms.addChar('!'); // a!
    ms.undo(); // a
    ms.undo(); // 
    ms.redo(); // a
    System.out.println(ms.getText());
  }
}