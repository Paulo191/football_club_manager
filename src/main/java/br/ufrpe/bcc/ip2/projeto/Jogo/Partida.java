package br.ufrpe.bcc.ip2.projeto.Jogo;

import br.ufrpe.bcc.ip2.projeto.model.Clube;

import java.security.SecureRandom;

public class Partida {
    //NÚMEROS ALEATÓRIOS
    private int cartaoAmareloTimeCasa; //Número aleatório que varia de 1 a 50 (49 <= cartão)
    private int cartaoAmareloTimeVisitante; //Número aleatório que varia de 1 a 50 (49 <= cartão)

    private int cartaoVermelhoTimeCasa; //Número aleatório que varia de 1 a 200 (199 <= cartão)
    //Aumenta exponencialmente o número aleatório 'gol' do adversário, assim:
    //1 cartão vermelho: +1
    //2 cartões vermelhos: +2
    //3 cartões vermelhos: +4
    //4 cartões vermelhos: +8
    private int cartaoVermelhoTimeVisitante; //Número aleatório que varia de 1 a 200 (199 <= cartão)
    //Aumenta exponencialmente o número aleatório 'gol' do adversário, assim:
    //1 cartão vermelho: +1
    //2 cartões vermelhos: +2
    //3 cartões vermelhos: +4
    //4 cartões vermelhos: +8

    private int lesaoTimeCasa; //Número aleatório que varia de 1 a 75 (74 <= lesão)
    private int lesaoTimeVisitante; //Número aleatório que varia de 1 a 75 (74 <= lesão)

    private int golTimeCasa; //Número aleatório que varia de 1 a 200 (193 <= gol)
    private int golTimeVisitante; //Número aleatório que varia de 1 a 200 (193 <= gol)

    //|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    //NÚMEROS DE CONDIÇÕES DO JOGO
    private Clube timeCasa, timeVisitante;

    private boolean casaTimeCasa; //Diminui em 1 o número aleatório 'gol' do adversário

    private boolean casaTimeVisitante; //Diminui em 1 o número aleatório 'gol' do adversário

    private int estiloJogoTimeCasa; //Varia de -1 a 1, sendo:
    //-1 (defensivo): diminui em 1 o número aleatório 'gol' do time e do aversário
    //0 (balanceado): não altera nada
    //1 (atacante): aumenta em 1 o número aleatório 'gol' do time e do adversário

    private int estiloJogoTimeVisitante; //Varia de -1 a 1, sendo:
    //-1 (defensivo): diminui em 1 o número aleatório 'gol' do time e do aversário
    //0 (balanceado): não altera nada
    //1 (atacante): aumenta em 1 o número aleatório 'gol' do time e do adversário

    private int desarmeTimeCasa; //Varia de -1 a 1, sendo:
    //-1 (cauteloso): diminui cartaoAmarelo em 1; diminui cartaoVermelho em 2; aumenta 'gol' do adversário em 1
    //0 (normal): não altera nada
    //1 (duro): aumenta cartãoAmarelo em 2; aumenta cartãoVermelho em 1; diminui 'gol' do adversário em 1

    private int desarmeTimeVisitante; //Varia de -1 a 1, sendo:
    //-1 (cauteloso): diminui cartaoAmarelo em 1; diminui cartaoVermelho em 2; aumenta 'gol' do adversário em 1
    //0 (normal): não altera nada
    //1 (duro): aumenta cartãoAmarelo em 2; aumenta cartãoVermelho em 1; diminui 'gol' do adversário em 1

    private int qualidadeTimeCasa; //O time que tiver qualidade média superior
    //diminui em 1 o número aleatório 'gol' do adversário e aumenta em 1 o seu

    private int qualidadeTimeVisitante; //O time que tiver qualidade média superior
    //diminui em 1 o número aleatório 'gol' do adversário e aumenta em 1 o seu

    private int staminaTimeCasa; //O time que tiver stamina média superior
    //diminui em 1 o número aleatório 'gol' do adversário e aumenta em 1 o seu

    private int staminaTimeVisitante; //O time que tiver stamina média superior
    //diminui em 1 o número aleatório 'gol' do adversário e aumenta em 1 o seu

    private int moralTimeCasa; //Aumenta ou diminui a probabilidade do time fazer um gol, assim:
    //1: -2
    //2: -1
    //3: 0
    //4: +1
    //5: +2

    private int moralTimeVisitante; //Aumenta ou diminui a probabilidade do time fazer um gol, assim:
    //1: -2
    //2: -1
    //3: 0
    //4: +1
    //5: +2

    //Construtor
    public Partida(Clube timeCasa, Clube timeVisitante) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
    }

    //Cria um objeto da classe SecureRandom
    SecureRandom numeroAleatorio = new SecureRandom();


    //Getters e Setters
    public Clube getTimeCasa() {
        return timeCasa;
    }

    public void setTimeCasa(Clube timeCasa) {
        this.timeCasa = timeCasa;
    }

    public Clube getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(Clube timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public int getCartaoAmareloTimeCasa() {
        return cartaoAmareloTimeCasa;
    }

    public void setCartaoAmareloTimeCasa() {
        this.cartaoAmareloTimeCasa = numeroAleatorio.nextInt(50);
    }

    public int getCartaoAmareloTimeVisitante() {
        return cartaoAmareloTimeVisitante;
    }

    public void setCartaoAmareloTimeVisitante() {
        this.cartaoAmareloTimeVisitante = numeroAleatorio.nextInt(50);
    }

    public int getCartaoVermelhoTimeCasa() {
        return cartaoVermelhoTimeCasa;
    }

    public void setCartaoVermelhoTimeCasa() {
        this.cartaoVermelhoTimeCasa = numeroAleatorio.nextInt(200);
    }

    public int getCartaoVermelhoTimeVisitante() {
        return cartaoVermelhoTimeVisitante;
    }

    public void setCartaoVermelhoTimeVisitante() {
        this.cartaoVermelhoTimeVisitante = numeroAleatorio.nextInt(200);
    }

    public int getLesaoTimeCasa() {
        return lesaoTimeCasa;
    }

    public void setLesaoTimeCasa() {
        this.lesaoTimeCasa = numeroAleatorio.nextInt(75);
    }

    public int getLesaoTimeVisitante() {
        return lesaoTimeVisitante;
    }

    public void setLesaoTimeVisitante() {
        this.lesaoTimeVisitante = numeroAleatorio.nextInt(75);
    }

    public int getGolTimeCasa() {
        return golTimeCasa;
    }

    public void setGolTimeCasa() {
        this.golTimeCasa = numeroAleatorio.nextInt(200);
    }

    public int getGolTimeVisitante() {
        return golTimeVisitante;
    }

    public void setGolTimeVisitante() {
        this.golTimeVisitante = numeroAleatorio.nextInt(200);
    }

    public boolean isCasaTimeCasa() {
        return casaTimeCasa;
    }

    public void setCasaTimeCasa() {
        this.casaTimeCasa = true;
    }

    public boolean isCasaTimeVisitante() {
        return casaTimeVisitante;
    }

    public void setCasaTimeVisitante() {
        this.casaTimeVisitante = false;
    }

    public int getEstiloJogoTimeCasa() {
        return estiloJogoTimeCasa;
    }

    public void setEstiloJogoTimeCasa(int estiloJogoTimeCasa) {
        this.estiloJogoTimeCasa = estiloJogoTimeCasa;
    }

    public int getEstiloJogoTimeVisitante() {
        return estiloJogoTimeVisitante;
    }

    public void setEstiloJogoTimeVisitante(int estiloJogoTimeVisitante) {
        this.estiloJogoTimeVisitante = estiloJogoTimeVisitante;
    }

    public int getDesarmeTimeCasa() {
        return desarmeTimeCasa;
    }

    public void setDesarmeTimeCasa(int desarmeTimeCasa) {
        this.desarmeTimeCasa = desarmeTimeCasa;
    }

    public int getDesarmeTimeVisitante() {
        return desarmeTimeVisitante;
    }

    public void setDesarmeTimeVisitante(int desarmeTimeVisitante) {
        this.desarmeTimeVisitante = desarmeTimeVisitante;
    }

    public int getQualidadeTimeCasa() {
        return qualidadeTimeCasa;
    }

    public void setQualidadeTimeCasa(int qualidadeTimeCasa) {
        this.qualidadeTimeCasa = qualidadeTimeCasa;
    }

    public int getQualidadeTimeVisitante() {
        return qualidadeTimeVisitante;
    }

    public void setQualidadeTimeVisitante(int qualidadeTimeVisitante) {
        this.qualidadeTimeVisitante = qualidadeTimeVisitante;
    }

    public int getStaminaTimeCasa() {
        return staminaTimeCasa;
    }

    public void setStaminaTimeCasa(int staminaTimeCasa) {
        this.staminaTimeCasa = staminaTimeCasa;
    }

    public int getStaminaTimeVisitante() {
        return staminaTimeVisitante;
    }

    public void setStaminaTimeVisitante(int staminaTimeVisitante) {
        this.staminaTimeVisitante = staminaTimeVisitante;
    }

    public int getMoralTimeCasa() {
        return moralTimeCasa;
    }

    public void setMoralTimeCasa(int moralTimeCasa) {
        this.moralTimeCasa = moralTimeCasa;
    }

    public int getMoralTimeVisitante() {
        return moralTimeVisitante;
    }

    public void setMoralTimeVisitante(int moralTimeVisitante) {
        this.moralTimeVisitante = moralTimeVisitante;
    }

    //Por que um bloco for não funciona aqui?
}