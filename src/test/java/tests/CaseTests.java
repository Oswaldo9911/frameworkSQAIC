package tests;

import com.mysql.jdbc.Statement;
import controller.orquestador_w;
import java.io.File;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Conexion;
import static org.openqa.selenium.By.name;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExtentReports.ExtentTestManager;

/**
 *
 * @author Oswaldo Buitrago SQA S.A - fabio.betancourt@sqasa.com
 */
public class CaseTests extends BaseTest {

// Información extra:
// 1) @BeforeClass declaramos las variables driver y wait
// 2) Enviamos estas variables de controlador y de espera a la clase de página con la siguiente declaración
// página de inicio = página de inicio nueva (controlador, espera);
// 3) el método super () en la clase de página transfiere el controlador y espera los valores de las variables a la clase BasePage.
    @DataProvider(name = "FrameworkSQAIC")
    public static Object[][] datosOrquestador() {
        return new Object[][]{{"Ingresar URL", "Chrome", "", "", "https://blackrockdigital.github.io/startbootstrap-sb-admin/login.html", "", "", 0}, {"Esperar (Millisegundos)", "", "", "", "5000", "", "", 0}, {"Click", "", "XPath", "45645boasdasdasd", "", "", "", 0}};
    }

    @Test(dataProvider = "FrameworkSQAIC")
    public void test(String actionW, String explorer, String tIndentificador, String valorIdentificador, String parametro, String value1, String value2, int fila) throws Exception {
        //ExtentReports Descripcion
        ExtentTestManager.getTest().setDescription("Prueba Framework SQA Integracion Continua");
        // Orquestador
        Date fecha = new Date();
        DateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String dateF = dateForm.format(fecha);
        orquestador_w ow = new orquestador_w(dateF);
        // Escenarios
        
        // List Escenarios
        System.out.println("PRUEBA JENKINS BD");
        Conexion con = new Conexion();
        System.out.println("-------------------");
        con.conexion();
        System.out.println("-------------------");

        // Pasos

        // Datos de Orquestador
//        String actionW = "Ingresar URL";
//        String explorer = "Chrome";
//        String tIndentificador = "";
//        String valorIdentificador = "";
//        String parametro = "https://blackrockdigital.github.io/startbootstrap-sb-admin/login.html";
//        String value1 = "";
//        String value2 = "";
        //int fila = 0;
        ow.actions(actionW, explorer, tIndentificador, valorIdentificador, parametro, value1, value2, fila);

    }

//    @Test(priority = 0, description = "FrameworkBack2")
//    public void frameworkSQAIC() throws InterruptedException, Exception {
//        //ExtentReports Descripcion
//        ExtentTestManager.getTest().setDescription("Escenario de inicio de sesion");
//        // Orquestador
//        Date fecha = new Date();
//        DateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
//        String dateF = dateForm.format(fecha);
//        orquestador_w ow = new orquestador_w(dateF);
//        // Datos de Orquestador
//        String actionW = "Ingresar URL";
//        String explorer = "Chrome";
//        String tIndentificador = "";
//        String valorIdentificador = "";
//        String parametro = "https://blackrockdigital.github.io/startbootstrap-sb-admin/login.html";
//        String value1 = "";
//        String value2 = "";
//        int fila = 0;
//        ow.actions(actionW, explorer, tIndentificador, valorIdentificador, parametro, value1, value2, fila);
//    }
//
//    @Test(priority = 1, description = "hola")
//    public void frameworkSQAIC2() throws Exception {
//
//    }
//    @Test(priority = 0, description = "Escenario de inicio de sesion")
//    public void loginBootstrap() throws InterruptedException, Exception {
//        //ExtentReports Descripcion
//        ExtentTestManager.getTest().setDescription("Escenario de inicio de sesion");
//
//        //************* Instacias *************
//        HomePage homePage = new HomePage(driver, wait);
//        LoginPage loginPage = new LoginPage(driver, wait);
//
//        //************* Metodos********************
//        //Abrir pagina
//        homePage.goToN11();
//
//        //Login Pagina
//        loginPage.loginToN11("fabio.betancourt@sqasa.com", "1233903960");
//
//        //************* ASSERTIONS ***********************
//        Thread.sleep(500);
//        //loginPage.verifyLoginPassword(("Su dirección de correo electrónico o contraseña es incorrecta"));
//    }
//    @Test(priority = 1, description = "Menu de sistema")
//    public void menuBootstrap() throws InterruptedException {
//        ExtentTestManager.getTest().setDescription("Escenario de menu Bootstrap");
//        MenuPage menuPage = new MenuPage(driver, wait);    
//        // Ir a registro
//        menuPage.menuPagina();
//    }
//
//    @Test(priority = 2, description = "Registro en el Sistema")
//    public void registroSistema() throws InterruptedException {
//        ExtentTestManager.getTest().setDescription("Registro en Sistema");
//        RegisterPage registerPage = new RegisterPage(driver, wait);
//        // Registro en Sistema
//        registerPage.registroPage("Oswaldo", "Buitrago", "fabio.betancourt@sqasa.com", "OswaldoBet99");
//    }
//    
//    @Test(priority = 3, description = "Prueba Posicion")
//    public void pruebaPosicion() {
//        ExtentTestManager.getTest().setDescription("Prueba Posicion");
//    }
    public CaseTests() {
    }
}
