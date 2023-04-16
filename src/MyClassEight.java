public class MyClassEight {
    public static void main(String[] args) {
        String cssLocators = "CSS селектори: #id, name, .class, tagname, [attribute=value] - вони ефективні для пошуку елементів на сторінці.";
        cssLocators += "XPath локатори: //tagname[@attribute='value'], //tagname[contains(@attribute, 'value')], //tagname[text()='value'] - XPath локатори дозволяють шукати елементи за допомогою складніших шаблонів.";
        cssLocators += "Локатори за текстом: LinkText, PartialLinkText - дозволяють знаходити елементи за текстом.";

        String xpathLocators = "XPath локатори для веб-елементів на табі Actions GitHub:\n";
        xpathLocators += "Локатор для кнопки \"New workflow\": //a[@href='/actions/new-workflow']\n";
        xpathLocators += "Локатор для пошуку workflow: //input[@aria-label='Filter workflows']\n";
        xpathLocators += "Локатор для кнопки \"Run workflow\": //span[text()='Run workflow']/ancestor::button\n";
        xpathLocators += "Локатор для заголовка \"Manual triggers\": //h2[text()='Manual triggers']\n";
        xpathLocators += "Локатор для кнопки \"Approve\": //span[text()='Approve']/ancestor::button\n";

        System.out.println(cssLocators);
        System.out.println(xpathLocators);
    }
}
