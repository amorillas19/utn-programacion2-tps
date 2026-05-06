public class EditorVideo {

    public void exportar(String formato, Proyecto proyecto){
        Render r1 = new Render(formato);
        r1.setProyecto(proyecto);
        System.out.println(r1);
    }
}
