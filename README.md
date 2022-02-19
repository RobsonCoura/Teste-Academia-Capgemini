# Teste-Academia-Capgemini
Repositório criado totalmente dedicado para a solução do "Desafio De Programação" sugerido pela Academia Capgemini

<hr>

 •  Linguagem: Java
 
 •  Ferramenta: Eclipse(IDE)
 
 •  Versionamento: Git
 <hr>


## Boas Práticas: Passo a passo como executar o JUnit Test 5

8. <a href="#run">Execute os testes</a>
9. <a href="#ref">Referências</a>




1) No lado esquerdo superior, na Guia **Project**, na Package **src/test/java**, clique com o botão direito do mouse sobre o teste que você deseja executar e clique na opção **Run As->JUnit Test**.

<div align="center"><img src="https://i.imgur.com/Ol2N93J.png" title="source: imgur.com" /></div>


2) Para acompanhar os testes, ao lado da Guia **Project**, clique na Guia **JUnit**.

<div align="center"><img src="https://i.imgur.com/JvC0kS3.png" title="source: imgur.com" /></div>

 3) Se todos os testes passarem, a Guia do JUnit ficará com uma faixa verde (janela 01). Caso algum teste não passe, a Guia do JUnit ficará com uma faixa vermelha (janela 02). Neste caso, observe o item <b>Failure Trace</b> para identificar o (s) erro (s).

<div align="center">
<table width=100%>
	<tr>
		<td width=50%><div align="center"><img src="https://i.imgur.com/TeiTjQW.png" title="source: imgur.com" /></div>
		<td width=50%><div align="center"><img src="https://i.imgur.com/7b13sd6.png" title="source: imgur.com" /></div>
	</tr>
	<tr>
		<td><div align="center">Janela 01: <i> Testes aprovados.
		<td><div align="center">Janela 02: <i> Testes reprovados.
	</tr>
</table>
</div>
Ao escrever testes, sempre verifique se a importação dos pacotes do JUnit na Classe de testes estão corretos. O JUnit 5 tem como pacote base <b><i>org.junit.jupiter.api</i></b>.




<h2 id="ref">Referências</h2>

<a href="https://docs.spring.io/spring-framework/docs/current/reference/html/testing.html#testing-introduction" target="_blank">Documentação Oficial do Spring Testing</a>

<a href="https://junit.org/junit5/" target="_blank">Página Oficial do JUnit5</a>

<a href="https://junit.org/junit5/docs/current/user-guide/" target="_blank">Documentação Oficial do JUnit 5</a>

