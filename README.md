Padroes de Projeto

1) Criacionais
2) Estruturais
3) Comportamentais

* Criacionais

1.Factory Method
-> O Factory method é um padrão de projeto criacional, que resolve o problema de criar objetos de produtos sem especificar suas classes concretas.
Utilizar quando nao souber de antemao os tipos e dependencias exatas dos objetos com os quais seu codigo deve funcionar.
Usar quando deseja economizar recursos do sistema reutilizando objetos existentes em vez de recria-los sempre
** Vou ter essa necessidade ao lidar com objetos grandes e pesados, como conexao com banco de dados, sistemas de arquivos e recursos de rede.
-> Identificação: Os métodos fábrica podem ser reconhecidos por métodos de criação, que criam objetos de classes concretas, mas os retornam como objetos de tipo ou interface abstrata.

Exempos de utilizacao:

java.util.Calendar#getInstance()
java.text.NumberFormat#getInstance()