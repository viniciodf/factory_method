Padroes de Projetos

1) Criacionais
2) Estruturais
3) Comportamentais

* Criacionais

1.Factory Method
-> O Factory method é um padrão de projeto criacional, que resolve o problema de criar objetos de produtos sem especificar suas classes concretas.
Utilizar quando nao souber de antemao os tipos e dependencias exatas dos objetos com os quais seu codigo deve funcionar
User quando deseja economizar recurdos do sistema reutilizando objetos existentes em vez de recrialos sempre
** Vou ter essa necessidade ao lidar com objetos grandes e pesados, como conexao com banco de dados, sistemas de arquivos e recursos de rede.

Exempos de utilizacao:
java.util.Calendar#getInstance()
java.text.NumberFormat#getInstance()