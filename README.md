# :computer: :computer_mouse: :coffee: Cadastro-de-lista-de-funcion-rios
Neste sistema, utilizei os conceitos aprendidos na aula de lista. Foi criada uma classe Funcionário e por meio dela, foi intanciados objetos e armazenados 
em uma lista "listFunc". Para checagem do id (atributo esse que faz parte da classe Funcionário), foi criada uma função checagemId que retorna um tipo boolean. 
A função consiste em converter a list em stream() que é um tipo especial do java que aceita funções de alta ordem (expressões lambda) e em seguida 
utiliza o metodo filter() com a essa expressão para checar se o valor do id do objeto é igual ao valor digitado, caso seja igual, ele retorna esse valor diferente de null
mostrando que há um id com determinado valor. Se esse valor não existir, ele retorna o valor null permitindo que possamos prosseguir para o próximo passo. para a checagem
do id para efetuar um aumento do salário por meio de uma porcentagem, foi criado também uma função chamada posicao() para checar as posições da lista (lista.size()) e analisar
se o id que estamos digitando existe no objeto da lista, caso tenha, ele pede para adicionar uma porcentagem para o aumento se não, ele retorna que id não foi encontrado.
nesse processo, utilizei um "do {} while()" para ele testar as condições e enquanto o valor do id não fosse encontrado, ele continuasse a pedir para digitar o valor do id.
