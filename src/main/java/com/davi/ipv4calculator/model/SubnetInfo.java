package com.davi.ipv4calculator.model;

public class SubnetInfo {

    private String rede;
    private String broadcast;
    private String primeiroHost;
    private String ultimoHost;
    private long quantidadeHost;
    private String tipoRede;
    private String binarioRede;
    private String wildCard;
    private String mascara;

    // GETTER AND SETTER

    public String getRede() {
        return rede;
    }

    public void setRede(String rede) {
        this.rede = rede;
    }

    public String getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(String broadcast) {
        this.broadcast = broadcast;
    }

    public String getPrimeiroHost() {
        return primeiroHost;
    }

    public void setPrimeiroHost(String primeiroHost) {
        this.primeiroHost = primeiroHost;
    }

    public String getUltimoHost() {
        return ultimoHost;
    }

    public void setUltimoHost(String ultimoHost) {
        this.ultimoHost = ultimoHost;
    }

    public long getQuantidadeHost() {
        return quantidadeHost;
    }

    public void setQuantidadeHost(long quantidadeHost) {
        this.quantidadeHost = quantidadeHost;
    }

    public String getTipoRede() {
        return tipoRede;
    }

    public void setTipoRede(String tipoRede) {
        this.tipoRede = tipoRede;
    }

    public String getBinarioRede() {
        return binarioRede;
    }

    public void setBinarioRede(String binarioRede) {
        this.binarioRede = binarioRede;
    }

    public String getWildCard() {
        return wildCard;
    }

    public void setWildCard(String wildCard) {
        this.wildCard = wildCard;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }
}
