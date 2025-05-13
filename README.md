<h1 align="center">ERP - Marcenaria Domínio</h1>



<div align="center">
  <strong>🚀 Sistema de Gestão para Marcenarias 📚</strong>
</div>

<div align="center">
  <p>Um sistema simples de ERP voltado à gestão de pedidos e clientes para uma marcenaria! 🎉</p>
  <p>Este projeto foi desenvolvido como parte da faculdade de Sistemas de Informação, com foco na aplicação prática do desenvolvimento em Java.</p>
  <p>Explore, colabore e divirta-se! 😄</p>
</div>

## 📖 Índice

- [Visão Geral](#visão-geral)
- [Tecnologias](#tecnologias)
- [Configuração do Ambiente](#configuração-do-ambiente)
- [Como Contribuir](#como-contribuir)

## 🔭 Visão Geral

O **ERP Marcenaria** é uma aplicação básica em Java que simula a gestão de clientes e pedidos em uma marcenaria. Seu objetivo é aplicar conceitos de banco de dados relacionais e lógica de programação orientada a objetos.

Atualmente, o sistema conta com:

- Cadastro de clientes
- Registro de pedidos
- Associação entre pedidos e clientes


## 💻 Tecnologias

- [Java JDK 18](https://www.oracle.com/java/technologies/javase/jdk18-archive-downloads.html)
- [Swing (UI Designer do IntelliJ)](https://www.jetbrains.com/help/idea/gui-designer.html)
- IDE: [IntelliJ IDEA](https://www.jetbrains.com/idea/)
- Git para versionamento

## ⚙️ Configuração do Ambiente

### Pré-requisitos
- **JDK 18** ([Download oficial](https://www.oracle.com/java/technologies/javase/jdk18-archive-downloads.html))
- **Git** ([Instalação](https://git-scm.com/downloads))
- **IDE recomendada**: IntelliJ IDEA ([Community Edition](https://www.jetbrains.com/idea/download/))

### 🛠️ Passos para Configuração

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/erp-marcenaria.git
   cd erp-marcenaria

2. **Abra no IntelliJ IDEA**

Siga estes passos para abrir o projeto no IntelliJ IDEA:

2. 1. Inicie o IntelliJ IDEA
2. 2. No menu principal, clique em:
   **File > Open**
2. 3. Navegue até o diretório onde clonou o repositório
2. 4. Selecione a pasta `erp-marcenaria`
2. 5. Clique no botão `OK` para abrir o projeto

Dica: Se for a primeira vez abrindo o projeto, o IntelliJ pode levar alguns minutos para indexar os arquivos.

3. **Configure o JDK**

Siga estas etapas para configurar o JDK no IntelliJ IDEA:

3. 1. No menu principal, selecione:
**File > Project Structure**

3. 2. Na janela que será aberta:
- No painel esquerdo, selecione `Project`

3. 3. Configurações do projeto:
- Em `Project SDK`:
  ```
  Clique no dropdown e selecione "JDK 18"
  ```
  - Se não aparecer, clique em `Add JDK...` e navegue até o diretório de instalação do JDK 18

- Em `Project language level`:
  ```
  Selecione "18" no dropdown
  ```

4. 4. Confirme as alterações:
- Clique em `Apply` e depois em `OK`

4. **Execute o projeto**
   
4. 1. No painel de projeto, navegue até:
      **src/Main.java**
    
4. 2. Clique com o botão direito no arquivo e selecione:
      **Run 'Main.main()'**

4. **Solução de Problemas Comuns**

   - Erro "JDK not found":
   1. Verifique se o JDK 18 está instalado
   2. Confirme o caminho em:
      **File > Project Structure > SDKs**

   - Classes não encontradas:
     **Build > Rebuild Project**

Observação: Certifique-se que o JDK 18 está corretamente instalado em seu sistema antes desta configuração.

## 🤝 Como Contribuir

Se você deseja contribuir para o projeto, siga estas etapas:

1. Faça um fork do repositório e clone-o em sua máquina local.
2. Crie uma nova branch para suas modificações:
   ```
   git checkout -b minha-branch
   ```
3. Faça as modificações desejadas e adicione-as ao stage:
   ```
   git add .
   ```
4. Faça um commit das suas alterações:
   ```
   git commit -m "Minhas modificações"
   ```
5. Envie suas alterações para o repositório remoto:
   ```
   git push origin minha-branch
   ```
6. Abra um pull request para que suas modificações sejam revisadas e incorporadas ao projeto.
---

💡 Dúvidas? Sugestões? Sinta-se à vontade para contribuir ou entrar em contato!
