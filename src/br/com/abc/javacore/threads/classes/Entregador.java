package br.com.abc.javacore.threads.classes;

public class Entregador implements Runnable {
    private ListaMembros listaMembros;

    public Entregador(ListaMembros listaMembros) {
        this.listaMembros = listaMembros;
    }

    @Override
    public void run() {
        String nomeThread = Thread.currentThread().getName();
        System.out.println(nomeThread + "Comecando o trabalho de entrega");
        int qtdPendente = listaMembros.getEmailsPendentes();
        boolean aberta = listaMembros.isAberta();
        while(aberta || qtdPendente > 0){
            try{
                String email = listaMembros.obterEmailMembro();
                if(email != null){
                    System.out.println(nomeThread+" enviando email para "+email);
                    Thread.sleep(2000);
                    System.out.println("envio para email "+email+" concluido com sucesso");
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            aberta = listaMembros.isAberta();
            qtdPendente = listaMembros.getEmailsPendentes();
        }
        System.out.println("atividades finalizadas");
    }
}
