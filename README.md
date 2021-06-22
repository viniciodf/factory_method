Padroes de Projeto

1) Criacionais
2) Estruturais
3) Comportamentais

* Criacionais

1.Factory Method

O que é:
O Factory Method é um padrão criacional de projeto que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados.

Aplicabilidade:
Use o Factory Method quando não souber de antemão os tipos e dependências exatas dos objetos com os quais seu código deve funcionar.
Use o Factory Method quando desejar fornecer aos usuários da sua biblioteca ou framework uma maneira de estender seus componentes internos.
Use o Factory Method quando deseja economizar recursos do sistema reutilizando objetos existentes em vez de recriá-los sempre.

Identificação:
Os métodos fábrica podem ser reconhecidos por métodos de criação, que criam objetos de classes concretas, mas os retornam como objetos de tipo ou interface abstrata.

Exempos de utilizacao:
java.util.Calendar#getInstance()
java.text.NumberFormat#getInstance()