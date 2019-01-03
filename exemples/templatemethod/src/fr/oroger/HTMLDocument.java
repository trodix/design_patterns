package fr.oroger;

public class HTMLDocument extends DocumentGenerator {
    @Override
    void addHeader() {
        System.out.println("<html><head>TITRE</head>");
    }

    @Override
    void addBody() {
        System.out.println("<body>HELLO WORLD</body>");
    }

    @Override
    void addFooter() {
        System.out.println("</html");
    }
}
