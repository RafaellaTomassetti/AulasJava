package application;  

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


public class Main extends Application {  //CLASSE MAIN ESTENDE DE APLICATION
	@Override
	public void start(Stage primaryStage) {   //Já vem o método start
		try {
		
			
			GridPane grid = new GridPane();
			grid.setHgap(5.0);  //define o tamanho horizontal do grid
			grid.setVgap(7.0); //define o tamanho vertical do grid
			
			grid.add(new Label("Nome"), 0, 0); //adicionando o grid no label de nome "NOME"
			//o  '0, 0' é a posição que o "Nome" vai ficar
			
			TextField txtNome =  new TextField(); //text field do JAVA FX
		
			//adicionando o TextField no grid
			grid.add(txtNome, 1, 0); //o txtNome está na posição '1, 0' da grid
			//1 é a coluna e 0 é a linha
			
			
			grid.add(new Label("Sexo: "), 0, 1);
			RadioButton btnMasc = new RadioButton("Masculino");
			RadioButton btnFem = new RadioButton("Feminino");
			btnFem.setSelected(true);

			ToggleGroup group = new ToggleGroup();  //vai juntar os 2 em um componente só, quando marcar uma opção, a outra será desmarcada
			btnFem.setToggleGroup(group);  
			btnMasc.setToggleGroup(group);
			
			HBox radioBox = new HBox(5.0, btnFem, btnMasc); //box onde ficarão as opções para clicar
			//HBox é um layout horizontal, os componentes ficarão lado a lado
			grid.add(radioBox, 1, 1);
			
			
			//---------- CHOICE BOX --------
			
			ChoiceBox<String> chcEstados = new ChoiceBox<>();
			
			ObservableList<String> estados = FXCollections.observableArrayList("Minas Gerais", "São Paulo", "Rio de Janeiro");
			chcEstados.setItems(estados);
			grid.add(chcEstados, 1, 2);
			
			Label lblTeste = new Label();
			
			//---------- BOTÃO -------------
			Button btnTeste = new Button("Teste");
			btnTeste.setOnAction(event -> lblTeste.setText(txtNome.getText()));  //quando estiver acionando um botão, gera um evento
			//depois da seta é o evento que vai ocorrer quando clicar no botão
			
			btnTeste.setOnMouseEntered(event -> lblTeste.setText("Passou") );
			btnTeste.setOnMouseExited(event -> lblTeste.setText("Saiu") );
			
			grid.add(btnTeste, 0, 3);
			grid.add(lblTeste, 0, 4);
			
			
			BorderPane root = new BorderPane();   //chama uma classe BorderPane que chama o painel root
			
			Scene scene = new Scene(root,400,400); //Determina o tamanho da janela
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());  
			//determina o estilo da janela
			
			//------ CHECK BOC ---------
			CheckBox ckbTeste = new CheckBox("Teste");
			grid.add(ckbTeste, 0, 4);
			
			
			root.setCenter(grid); 
			primaryStage.setScene(scene);  //criando estágios(telas em cima de outras)
			primaryStage.show();           //abrindo a primeira tela
			
		} catch(Exception e) {   //exception 
			e.printStackTrace(); 
		}
	}
	
	public static void main(String[] args) {
		launch(args);   //Método que lança o método start
	}
}
