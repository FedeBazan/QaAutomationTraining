# QaAutomationTraining

**Objetivo del Desafío:** Crear un conjunto de pruebas automatizadas para una página web de comercio electrónico.

**Página Web:** Puedes usar la página web de demostración de comercio electrónico "Sauce Labs" (https://www.saucedemo.com) para este desafío.

**Tareas:**

1. **Inicio de sesión:** Escribe un caso de prueba para iniciar sesión en la página. Prueba tanto con credenciales válidas como inválidas.

2. **Navegación:** Escribe casos de prueba para navegar por diferentes categorías de productos.

3. **Carrito de compras:** Escribe casos de prueba para agregar y eliminar productos del carrito de compras.

4. **Checkout:** Escribe un caso de prueba para el proceso de pago (checkout).

**Herramientas a utilizar:** Selenium, Java, TestNG y Maven.

Aquí tienes un ejemplo de cómo podría ser el código para el primer caso de prueba:

```java
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void testSuccessfulLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");

        driver.quit();
    }
}
```

Por favor, recuerda que este es solo un desafío de práctica y no tiene ninguna conexión con Sauce Labs más allá de usar su sitio de demostración para el desafío. ¡Buena suerte! 🍀.

Origen: Conversación con Bing, 19/12/2023
(1) github.com. https://github.com/bvisvanathan/SimplilearnTDD/tree/5e1e971bdce6251f53f69dd7c791fcc93759f3fc/src%2Ftest%2FLoginTest.java.
(2) es.wikipedia.org. https://es.wikipedia.org/wiki/Selenium.
