package Museo;

import java.time.Year;
        public class Autore {
        private String Nome;
        private PrimaODopoCristo PrimaODopoCristo;
        private Year NascitaAutore;
        private Year MorteAutore;

        Autore (String Nome, PrimaODopoCristo PrimaODopoCristo, int NascitaAutore, int MorteAutore){
            this.Nome = Controlli_String.ControllaNomeAutore(Nome);
            this.PrimaODopoCristo=PrimaODopoCristo;
            this.NascitaAutore= Controlli_Year.ControllaAnno(Year.of(NascitaAutore));
            this.MorteAutore= Controlli_Year.ControllaAnno(Year.of(MorteAutore));
        }

        public String getNome(){
            return Nome;
        }

        public Year getNascitaAutore(){
            return NascitaAutore;
        }

        public Year getMorteAutore(){
            return MorteAutore;
        }

        public void setNome(int Codice, String Nome){
            Controlli_Int.Controla_codice(Codice);
            this.Nome = Controlli_String.ControllaNomeAutore(Nome);
        }

        public void setPrimaODopoCristo(int Codice, PrimaODopoCristo PrimaODopoCristo){
            Controlli_Int.Controla_codice(Codice);
            this.PrimaODopoCristo = PrimaODopoCristo;
        }

        public void setNascitaAutore(int Codice, int NascitaAutore){
            Controlli_Int.Controla_codice(Codice);
            this.NascitaAutore= Controlli_Year.ControllaAnno(Year.of(NascitaAutore));

        }

        public void setMorteAutore(int Codice, int MorteAutore){
            Controlli_Int.Controla_codice(Codice);
            this.MorteAutore = Controlli_Year.ControllaAnno(Year.of(MorteAutore));

        }

        @Override
        public String toString(){
            return Nome + "[ Nato nel: " + NascitaAutore + " - Morto nel: " + MorteAutore + " " + PrimaODopoCristo +"]";


        }



    }
