package com.company;

public class MERCEARIA {

        private int qtd;
        private String unidade;
        private String descricao;
        private double p_unid;
        private double iva;


        //construtor
        public MERCEARIA(int qtd, String unidade, String descricao, double p_unid, double iva){
            this.qtd = qtd;
            this.unidade = unidade;
            this.descricao = descricao;
            this.p_unid = p_unid;
            this.iva = iva;

        }


        //setters
        public void setQtd(int qtd){
            this.qtd = qtd;
        }
        public void setUnidade(String unidade){
            this.unidade = unidade;
        }
        public void setDescricao(String descricao){
            this.descricao = descricao;
        }
        public void setP_unid(double p_unid){
            this.p_unid = p_unid;
        }
        public void setIva(double iva){
            this.iva = iva;
        }


        //getters
        public int getQtd(){
            return this.qtd = qtd;
        }
        public String getUnidade(){
            return this.unidade = unidade;
        }
        public String getDescricao(){
            return this.descricao = descricao;
        }
        public double getP_unid(){
            return this.p_unid = p_unid;
        }
        public double getIva(){
            return this.iva = iva;
        }
}
