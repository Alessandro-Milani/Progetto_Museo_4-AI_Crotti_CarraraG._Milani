    import java.time.Year;
    public class Autore {
        private String Nome;
        private PrimaODopoCristo PrimaODopoCristo;
        private Year NascitaAutore;
        private Year MorteAutore;

        Autore (String Nome, PrimaODopoCristo PrimaODopoCristo, int NascitaAutore, int MorteAutore){
            this.Nome=Nome;
            this.PrimaODopoCristo=PrimaODopoCristo;
            this.NascitaAutore= Year.of(NascitaAutore);
            if (MorteAutore == 0){
                this.MorteAutore=null;
            }
            else {
                this.MorteAutore=Year.of(MorteAutore);

            }
        }

        @Override
        public String toString(){
            return Nome + "[" + NascitaAutore + " - " + MorteAutore + " " + PrimaODopoCristo +"]";


        }



    }
