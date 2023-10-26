package ScreeMatch.classes;


public class Titulo {
        /*================ATRIBUTOS================*/
        private String nome;
        private int lançamento;
        private String diretor;
        private int totalDeMedia;
        private double media;
        private int duraçãoMinutos;

        /*================================================*/
        /*===================Get & Set====================*/

        public void setDuraçãoMinutos(int duraçãoMinutos) {
                this.duraçãoMinutos = duraçãoMinutos;
        }

        public int getDuraçãoMinutos() {
                return duraçãoMinutos;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }
        public void setLançamento(int lançamento) {
                this.lançamento = lançamento;
        }
        public void setDiretor(String diretor) {
                this.diretor = diretor;
        }

        /*================================================*/
        /*================ Metodos ========================*/

        public void somaMedia(double nota) {
                media += nota;
                totalDeMedia++;

        }
        public Double rating(){
                return media / totalDeMedia;
        }
        public void exibeFicha(){
                System.out.println("Nome do filme: "+ nome);
                System.out.println("data de lançamento: "+lançamento);
                System.out.println("Diretor: "+ diretor);
                System.out.println("Avaliação geral: "+ rating());
                System.out.println("Total de avaliações: "+totalDeMedia);


        }
/*================================================================*/
    }

