package Museo;

import java.time.Year;
        public class Autore {
        private String Nome;
        private PrimaODopoCristo PrimaODopoCristo;
        private Year NascitaAutore;
        private Year MorteAutore;

        Autore (String Nome, PrimaODopoCristo PrimaODopoCristo, int NascitaAutore, int MorteAutore){
            this.Nome=Controlli.ControllaNomeAutore(Nome);
            this.PrimaODopoCristo=PrimaODopoCristo;
            this.NascitaAutore=Controlli.ControllaAnno(Year.of(NascitaAutore));
            this.MorteAutore=Controlli.ControllaAnno(Year.of(MorteAutore));
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


        @Override
        public String toString(){
            return Nome + "[ Nato nel: " + NascitaAutore + " - Morto nel: " + MorteAutore + " " + PrimaODopoCristo +"]";


        }



    }
