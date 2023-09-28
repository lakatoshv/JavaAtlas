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
}
