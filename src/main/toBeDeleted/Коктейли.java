//package com.cocktail.site.controllers;
//
//
//import com.cocktail.site.coctails.Cocktail;
//import com.cocktail.site.coctails.CoctailsDAO;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Controller
//
//
//public class save {
//
//    @Autowired
//    CoctailsDAO saveCocktail;
//
//
//        @GetMapping("/save")
//        public void getter () {
//            System.err.println("SAVING : ");
//
//            List <Integer>  _1 = new ArrayList<>();
//            _1.add(3);
//            _1.add(111);
//            _1.add(208);
//
//            Cocktail negroni = new Cocktail("Negroni",
//                    "https://liviko.ee/static/F20_Martini_Negroni_CST_MRM_Printing-316x380.png",
//                    "https://iba-world.com/negroni/",
//                    _1
//            );
//
//            saveCocktail.save(negroni);
//            //////////////////////////////////
//            List <Integer> q = new ArrayList<>();
//            q.add(7);
//
//            Cocktail OldFash = new Cocktail(
//                    "Old Fashioned",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/53/1629729148-Олд_фешен.jpg",
//                    "https://iba-world.com/old-fashioned/",
//                    q
//            );
//
//            saveCocktail.save(OldFash);
//            //////////////////////////////////
//
//
//
//
//
//            List <Integer>  w  = new ArrayList<>();
//            w.add(4);
//            w.add(309);
//
//            Cocktail ppunch = new Cocktail(
//                    "Planter’s Punch",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/50/1629735342-Пунш_плантатора.jpg",
//                    "https://iba-world.com/planters-punch/",
//                    w
//            );
//
//            saveCocktail.save(ppunch);
//            //////////////////////////////////
//
//
//
//
//
//
//
//            List <Integer> e = new ArrayList<>();
//            e.add(12);
//            e.add(207);
//            e.add(318);
//
//            Cocktail pflip = new Cocktail(
//                    "Porto Flip",
//                    "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/Porto_Flip.jpg/1920px-Porto_Flip.jpg",
//                    "https://iba-world.com/porto-flip/",
//                    e
//            );
//
//            saveCocktail.save(pflip);
//            //////////////////////////////////
//
//
//
//
//
//            List <Integer> r = new ArrayList<>();
//            r.add(3);
//            r.add(309);
//            r.add(302);
//            r.add(318);
//
//            Cocktail ram = new Cocktail(
//                    "Ramos Fizz",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/49/1629735804-Рамос_джин_физз.jpg",
//                    "https://iba-world.com/ramos-fizz/",
//                    r
//            );
//
//            saveCocktail.save(ram);
//            //////////////////////////////////
//
//
//
//
//
//
//
//
//            List <Integer>  t= new ArrayList<>();
//            t.add(208);
//            t.add(102);
//            t.add(3);
//
//            Cocktail  tuxedo= new Cocktail(
//                    "Tuxedo",
//                    "https://www.liquor.com/thmb/Hsr1pqt-1bw8deQWRjMjDAQmvJ8=/720x0/filters:no_upscale():max_bytes(150000):strip_icc()/tuxedo-n2-720x720-primary-ff39e13a7b2b4c5eb1b047a2a5dad7b0.jpg",
//                    "https://iba-world.com/tuxedo/",
//                    t
//            );
//
//            saveCocktail.save(tuxedo);
//            //////////////////////////////////
//
//
//
//
//
//
//            List <Integer> y = new ArrayList<>();
//            y.add(6);
//            y.add(117);
//
//            Cocktail  stringer= new Cocktail(
//                    "Stinger",
//                    "https://www.acouplecooks.com/wp-content/uploads/2021/04/Stinger-Cocktail-004.jpg",
//                    "https://iba-world.com/stinger/",
//                    y
//            );
//
//            saveCocktail.save(stringer);
//            //////////////////////////////////
//
//
//
//
//
//            List <Integer> u = new ArrayList<>();
//            u.add(309);
//            u.add(6);
//            u.add(116);
//
//
//            Cocktail sidecar = new Cocktail(
//                    "Sidecar",
//                    "http://www.maryosbazaar.com/wp-content/uploads/2013/05/Hennessy-cocktail-FDC-sidecar.jpg",
//                    "https://iba-world.com/sidecar/",
//                    u
//            );
//
//            saveCocktail.save(sidecar);
//            //////////////////////////////////white
//
//
//
//
//
//
//            List <Integer>  i = new ArrayList<>();
//            i.add(7);
//            i.add(107);
//
//            Cocktail rnail = new Cocktail(
//                    "Rusty Nail",
//                    "https://upload.wikimedia.org/wikipedia/commons/5/58/Rusty_Nail_cocktail.jpg",
//                    "https://iba-world.com/rusty-nail/",
//                    i
//            );
//
//            saveCocktail.save(rnail);
//            //////////////////////////////////
//
//
//
//
//            List <Integer> o  = new ArrayList<>();
//            o.add(7);
//            o.add(6);
//            o.add(208);
//            o.add(106);
//
//
//            Cocktail vieux = new Cocktail(
//                    "Vieux Carrè",
//                    "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2020/12/10/0/FNM_010121-Vieux-Carre.jpg.rend.hgtvcom.826.620.suffix/1607613553503.jpeg",
//                    "https://iba-world.com/vieux-carre/",
//                    o
//            );
//            saveCocktail.save(vieux);
//            //////////////////////////////////
//
//
//
//
//
//            List <Integer> a = new ArrayList<>();
//            a.add(7);
//            a.add(309);
//            a.add(318);
//
//
//            Cocktail wsour = new Cocktail(
//                    "Whiskey Sour",
//                    "https://assets.bonappetit.com/photos/57acc14e53e63daf11a4d9b6/1:1/w_2240,c_limit/whiskey-sour.jpg",
//                    "https://iba-world.com/whiskey-sour/",
//                    a
//            );
//
//            saveCocktail.save(wsour);
//            //////////////////////////////////
//
//
//
//
//
//
//            List <Integer>  as = new ArrayList<>();
//            as.add(309);
//            as.add(116);
//            as.add(3);
//
//            Cocktail white_lady = new Cocktail(
//                    "White Lady",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/4/1629735672-Белая_леди.jpg",
//                    "https://iba-world.com/white-lady/",
//                    as
//            );
//
//            saveCocktail.save(white_lady);
//            //////////////////////////////////
//
//
//
//
//
//
//            List <Integer>  ad = new ArrayList<>();
//            ad.add(4);
//            ad.add(305);
//            ad.add(102);
//
//            Cocktail mpick  = new Cocktail(
//                    "Mary Pickford",
//                    "https://allcocktails.ru/images/with-rum/mary-pickford-cocktail.png",
//                    "https://iba-world.com/mary-pickford/",
//                    ad
//            );
//
//            saveCocktail.save(mpick);
//            //////////////////////////////////
//
//
//
//
//
//
//
//            List <Integer>  qw  = new ArrayList<>();
//            qw.add(7);
//            qw.add(208);
//
//
//            Cocktail manhattan  = new Cocktail(
//                    "Manhattan",
//                 "https://ru.inshaker.com/uploads/cocktail/hires/38/1629728494-Манхэттен.jpg",
//                 "https://iba-world.com/manhattan/",
//                    qw
//
//            );
//
//            saveCocktail.save(manhattan);
//            //////////////////////////////////
//
//
//
//
//            List <Integer> qe = new ArrayList<>();
//            qe.add(3);
//            qe.add(309);
//
//            Cocktail john_collins = new Cocktail(
//                    "John Collins",
//                    "https://www.waitrose.com/content/dam/waitrose/recipes/images/j/JOHN-COLLINS.jpg/_jcr_content/renditions/cq5dam.thumbnail.400.400.png",
//                    "https://iba-world.com/john-collins/",
//                    qe
//            );
//
//            saveCocktail.save(john_collins);
//            //////////////////////////////////
//
//
//
//
//
//
//            List <Integer>  we = new ArrayList<>();
//            we.add(3);
//            we.add(208);
//            we.add(108);
//
//
//            Cocktail hanky_panky = new Cocktail(
//                    "Hanky Panky",
//                    "https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/Hanky_Panky_cocktail.jpg/2560px-Hanky_Panky_cocktail.jpg",
//                    "https://iba-world.com/hanky-panky/",
//                    we
//            );
//
//            saveCocktail.save(hanky_panky);
//            //////////////////////////////////
//
//
//
//
//            List <Integer>  qq = new ArrayList<>();
//            qq.add(3);
//            qq.add(309);
//
//            Cocktail gin_fizz  = new Cocktail(
//                    "Gin Fizz",
//                    "https://www.acouplecooks.com/wp-content/uploads/2019/06/Gin-Fizz-102.jpg",
//                    "https://iba-world.com/gin-fizz/",
//                    qq
//            );
//
//            saveCocktail.save(gin_fizz);
//            //////////////////////////////////
//
//
//
//
//
//
//
//
//            //////////////////////////////////
//            List <Integer> aa  = new ArrayList<>();
//            aa.add(3);
//            aa.add(208);
//
//            Cocktail dry_martini = new Cocktail(
//                    "Dry Martini",
//                    "http://dishesstore.ru/image/cache/catalog/posuda/31156-500x500.jpg",
//                    "https://iba-world.com/dry-martini/",
//                    aa
//            );
//
//            saveCocktail.save(dry_martini);
//            //////////////////////////////////
//
//
//
//
//
//            List <Integer>  az  = new ArrayList<>();
//            az.add(309);
//            az.add(4);
//
//            Cocktail dairiri = new Cocktail(
//                    "Daiquiri",
//                    "https://cdn.diffords.com/contrib/stock-images/2018/05/5af3071d67532.jpg",
//                    "https://iba-world.com/daiquiri/",
//                    a
//            );
//
//            saveCocktail.save(dairiri);
//            //////////////////////////////////
//
//
//
//
//            List <Integer> ax  = new ArrayList<>();
//            ax.add(3);
//            ax.add(309);
//            ax.add(318);
//            ax.add(319);
//
//            Cocktail clover = new Cocktail(
//                    "Clover Club",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/28/1629716655-Кловер_клаб.jpg",
//                    "https://iba-world.com/clover-club/",
//                    ax
//            );
//            saveCocktail.save(clover);
//            //////////////////////////////////
//
//
//
//
//            List <Integer> sa  = new ArrayList<>();
//            sa.add(3);
//            sa.add(309);
//            sa.add(102);
//            sa.add(111);
//
//            Cocktail casino = new Cocktail(
//                    "Casino",
//                    "https://cocktail-society.com/wp-content/uploads/2021/08/Casino-Cocktail.jpg",
//                    "https://iba-world.com/casino/",
//                    sa
//            );
//            saveCocktail.save(casino);
//            //////////////////////////////////
//
//
//
//
//            List <Integer> wq  = new ArrayList<>();
//            wq.add(7);
//            wq.add(111);
//            wq.add(208);
//
//            Cocktail boilvider  = new Cocktail(
//                    "Boulevardier",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/1036/1629734630-Бульвардье.jpg",
//                    "https://iba-world.com/boulevardier/",
//                    wq
//            );
//
//            saveCocktail.save(boilvider);
//            //////////////////////////////////
//
//
//
//
//            List <Integer>  ew = new ArrayList<>();
//            ew.add(309);
//            ew.add(116);
//            ew.add(4);
//            ew.add(6);
//
//            Cocktail bts = new Cocktail(
//                    "Between the Sheets",
//                    "https://images.cocktailflow.com/v1/cocktail/w_300,h_540/cocktail_between_the_sheets-1.png",
//                    "https://iba-world.com/between-the-sheets/",
//                    ew
//            );
//
//            saveCocktail.save(bts);
//            //////////////////////////////////
//
//
//
//
//
//            List <Integer> eq = new ArrayList<>();
//            eq.add(3);
//            eq.add(102);
//            eq.add(309);
//            eq.add(118);
//
//            Cocktail aviator = new Cocktail(
//                    "Aviation",
//                    "https://makemeacocktail.com/cdn-cgi/image/f=auto,h=400,sharpen=1,fit=contain/images/cocktails/6888/400_545_Aviation.jpg",
//                    "https://iba-world.com/692/",
//                    eq
//            );
//
//            saveCocktail.save(aviator);
//            //////////////////////////////////
//
//
//
//
//            List <Integer> ds = new ArrayList<>();
//            ds.add(3);
//            ds.add(12);
//            ds.add(8);
//
//            Cocktail angel = new Cocktail(
//                    "Angel Face",
//                    "https://makemeacocktail.com/images/cocktails/7375/angelsface.jpg",
//                    "https://iba-world.com/angel-face/",
//                    ds
//            );
//
//            saveCocktail.save(angel);
//            //////////////////////////////////
//
//
//
//
//            List <Integer> fd = new ArrayList<>();
//            fd.add(111);
//            fd.add(208);
//
//            Cocktail  americano= new Cocktail(
//                    "Americano",
//                    "https://probarman.ru/img/glossary/coctails/Structured_Data/Campari_Americano-720x720.jpg",
//                    "https://iba-world.com/americano/",
//                    fd
//            );
//
//            saveCocktail.save(americano);
//            //////////////////////////////////
//
//
//
//
//            List <Integer>  sq= new ArrayList<>();
//            sq.add(114);
//            sq.add(6);
//            sq.add(302);
//
//            Cocktail  alexander = new Cocktail(
//                    "Alexander",
//                    "https://media1.sacurrent.com/sacurrent/imager/brandy-alexander/u/original/2359090/drink1-1.jpg",
//                    "https://iba-world.com/alexander/",
//                    sq
//            );
//
//            saveCocktail.save(alexander);
//            //////////////////////////////////
//
//
//            List <Integer> ee  = new ArrayList<>();
//            ee.add(102);
//            ee.add(208);
//            ee.add(3);
//
//            Cocktail  martinez = new Cocktail(
//                    "Martinez",
//                    "https://www.scienceofdrink.com/wp-content/uploads/2008/12/martinez-rosso.jpg",
//                    "https://iba-world.com/martinez/",
//                    ee
//            );
//
//            saveCocktail.save(martinez);
//            //////////////////////////////////
//
//
//
//
//            List <Integer>  bb = new ArrayList<>();
//            bb.add(202);
//            bb.add(317);
//
//            Cocktail Bellini = new Cocktail(
//                    "Bellini",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/17/1629722893-Беллини.jpg",
//                    "https://iba-world.com/bellini/",
//                    bb
//            );
//
//            saveCocktail.save(Bellini);
//            //////////////////////////////////
//
//
//
//
//
//            List <Integer>  br = new ArrayList<>();
//            br.add(101);
//            br.add(1);
//
//            Cocktail black_russian  = new Cocktail(
//                    "Black Russian",
//                    "https://www.divomix.com/uploads/1467300574.jpg",
//                    "https://iba-world.com/black-russian/",
//                    br
//            );
//
//            saveCocktail.save(black_russian);
//            //////////////////////////////////
//
//
//
//
//
//
//
//
//            List <Integer> bq  = new ArrayList<>();
//            bq.add(1);
//            bq.add(309);
//            bq.add(307);
//
//            Cocktail bloody_mary = new Cocktail(
//                    "Bloody Mary",
//                    "https://yesofcorsa.com/wp-content/uploads/2018/07/Bloody-Mary-Drink-Wallpaper-For-IPhone1.jpg",
//                    "https://iba-world.com/bloody-mary/",
//                    bq
//            );
//
//            saveCocktail.save(bloody_mary);
//            //////////////////////////////////
//
//
//
//
//
//
//
//
//            List <Integer> c  = new ArrayList<>();
//            c.add(10);
//
//            Cocktail  Caipirinha = new Cocktail(
//                    "Caipirinha",
//                    "https://static.onlinetrade.ru/img/items/m/nabor_stakanov_iz_dvoynogo_stekla_tm_alfi_400_ml_2_sht_1693676_5.JPG",
//                    "https://iba-world.com/caipirinha/",
//                    c
//            );
//
//            saveCocktail.save(Caipirinha);
//            //////////////////////////////////
//
//
//
//
//
//
//            List <Integer>  cc = new ArrayList<>();
//            cc.add(201);
//            cc.add(6);
//
//            Cocktail champagne_cocktail = new Cocktail(
//                    "Champagne Cocktail",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/964/1556717036-Champagne-Cocktail__highres.jpg",
//                    "https://iba-world.com/champagne-cocktail/",
//                    cc
//            );
//
//            saveCocktail.save(champagne_cocktail);
//            //////////////////////////////////
//
//
//
//
//            List <Integer> z  = new ArrayList<>();
//            z.add(1);
//            z.add(116);
//            z.add(309);
//            z.add(310);
//
//            Cocktail  Cosmopolitan = new Cocktail(
//                    "Cosmopolitan",
//                    "https://i.pinimg.com/originals/e2/cc/a0/e2cca05892f9e728affc9d8461948f13.jpg",
//                    "https://iba-world.com/cosmopolitan/",
//                    z
//            );
//
//            saveCocktail.save(Cosmopolitan);
//            //////////////////////////////////
//
//
//
//
//
//            List <Integer>  zz = new ArrayList<>();
//            zz.add(309);
//            zz.add(311);
//            zz.add(4);
//
//            Cocktail cuba_libre = new Cocktail(
//                    "Cuba Libre",
//                    "https://vinand.ru/media/i/sagaform/5017458-sagaform-nabor-2-kh-vysokikh-stakanov-club-250-ml-4.jpg",
//                    "https://iba-world.com/cuba-libre/",
//                    zz
//            );
//
//            saveCocktail.save(cuba_libre);
//            //////////////////////////////////
//
//
//
//
//
//
//            List <Integer> f  = new ArrayList<>();
//            f.add(201);
//            f.add(309);
//            f.add(3);
//
//            Cocktail french = new Cocktail(
//                    "French 75",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/42/1629734008-Френч_75.jpg",
//                    "https://iba-world.com/french-75/",
//                    f
//            );
//
//            saveCocktail.save(french);
//            //////////////////////////////////
//
//
//
//
//
//            List <Integer> fc  = new ArrayList<>();
//            fc.add(6);
//            fc.add(105);
//
//            Cocktail french_connection = new Cocktail(
//                    "French Connection",
//                    "https://i.ytimg.com/vi/UsnXoqjxGxI/maxresdefault.jpg",
//                    "https://iba-world.com/french-connection/",
//                    fc
//            );
//
//            saveCocktail.save(french_connection);
//            //////////////////////////////////
//
//
//
//
//
//            List <Integer>  g = new ArrayList<>();
//            g.add(117);
//            g.add(114);
//            g.add(302);
//
//            Cocktail grasshopper = new Cocktail(
//                    "Grasshopper",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/34/1629718012-Кузнечик.jpg",
//                    "https://iba-world.com/grasshopper/",
//                    g
//            );
//
//            saveCocktail.save(grasshopper);
//            //////////////////////////////////
//
//
//
//
//
//            List <Integer>  h = new ArrayList<>();
//            h.add(4);
//            h.add(306);
//            h.add(309);
//            h.add(102);
//
//            Cocktail hemingway_special = new Cocktail(
//                    "Hemingway Special",
//                    "https://shake-that.com/wp-content/uploads/2015/07/flying-hemmingway.jpg",
//                    "https://iba-world.com/hemingway-special/",
//                    h
//            );
//
//            saveCocktail.save(hemingway_special);
//            //////////////////////////////////
//
//
//
//
//
//            List <Integer> x = new ArrayList<>();
//            x.add(6);
//            x.add(320);
//
//            Cocktail horse  = new Cocktail(
//                    "Horse's Neck",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/36/1629719234-Лошадиная_шея.jpg",
//                    "https://iba-world.com/horses-neck/",
//                    x
//            );
//
//            saveCocktail.save(horse);
//            //////////////////////////////////
//
//
//
//
//
//            List <Integer> dd  = new ArrayList<>();
//            dd.add(301);
//            dd.add(302);
//            dd.add(7);
//
//            Cocktail irish_coffee = new Cocktail(
//                    "Irish Coffee",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/26/1629735839-Ирландский_кофе.jpg",
//                    "https://iba-world.com/irish-coffee/",
//                    dd
//
//            );
//
//            saveCocktail.save(irish_coffee);
//            //////////////////////////////////
//
//
//
//
//
//
//            List <Integer>  xx = new ArrayList<>();
//            xx.add(112);
//            xx.add(204);
//
//            Cocktail kir = new Cocktail(
//                    "KIR",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/111/1629714587-Кир_рояль.jpg",
//                    "https://iba-world.com/kir/",
//                    xx
//            );
//
//            saveCocktail.save(kir);
//            //////////////////////////////////
//
//
//
//            List <Integer> m = new ArrayList<>();
//            m.add(116);
//            m.add(309);
//            m.add(5);
//
//
//            Cocktail margarita  = new Cocktail(
//                    "Margarita",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/39/1629726330-Маргарита.jpg",
//                    "https://iba-world.com/margarita/",
//                    m
//            );
//
//            saveCocktail.save(margarita);
//            //////////////////////////////////
//
//
//
//
//            List <Integer> qd = new ArrayList<>();
//            qd.add(202);
//            qd.add(303);
//
//            Cocktail mimosa = new Cocktail(
//                    "Mimosa",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/41/1629726619-Мимоза.jpg",
//                    "https://iba-world.com/mimosa/",
//                    qd
//            );
//
//            saveCocktail.save(mimosa);
//            //////////////////////////////////
//
//            List <Integer>  q1 = new ArrayList<>();
//            q1.add(1);
//            q1.add(320);
//            q1.add(309);
//
//
//            Cocktail moscow_mule = new Cocktail(
//                    "Moscow Mule",
//                    "https://ae04.alicdn.com/kf/Hb5021d4b318e4ff482e771b30fed61fe1/415.jpeg",
//                    "https://iba-world.com/moscow-mule/",
//                    q1
//            );
//
//            saveCocktail.save(moscow_mule);
//            //////////////////////////////////
//
//
//
//
//            List <Integer> q2 = new ArrayList<>();
//            q2.add(4);
//            q2.add(114);
//            q2.add(305);
//
//
//            Cocktail  pino_colada= new Cocktail(
//
//                    "Pina Colada",
//                    "https://www.kindpng.com/picc/m/45-456664_rumchata-pina-colada-hd-png-download.png",
//                    "https://iba-world.com/pina-colada/",
//                    q2
//            );
//
//            saveCocktail.save(pino_colada);
//            //////////////////////////////////
//
//
//
//
//            List <Integer>q3  = new ArrayList<>();
//            q3.add(306);
//            q3.add(310);
//            q3.add(1);
//
//            Cocktail sea_breeze = new Cocktail(
//                    "Sea Breeze",
//                    "https://aws.wideinfo.org/rilretg.com/wp-content/uploads/2019/07/07192700/bay-breeze_white11.png",
//                    "https://iba-world.com/sea-breeze/",
//                    q3
//
//            );
//
//            saveCocktail.save(sea_breeze);
//            //////////////////////////////////
//
//
//
//            List <Integer>  sun = new ArrayList<>();
//            sun.add(303);
//            sun.add(5);
//
//            Cocktail tequila_sunrise = new Cocktail(
//                    "Tequila Sunrise",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/873/1629735150-Текила_санрайз.jpg",
//                    "https://iba-world.com/tequila-sunrise/",
//                    sun
//            );
//
//            saveCocktail.save(tequila_sunrise);
//            //////////////////////////////////
//
//
//
//
//            List <Integer>  ves  = new ArrayList<>();
//            ves.add(3);
//            ves.add(1);
//            ves.add(113);
//
//            Cocktail  vesper= new Cocktail(
//                    "Vesper",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/255/1556448427-Vesper-highres.jpg",
//                    "https://iba-world.com/vesper/",
//                    ves
//
//            );
//
//            saveCocktail.save(vesper);
//            //////////////////////////////////
//
//
//
//
//            List <Integer> h1 = new ArrayList<>();
//            h1.add(2);
//            h1.add(9);
//            h1.add(110);
//
//            Cocktail  herosima = new Cocktail(
//                    "Hiroshima",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/932/1556476134-Hiroshima-highres.jpg",
//                    "https://ru.inshaker.com/cocktails/932-hirosima",
//                    h1
//
//
//            );
//
//            saveCocktail.save(herosima);
//            //////////////////////////////////
//
//
//
//
//
//            List <Integer>  ss = new ArrayList<>();
//            ss.add(9);
//            ss.add(110);
//
//            Cocktail  ss1 = new Cocktail(
//                    "Скользский сосок",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/830/1556798272-Slippery-Nipple__highres.jpg",
//                  "https://ru.inshaker.com/cocktails/830-skolzkiy-sosok",
//                    ss
//            );
//
//            saveCocktail.save(ss1);
//            //////////////////////////////////
//
//
//
//
//
//            List <Integer>  fk = new ArrayList<>();
//            fk.add(309);
//            fk.add(8);
//
//
//            Cocktail french_kiss = new Cocktail(
//                    "French Kiss",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/1008/1556448785-French-Kiss__highres.jpg",
//                    "https://ru.inshaker.com/cocktails/1008-yablochnyy-tini",
//                    fk
//            );
//
//            saveCocktail.save(french_kiss);
//            //////////////////////////////////
//
//
//
//
//            List <Integer> mmm = new ArrayList<>();
//            mmm.add(6);
//            mmm.add(208);
//            mmm.add(11);
//            mmm.add(315);
//
//            Cocktail maw = new Cocktail(
//                    "Мэри против Вилли",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/1484/1574175055-4.jpg",
//                    "https://ru.inshaker.com/cocktails/1484-meri-protiv-villi",
//                    mmm
//            );
//
//            saveCocktail.save(maw);
//            //////////////////////////////////
//            List <Integer> j = new ArrayList<>();
//            j.add(1);
//            j.add(103);
//            j.add(312);
//            j.add(305);
//
//            Cocktail blie = new Cocktail(
//                    "Blue Lagoon",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/314/1629734773-Голубая_лагуна.jpg",
//                    "https://ru.inshaker.com/cocktails/314-golubaya-laguna",
//                    j
//            );
//
//            saveCocktail.save(blie);
//            //////////////////////////////////
//
//
//
//
//            List <Integer>  spr = new ArrayList<>();
//            spr.add(202);
//            spr.add(109);
//
//            Cocktail spritz = new Cocktail(
//                    "Aperol",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/1098/1537863520-Aperol_spritz-HiRes.jpg",
//                    "https://ru.inshaker.com/cocktails/1098-aperol-shprits",
//                    spr
//            );
//
//            saveCocktail.save(spritz);
//            //////////////////////////////////
//
//
//
//            List <Integer> ny = new ArrayList<>();
//            ny.add(7);
//            ny.add(309);
//            ny.add(203);
//
//            Cocktail new_york_sour = new Cocktail(
//                    "New York Sour",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/1476/1570711757-1_Коктейль.jpg",
//                    "https://www.edim.tv/cocktails/new-york-sour/",
//                    ny
//            );
//
//            saveCocktail.save(new_york_sour);
//            //////////////////////////////////
//
//
//
//            List <Integer>  dirt = new ArrayList<>();
//            dirt.add(3);
//            dirt.add(315);
//            dirt.add(208);
//
//
//            Cocktail dirty_martini = new Cocktail(
//                    "Dirty Martini",
//                    "https://barnewspress.ru/wp-content/uploads/2020/01/600-dirty-martini-1.jpg",
//                    "https://www.edim.tv/cocktails/martini/",
//                    dirt
//            );
//
//            saveCocktail.save(dirty_martini);
//            //////////////////////////////////
//
//
//
//
//            List <Integer>  b1b = new ArrayList<>();
//            bb.add(301);
//            bb.add(303);
//
//
//            Cocktail bumblebee = new Cocktail(
//                    "Bumblebee",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/969/1537757361-Bumblebee__highres.jpg",
//                    "https://ru.inshaker.com/cocktails/969-shmel",
//                    b1b
//            );
//
//            saveCocktail.save(bumblebee);
//            //////////////////////////////////
//
//
//
//
//
//            List <Integer> white  = new ArrayList<>();
//            white.add(1);
//            white.add(301);
//            white.add(101);
//
//
//            Cocktail  em = new Cocktail(
//                    "Espresso Martini",
//                    "https://ru.inshaker.com/uploads/cocktail/hires/988/1556446952-Espresso-martini__highres.jpg",
//                    "https://ru.inshaker.com/cocktails/988-espresso-martini",
//                    white
//            );
//
//            saveCocktail.save(em);
//            //////////////////////////////////
//
//
//
//            System.err.println("READY DATA ");
//
//
//
//    }
//}
