public class Main{
    public static void main(String[] args) {
        Gerente gerente = new Gerente(
            "Wanessa Dias",
            "000.000.006-00",
            "5531985880803",
            "Rua Pernambuco, 488, Savassi"
        );
        Estacionamento e = new Estacionamento();
        e.estacionar("ABC-1234", "Fusca");
        e.estacionar("DEF-5678", "Brasília");
        e.estacionar("GHI-9101", "UNO");
        e.estacionar("KJH-2469", "Lamburguini");
        e.estacionar("ABF-1111", "Moto");
        e.estacionar("TRY-0207"), "ARGO";
        e.estacionar("QNU-2222"), "Onix";
        e.estacionar("OPA-5670"), "Marea";
        e.estacionar("KJI-9923"), "Bugaty";
        System.out.printl("Hello world!");
    }
}