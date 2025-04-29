/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.Services;

import Core.Services.Dtos.RiversInfo;

/**
 *
 * @author user
 */
public class RiversService {
    public RiversInfo GetLongestRivers() {
        var result = new RiversInfo();
        result.SetRiversList(new Object [][] {
            {"Амазонка",  new Integer(6762), "Бразилія, Перу, Болівія, Колумбія, Еквадор, Венесуела"},
            {"Ніл",  new Integer(6690), "Судан, Ефіопія, Єгипет, Уганда, Танзанія, Кенія, Руанда, Бурунді, Еритрея, Демократична Республіка Конґо"},
            {"Янцзи",  new Integer(6380), "КНР"},
            {"Міссісіпі — Міссурі",  new Integer(6270), "США та Канада"},
            {"Єнісей — Ангара — Селенга",  new Integer(5550), "Росія, Монголія"},
            {"Об — Іртиш",  new Integer(5410), "Росія, Казахстан, КНР"},
            {"Хуанхе",  new Integer(4667), "КНР"},
            {"Амур",  new Integer(4368), "Росія, КНР, Монголія"},
            {"Конго",  new Integer(4371), "Демократична Республіка Конго, Центральноафриканська Республіка, Ангола, Конго, Танзанія, Камерун, Замбія, Бурунді, Руанда"},
            {"Лена",  new Integer(4260), "Росія"},
            {"Макензі — Піс — Фінлей",  new Integer(4241), "Канада"},
            {"Нігер",  new Integer(4167), "Нігерія, Малі, Нігер , Алжир, Гвінея, Камерун, Буркіна Фасо, Кот-д'Івуар, Бенін, Чад"},
            {"Меконг",  new Integer(4023), "Лаос, Таїланд, КНР, Камбоджа, В'єтнам, М'янма"},
            {"Парана",  new Integer(3998), "Бразилія, Аргентина, Парагвай, Болівія, Уругвай"},
            {"Муррей — Дарлінг",  new Integer(3750), "Австралія"},
            {"Волга",  new Integer(3645), "Росія, Казахстан, Білорусь"},
            {"Арванд — Євфрат",  new Integer(3596), "Ірак, Туреччина, Іран, Сирія"},
            {"Пурус",  new Integer(3379), "Бразилія, Перу"},
            {"Мадейра — Маморе",  new Integer(3239), "Бразилія, Болівія, Перу"},
            {"Юкон",  new Integer(3184), null}
        });
        result.SetColumnNames(new String [] {
            "Назва", "Довжина (км.)", "Місце знаходження"
        });
        
        return result;
    }
    
    public RiversInfo GetDeepestRivers() {
        var result = new RiversInfo();
        result.SetRiversList(new Object [][] {
            {"Конго",  new Integer(250), "Африка"},
            {"Янцзи",  new Integer(200), "Китай"},
            {"Дунай",  new Integer(178), "Європа"},
            {"Замбезі",  new Integer(116), "Африка"},
            {"Меконг",  new Integer(100), "Китай, Лаос, Тайланд, Камбоджа та В'єтнам"},
            {"Амазонка",  new Integer(90), "Бразилія, Перу, Болівія, Колумбія, Еквадор"},
            {"Жовта річка Хуанхе",  new Integer(80), "Китай"},
            {"Гудзон",  new Integer(65), "США"},
            {"Сент Лоуренс",  new Integer(65), "Канада"},
            {"Місісіпі",  new Integer(60), null}
        });
        result.SetColumnNames(new String [] {
            "Назва", "Найбільша глубина (м.)", "Місце знаходження"
        });
        
        return result;
    }
    
    public RiversInfo GetRiversInNorthAmerica() {
        var result = new RiversInfo();
        result.SetRiversList(new Object [][] {
            {"Місісіпі",  new Integer(3734), "США"},
            {"Міссурі",  new Integer(3767), "США, Канада"},
            {"Колумбія",  new Integer(2250), "Канада"},
            {"Юкон",  new Integer(2897), "США, Канада"},
            {"Річка Святого Лаврентія", null, "США, Канада"}
        });
        result.SetColumnNames(new String [] {
            "Назва", "Довжина(загальна) (км.)", "Місце розташування"
        });
        
        return result;
    }
    
    public RiversInfo GetRiversInSouthAmerica() {
        var result = new RiversInfo();
        result.SetRiversList(new Object [][] {
            {"Амазонка",  new Integer(6592), "Бразилія, Перу, Болівія, Колумбія, Еквадор"},
            {"Парана",  new Integer(4380), "Бразилія, Парагвай, Апгентина"},
            {"Жаруа",  new Integer(3280), "Бразилія"},
            {"Мадейра",  new Integer(3200), "Болівія, Бразилія"},
            {"Ориноко",  new Integer(2730), "Венесуела, Колумбія"},
            {"Арагуая",  new Integer(2630), "Бразилія"},
            {"Парагвай",  new Integer(2500), "Бразилія, Парагвай"},
            {"Жапура",  new Integer(1930), "Колумбія"},
            {"Апуре",  new Integer(1580), "Венесуела"},
            {"Магдалена",  new Integer(1540), "Колумбія"}
        });
        result.SetColumnNames(new String [] {
            "Назва", "Довжина(загальна) (км.)", "Місце розташування"
        });
        
        return result;
    }
    
    public RiversInfo GetRiversInAustralia() {
        var result = new RiversInfo();
        result.SetRiversList(new Object [][] {
            {"Дарлінг",  new Integer(2740), "Південно-східна частина Австралії"},
            {"Муррей",  new Integer(2375), "Австралійські альпи"},
            {"Бердекін",  new Integer(732), "Австралія"},
            {"Фітройц",  new Integer(733), "Західна Австралія"},
            {"Хантер",  new Integer(300), null}
        });
        result.SetColumnNames(new String [] {
            "Назва", "Довжина(загальна) (км.)", "Місце розташування"
        });
        
        return result;
    }
    
    public RiversInfo GetRiversInAfrica() {
        var result = new RiversInfo();
        result.SetRiversList(new Object [][] {
            {"Вікторія",  new Integer(69485), "Танзанія, Уганда, Кенія"},
            {"Танганьїка",  new Integer(32893), "ДРК, Танзанія, Бурунді, Замбія"},
            {"Малаві (Ньяса)",  new Integer(28880), "Малаві, Танзанія, Мозамбік"},
            {"Вольта",  new Integer(8485), "Гана"},
            {"Туркана (Рудольф)",  new Integer(6405), "Кенія, Ефіопія"},
            {"Нассер",  new Integer(5860), "Єгипет, Судан"},
            {" Озеро	Країни	Площа, км²	Найбільша глибина, м	Висота над рівнем моря, м	Об'єм, км³ Вікторія	Танзанія, Уганда, Кенія	69 485	82	1 133	2 760 Танганьїка[1]	ДРК, Танзанія, Бурунді, Замбія	32 893	1 470	772	18 940 Малаві (Ньяса)[2]	Малаві, Танзанія, Мозамбік	28 880	695	474	7 775 Вольта*[3][4]	Гана	8 485	74	85	148 Туркана (Рудольф)[5]	Кенія, Ефіопія	6 405	73	375	187 Нассер*	Єгипет, Судан	5 860	130	183	169 Альберт (Мобуту-Сесе-Секо)",  new Integer(5374), "ДРК, Уганда"},
            {"Каріба",  new Integer(5364), "Замбія, Зімбабве"},
            {"Мверу",  new Integer(4584), "Замбія, ДРК"},
            {"Тана",  new Integer(3034), "Ефіопія"},
            {"Руква",  new Integer(2850), "Танзанія"},
            {"Водосховище Каора-Баса",  new Integer(2850), "Мозамбік"},
            {"Бангвеулу",  new Integer(2735), "Замбія"},
            {"Едвард",  new Integer(2325), "Уганда, ДРК"},
            {"Маї-Ндомбе",  new Integer(2320), "ДРК"},
            {"Ківу",  new Integer(2220), "ДРК, Руанда"},
            {"Косу",  new Integer(1898), "Кот-д'Івуар"},
            {"Кйога",  new Integer(1720), "Уганда"},
            {"Мверу-Вантіпа",  new Integer(1600), "Замбія"},
            {"Бухайрат ель-Манзіла (Манзала)",  new Integer(1360), "Єгипет"},
            {"Чад",  new Integer(1350), "Камерун, Нігер, Нігерія, Чад"},
            {"Каїнджі",  new Integer(1243), "Нігерія"},
            {"Абая",  new Integer(1162), "Ефіопія"},
            {"Еясі",  new Integer(1050), "Танзанія"},
            {"Чілва",  new Integer(1040), "Малаві"},
            {"Водосховище Ущелина Кафуе",  new Integer(1003), "Замбія"}
        });
        result.SetColumnNames(new String [] {
            "Назва", "Площа (м.)", "Місце знаходження"
        });
        
        return result;
    }
    
    public RiversInfo GetRiversInEurasia() {
        var result = new RiversInfo();
        result.SetRiversList(new Object [][] {
            {"Лена",  new Integer(4400), "Сибір"},
            {"Єнісей",  new Integer(4102), "Монголія, Тува, Росія"},
            {"Об",  new Integer(3650), "Росія"},
            {"Волга",  new Integer(3530), "Росія"},
            {"Дунай",  new Integer(2960), "Румунія, Угорщина, Австрія, Сербія, Німеччина, Словаччина, Болгарія, Боснія і Герцеговина, Хорватія, Україна, Чехія, Словенія, Молдова, Швейцарія, Італія, Польща, Албанія"},
            {"Сирдар’я",  new Integer(2212), " Таджикистан, Узбекистан, Казакстан"},
            {"Дніпро",  new Integer(2201), "Росія, Білорусь, Україна"},
            {"Печора",  new Integer(1809), "Росія"},
            {"Амудар'я",  new Integer(1415), "Афганістан, Таджикистан, Туркменістан, Узбекистан"},
            {"Рейн",  new Integer(1230), "Швейцарія, Італія, Ліхтенштейн, Австрія, Німеччина, Франція, Нідерланди."},
            {"Ельба",  new Integer(1091), "Чехія,Австрія, Німеччина, Польща"},
            {"Вісла",  new Integer(1047), "Польща, Україна, Білорусь"},
            {"Одра",  new Integer(854), "Польща, Німеччина, Чехія"},
            {"Сена",  new Integer(776), "Франція"},
            {"Північна Двіна",  new Integer(774), "Росія"}
        });
        result.SetColumnNames(new String [] {
            "Назва", "Довжина(загальна) (км.)", "Місце розташування"
        });
        
        return result;
    }
    
    public RiversInfo GetBiggestRiversInUkraine() {
        var result = new RiversInfo();
        result.SetRiversList(new Object [][] {
            {"Дніпро",  new Integer(2201),  new Integer(981)},
            {"Дністер",  new Integer(1362),  new Integer(705)},
            {"Десна",  new Integer(1130),  new Integer(591)},
            {"Сіверський Донець",  new Integer(1053),  new Integer(672)},
            {"Західний Буг",  new Integer(831),  new Integer(401)},
            {"Південний Буг",  new Integer(806),  new Integer(86)},
            {"Псел",  new Integer(717),  new Integer(526)},
            {"Гориць",  new Integer(659),  new Integer(577)},
            {"Інгулець",  new Integer(549),  new Integer(549)},
            {"Стир",  new Integer(494),  new Integer(445)},
            {"Ворскла",  new Integer(464),  new Integer(348)},
            {"Случ",  new Integer(451),  new Integer(451)},
            {"Тетерів",  new Integer(385),  new Integer(385)},
            {"Сула",  new Integer(365),  new Integer(365)},
            {"Інгул",  new Integer(354),  new Integer(354)},
            {"Рось",  new Integer(346),  new Integer(346)},
            {"Оріль",  new Integer(346),  new Integer(346)},
            {"Удай",  new Integer(327),  new Integer(327)},
            {"Вовча",  new Integer(323),  new Integer(323)},
            {"Самара",  new Integer(320), null}
        });
        result.SetColumnNames(new String [] {
            "Назва", "Довжина(загальна) (км.)", "Довжина(в межах України) (км.)"
        });
        
        return result;
    }
}
