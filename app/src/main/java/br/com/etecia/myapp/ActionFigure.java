package br.com.etecia.myapp;

public class ActionFigure {

    private String nomedaimagem;
    private int imagem;

    public ActionFigure(String nomedaimagem, int imagem) {
        this.nomedaimagem = nomedaimagem;
        this.imagem = imagem;
    }

    public String getNomedaimagem() {
        return nomedaimagem;
    }

    public void setNomedaimagem(String nomedaimagem) {
        this.nomedaimagem = nomedaimagem;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
