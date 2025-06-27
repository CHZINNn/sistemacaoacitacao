package entidades;

public class ServidorPublico {
        private int matricula;
        private String nome;
        private String foto;
        private String orgao;
        private String vinculo;
        private double salario;
        private int idade;
        private int tempoDeContribuicao;
        private String cargo;
        private String telefone;
        private String celular;
        private String cpf;
        private String lotacao;
        private String email;
        private double horasExtras;

        public ServidorPublico(){}


        public ServidorPublico(int matricula, String nome, String cargo){
                this.matricula = matricula;
                this.nome = nome;
                this.cargo = cargo;
        }

        public ServidorPublico(int matricula, String nome, String orgao,  String cargo, String lotacao, String email, double salario) {
                this.matricula = matricula;
                this.nome = nome;
                this.orgao = orgao;
                this.salario = salario;
                this.cargo = cargo;
                this.email = email;
                this.lotacao = lotacao;
        }

        public ServidorPublico(int matricula, String nome, String foto, String orgao, String vinculo, double salario, int idade, int tempoDeContribuicao, String cargo, String telefone, String celular, String cpf, String lotacao, String email, double horasExtras) {
                this.matricula = matricula;
                this.nome = nome;
                this.foto = foto;
                this.orgao = orgao;
                this.vinculo = vinculo;
                this.salario = salario;
                this.idade = idade;
                this.tempoDeContribuicao = tempoDeContribuicao;
                this.cargo = cargo;
                this.telefone = telefone;
                this.celular = celular;
                this.cpf = cpf;
                this.lotacao = lotacao;
                this.email = email;
                this.horasExtras = horasExtras;
        }



        public double getHorasExtras() {
                return horasExtras;
        }

        public void setHorasExtras(double horasExtras) {
                this.horasExtras = horasExtras;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getLotacao() {
                return lotacao;
        }

        public void setLotacao(String lotacao) {
                this.lotacao = lotacao;
        }

        public int getMatricula() {
                return matricula;
        }

        public void setMatricula(int matricula) {
                this.matricula = matricula;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getFoto() {
                return foto;
        }

        public void setFoto(String foto) {
                this.foto = foto;
        }

        public String getOrgao() {
                return orgao;
        }

        public void setOrgao(String orgao) {
                this.orgao = orgao;
        }

        public String getVinculo() {
                return vinculo;
        }

        public void setVinculo(String vinculo) {
                this.vinculo = vinculo;
        }

        public double getSalario() {
                return salario;
        }

        public void setSalario(double salario) {
                this.salario = salario;
        }

        public int getIdade() {
                return idade;
        }

        public void setIdade(int idade) {
                this.idade = idade;
        }

        public int getTempoDeContribuicao() {
                return tempoDeContribuicao;
        }

        public void setTempoDeContribuicao(int tempoDeContribuicao) {
                this.tempoDeContribuicao = tempoDeContribuicao;
        }

        public String getCargo() {
                return cargo;
        }

        public void setCargo(String cargo) {
                this.cargo = cargo;
        }

        public String getTelefone() {
                return telefone;
        }

        public void setTelefone(String telefone) {
                this.telefone = telefone;
        }

        public String getCelular() {
                return celular;
        }

        public void setCelular(String celular) {
                this.celular = celular;
        }

        public String getCpf() {
                return cpf;
        }

        public void setCpf(String cpf) {
                this.cpf = cpf;
        }


        public double calcularSalarioHorasExtras (double horasTrabalhas, double valorHora){
                double salarioMensal = salario + (horasTrabalhas*valorHora);
                horasExtras = salarioMensal;
                return (salarioMensal);
        }

        public double calcularSalarioTotal(double salario){
                salario = salario + horasExtras;
                return salario;
        }
        public double calcularNumeros (double... numeros){
                double soma= 0;
                for(double numero : numeros){
                        soma += numero;
                }
                return soma;
        }

        @Override
        public String toString() {
                return "ServidorPublico{" +
                        "matricula=" + matricula +
                        ", nome='" + nome + '\'' +
                        ", orgao='" + orgao + '\'' +
                        ", salario=" + salario +
                        ", cargo='" + cargo + '\'' +
                        ", lotacao='" + lotacao + '\'' +
                        '}';
        }
}