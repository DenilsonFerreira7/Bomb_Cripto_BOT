# **Bomb_Cripto_BOT**

BOT que ajudou a farmar criptomoedas automaticamente em JAVA.

Hoje não funciona mais, pois o game não da mais lucro.

## Poder de farme

Esse BOT era capaz de minerar em uma conta automaticamente, com proteção automatica contra desconect por ausencia.

Conseguia minerar 24h, assim tirando 100% do proveito da conta com os heros.

Foi utilizado por mais de 3 meses e sofreu várias atualizações.

## Interface e funcionalidades

![BombInterfacepng](https://user-images.githubusercontent.com/88104045/191835532-52ba9e0d-c80e-478d-bcb2-6f116d5e122c.png)

A interface foi feita com o NetBeans, se tratava de um progama desktop. 

Nele era possivel fazer várias alterações em sua funcionalidade como:

- Alterar velocidade de movimento do mouse.
- Selecionar o tempo que os heros descançava.
- Resolução da tela.
- Modo de jogo.
- Iniciar.
- Parar (esse botão não foi concluido para funcionar).

O progama funcionava de forma automatica, tendo apenas que o usuario configurar na interface a forma de jogo antes de inciar.

Para funcionar de forma correta a resolução tinha que ser compativel com a do monitor, caso contrario o bot não funcionava corretamente, pois contem um sistema de mapeamento da tela utilizando a resolução progamada que foi feito em 720p e 1080p.

O anti desconect funcionava de forma mapeada, sempre que o jogo percebia ausencia ele desconectava, com isso, o bot foi mapeado para clicar automaticamente nos botões e se conectar novamente.

## Linguagem de progamação

Foi utilizado o **JAVA** para a base do sistema.

Para fazer a funcionalidade foi utilizado uma estrutura de repetição infinita, com clicks na tala, automatizados por mapeamento manual, por esse motivo qual quer resolução fora da progamada ocasionaria problema na mineração do jogo.

Nele existem 2 loops infinitos, que correspondem a resolução selecionada, para cada resolução há um mapeamento diferente, mas com a mesma funcionalidade.

Para interagir com o usuário e o mesmo ter poder de personalização, foi necessario fazer umas adaptações com a interface e o sistema, pois para melhor visualização e facilidade do usuário, houve a necessidade de converção de String para int, para o sistema conseguir puxar os valores selecionado pelo usuário.

O codigo não está separado por classes e não foi utilizado metodos de melhores práticas, pois eu utilizava apenas para uso pessoal e compartilhava com alguns amigos, mas havia inteção da minha parte de organizar o codigo, porem o jogo faliu antes que eu conseguisse deixar o codigo limpo.

## Considerações finais

Eu não tinha intenção de jogar esse codigo no github, mas eu fiz ele com muito esforço e estudo, aprimorei muito meu conhecimento em JAVA graças a esse progaminha que foi feito para uma brincadeira seria, que surgiu por uma necessidade. Hoje o codigo não funciona mais, mas… Vou deixar aqui para estudo e utilizar para meu portifolio, pois se trata do meu primeiro progama criado do zero com java. #Obrigado bombcripto XD



