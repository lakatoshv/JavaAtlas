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
}
