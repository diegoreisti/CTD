public class FacadeFactory {
    private FlyweightRoupas flyweightRoupas;

    public FacadeFactory(){
        this.flyweightRoupas = new FlyweightRoupas();
    }


    public void criarRoupa(String[][] listaRoupas){
        for (int i = 0; i < listaRoupas.length; i++){
            if(listaRoupas[i][0].equals("P") && listaRoupas[i][1].equals("camisa")){
                flyweightRoupas.obterRoupa(listaRoupas[i][0],listaRoupas[i][1],true, true);
            } else if (listaRoupas[i][0].equals("M")) {
                flyweightRoupas.obterRoupa(listaRoupas[i][0]);
            } else if (listaRoupas[i][0].equals("G")) {
                flyweightRoupas.obterRoupa(listaRoupas[i][0]);
            }
        }
        System.out.println(flyweightRoupas.getRoupaMap());
    }

}
