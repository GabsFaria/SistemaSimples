public class Cliente {

        private String nome;
        private String idade;
        private String rg;

        public Cliente(){

        }

        public String getRg() {
            return rg;
        }

        public String getIdade() {
            return idade;
        }

        public String getNome() {
            return nome;
        }

        public void setRg(String rg) {
            this.rg = rg;
        }

        public void setIdade(String idade) {
            this.idade = idade;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
}
