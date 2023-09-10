
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command_design_pattern.example2;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Stack;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

/**
 *
 * @author Yousef
 */
public class RedoUndoController implements Initializable {

    @FXML
    private Button add;
    @FXML
    private TextField textID;
    @FXML
    private ListView<String> listview;
    @FXML
    private Button undo;
    @FXML
    private Button redo;
    private UndoRedoStack undoRedoStack = new UndoRedoStack();
    private String textInput;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void handleAddButton(ActionEvent event) {
        textInput = textID.getText();
        ICommand cmd = new AddCommand(listview.getItems(), textInput);  // Add item to list view
        cmd.execute();
        undoRedoStack.addCommand(cmd);
        textID.clear();  // Clear text field
    }

    @FXML
    private void handleUndoButton(ActionEvent event) {
        undoRedoStack.undo();
    }

    @FXML
    private void handleRedoButton(ActionEvent event) {
        undoRedoStack.redo();
    }

    public interface ICommand {

        void execute();

        void undo();

        void redo();
    }

    public class AddCommand implements ICommand {

        private ObservableList<String> items;
        private String item;

        private AddCommand(ObservableList<String> items, String item) {
            this.items = items;
            this.item = item;
        }

        @Override
        public void execute() {
            listview.getItems().add(item);
        }

        @Override
        public void undo() {
            items.remove(item);
            listview.getItems().remove(item);
        }

        @Override
        public void redo() {
            execute();
        }
    }

    public class UndoRedoStack {

        private Stack<ICommand> undoStack = new Stack<>();
        private Stack<ICommand> redoStack = new Stack<>();

        public void addCommand(ICommand cmd) {
            undoStack.push(cmd);
            redoStack.clear();
        }

        public void undo() {
            if (!undoStack.isEmpty()) {
                ICommand cmd = undoStack.pop();
                cmd.undo();
                redoStack.push(cmd);
            }
        }

        public void redo() {
            if (!redoStack.isEmpty()) {
                ICommand cmd = redoStack.pop();
                cmd.redo();
                undoStack.push(cmd);
            }
        }
    }
}
