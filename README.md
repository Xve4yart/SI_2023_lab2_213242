# SI_2023_lab2_213242
Андреј Трајчевски 213242
![cfg](https://github.com/Xve4yart/SI_2023_lab2_213242/assets/130246301/66adb72e-1cd7-4e23-8924-9671ab2b7b9b)
Цикломатичната комплексност е 11 бидејќи има 11 региони

Според every branch критериумот имаме 5 тест случаи:
1. Го тестираме условот со exception со user со вредност null. Пример user ќе ни биде празно(null).
2. Во allUsers да има корисник со ист mail и username со конкретниот user, и друг user кој ќе има различни username и password. Пример username="stefan@gmail.com", email="stefan@gmail.com", password="zxcv", username2="petar@outlook.com", email2="petar@outlook.com", password2="asdf"
3. Со username="Stefan", email="Стефан" и password="makedo()nija" ги исполнуваме условите во passwordot да има специјални карактери
4. Сакаме овој пат да нема специјални карактери, односно username="Stefan", email="Стефан" и password="makedonija"
5. Во овој тест пример сакаме да има празно место во passwordot, односно username="Stefan", email="Стефан" и password="makedo nija"

Според multiple condition критериумот имаме 4 тест случаи:
1. T F F кадешто user=null
2. F F F кадешто username, password и email имаат ненулта вредност
Остануваат уште 2 тест случаи но нема потреба да се покријат бидејќи се подразбира дека ако password или email се ненулти, тогаш автоматски и целиот објект user е ненулти. Односно не може вториот и третиот услов да се ненулти а првиот да е нулти.
