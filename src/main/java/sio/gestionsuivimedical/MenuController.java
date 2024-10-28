package sio.gestionsuivimedical;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.AnchorPane;
import javafx.util.converter.IntegerStringConverter;
import sio.gestionsuivimedical.controllers.*;
import sio.gestionsuivimedical.models.*;
import sio.gestionsuivimedical.tools.DataSourceProvider;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.TreeMap;

public class MenuController implements Initializable {


    DataSourceProvider provider;
    VignetteController vignetteController;
    MedicamentController medicamentController;
    PatientController patientController;
    MedecinController medecinController;
    PrescrireController prescrireController;
    ConsultationController consultationController;
    GraphiqueController graphiqueController;
    TreeMap<String, ArrayList<DatasGraph>> datasGraphique;
    XYChart.Series<String,Integer> serieGraph;


    @FXML
    private TextField txtTauxRemboursement;
    @FXML
    private Label lblTitre;
    @FXML
    private Button btnCreerMedicament;
    @FXML
    private ComboBox cboVignettes;
    @FXML
    private Button menuPrescrire;
    @FXML
    private TextField txtPrixMedicament;
    @FXML
    private TextField txtNomMedicament;
    @FXML
    private TextField txtNomVignette;
    @FXML
    private Button menuCreerVignette;
    @FXML
    private AnchorPane apStats;
    @FXML
    private Button menuStats;
    @FXML
    private Button btnCreerVignette;
    @FXML
    private Button menuCreerMedicament;
    @FXML
    private AnchorPane apPrescrire;
    @FXML
    private AnchorPane apCreerVignette;
    @FXML
    private AnchorPane apCreerMedicament;
    @FXML
    private TableView<Medicament> tvMedicaments;
    @FXML
    private TableColumn tcQuantiteMedicament;
    @FXML
    private TableColumn tcPrixMedicament;
    @FXML
    private TableColumn tcNomMedicament;
    @FXML
    private Button btnPrescrire;
    @FXML
    private TableColumn tcNumeroMedicament;
    @FXML
    private ComboBox cboPatients;
    @FXML
    private DatePicker dpDate;
    @FXML
    private ComboBox cboMedecins;
    @FXML
    private BarChart graph;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        // A vous de jouer
        try {
            provider = new DataSourceProvider();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        vignetteController =  new VignetteController();
        medicamentController = new MedicamentController();
        patientController = new PatientController();
        medecinController = new MedecinController();

        try {
            cboVignettes.setItems(FXCollections.observableList(vignetteController.getAllNoms()));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        cboVignettes.getSelectionModel().selectFirst();

        try {
            cboPatients.setItems(FXCollections.observableArrayList(patientController.getAllNomsPatient()));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        cboPatients.getSelectionModel().selectFirst();

        try {
            cboMedecins.setItems(FXCollections.observableArrayList(medecinController.getAllNomsMedecin()));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        cboMedecins.getSelectionModel().selectFirst();

        tcNumeroMedicament.setCellValueFactory(new PropertyValueFactory<>("idMedicament"));
        tcNomMedicament.setCellValueFactory(new PropertyValueFactory<>("nomMedicament"));
        tcPrixMedicament.setCellValueFactory(new PropertyValueFactory<>("prixMedicament"));
        tcQuantiteMedicament.setCellValueFactory(new PropertyValueFactory<>("quantite"));
        //pour modifier la quantité
        tcQuantiteMedicament.setCellFactory(tc->new TextFieldTableCell<>(new IntegerStringConverter()));

        //rendre modifiable le tv
        tvMedicaments.setEditable(true);

        tcQuantiteMedicament.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent cellEditEvent) {
                TablePosition position = cellEditEvent.getTablePosition();
                int numligne = position.getRow();
               // Medicament laQuantiteModifier = .get(numligne);
                //laQuantiteModifier.setQuantite(Integer.parseInt(cellEditEvent.getNewValue().toString()));
            }
        });

        try {
            tvMedicaments.setItems(FXCollections.observableArrayList(medicamentController.getAllBy()));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void btnCreerMedicamentClicked(ActionEvent actionEvent) throws SQLException {
        String nomMedoc = txtNomMedicament.getText();
        int Prix = Integer.parseInt(txtPrixMedicament.getText());
        int numVignette = vignetteController.getIdByNomVignette(cboVignettes.getSelectionModel().getSelectedItem().toString());
        Medicament medicament = new Medicament(nomMedoc,Prix,numVignette);
        medicamentController.create(medicament);
    }

    @FXML
    public void menuClicked(ActionEvent actionEvent) throws SQLException {
        if(actionEvent.getSource() == menuCreerMedicament)
        {
            apCreerMedicament.toFront();
        } else if (actionEvent.getSource() == menuCreerVignette)
        {
            apCreerVignette.toFront();

        } else if (actionEvent.getSource() == menuPrescrire)

        {
            apPrescrire.toFront();
        }
        else {
            apStats.toFront();
            // A vous de jouer
        }
    }

    @FXML
    public void btnCreerVignetteClicked(ActionEvent actionEvent) throws SQLException {
        String nomVignette = txtNomVignette.getText();
        int tauxRemboursement = Integer.parseInt(txtTauxRemboursement.getText());
        Vignette vignette = new Vignette(nomVignette, tauxRemboursement);
        try {
            vignetteController.create(vignette);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void btnPrescrireClicked(ActionEvent actionEvent) throws SQLException {
        Consultation consultation = new Consultation();
        consultationController.create();
        Prescrire prescrire = new Prescrire();
        prescrireController.create();
    }
}