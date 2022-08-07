public class Main {
    public static void main(String[] args) throws SerieNaoHabilitadaException {

        Serie s1 = new Serie("Two And a Half Man");
        Serie s2 = new Serie("The Big Bang Theory");
        Serie s3 = new Serie("Mind Hunter");


        SerieProxy sp1 = new SerieProxy();
        sp1.setQtdViews(5);
        System.out.println(sp1.getSerie(s1));
        System.out.println(sp1.getQtdViews());

    }
}
