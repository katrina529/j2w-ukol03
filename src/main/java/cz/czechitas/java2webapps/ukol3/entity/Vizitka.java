package cz.czechitas.java2webapps.ukol3.entity;

import java.util.Objects;

public class Vizitka {
    private String jmeno;
    private String firma;
    private String ulice;
    private String mesto;
    private String obecPsc;
    private String email;
    private Integer telefon;
    private String web;

    public Vizitka(String jmeno, String firma, String ulice, String mesto, String obecPsc, String email, Integer telefon, String web) {
        this.jmeno = jmeno;
        this.firma = firma;
        this.ulice = ulice;
        this.mesto = mesto;
        this.obecPsc = obecPsc;
        this.email = email;
        this.telefon = telefon;
        this.web = web;

    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = Objects.requireNonNull("jmeno");
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = Objects.requireNonNull("firma");
    }

    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        this.ulice = Objects.requireNonNull("ulice");
    }

    public String getObecPsc() {
        return obecPsc;
    }

    public void setObecPsc(String obecPsc) {
        this.obecPsc = Objects.requireNonNull("obecPsc");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefon() {
        return telefon;
    }

    public void setTelefon(Integer telefon) {
        this.telefon = telefon;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getCelaAdresa() {
        return ulice + " " + obecPsc;
    }


}
