var gg = angular.module('dataFactoryApp', []); //ngMessages

gg.factory('myDataFactory', function () {

    return {
        getInaHurryData: function () {
            return {
                "lt": {
                    "title": "Skubate?",
                    "sentence": "Visiems skubanties, neturintiems laiko ar tiesiog nenorintiems daugiau informacijos, spauskite žemiau esantį mygtuką ir rezervuokite laiką jau dabar!",
                    "button": "Rezervuoti laiką dabar!"
                },
                "de": {
                    "title": "In Eile?",
                    "sentence": "Für alle Eiligen, die keine Zeit haben oder einfach keine Informationen mehr haben wollen, klicken Sie auf den Button unten und reservieren Sie jetzt Zeit!\n",
                    "button": "Buchen Sie jetzt!\n"
                },
                "ru": {
                    "title": "В спешке?",
                    "sentence": "Для всех спешащих людей, у которых нет времени или просто не нужно больше информации, нажмите кнопку ниже и зарезервируйте время прямо сейчас!\n",
                    "button": "Забронируйте сейчас!\n"


                }
            }
        },

        getPageTitle: function () {
            return {
                "lt": {
                    "title": "Grįžti į pradžią"
                },
                "de": {
                    "title": "Gehe zurück nach oben"
                },
                "ru": {
                    "title": "Вернуться в начало"
                }
            }

        },
        getIntroData: function () {
            return {
                "lt": {
                    "intro": "Masažas yra vienas iš ypatingų veiksnių žmogaus gyvenime, padedančių palaikyti puikią kūno ir dvasios būseną. Ir nieko nėra geresnio, kaip po sunkios ir išvargintos darbo dienos atsipalaiduoti ir atgaivinti savo kūną masažo procedūromis.",
                    "findMore": "Sužinokite daugiau",
                    "bookNow": "Rezervuokite laiką"

                },
                "de": {
                    "intro": "Massage ist eine der besonderen Faktoren in das Leben einer Person, zu helfen einen guten Körper und Seele zu halten. Und es gibt nichts Besseres als nach einem harten und müden Arbeitstag, entspannen und beleben Sie Ihren Körper mit Massage–Verfahren.",
                    "findMore": "Erfahren Sie mehr",
                    "bookNow": "Sparen Sie Zeit"


                },
                "ru": {
                    "intro": "Массаж является одним из особых факторов в жизни человека, помогая поддерживать хорошее тело и душу. И нет ничего лучше, чем после тяжелого и усталого рабочего дня, расслабиться и оживить cвое тело массажными процедурами.",
                    "findMore": "Узнайте больше",
                    "bookNow": "резервировать время"

                }
            }

        },
        getNavBarData: function () {
            return {

                "lt": {
                    "about": "Apie",
                    "massages": "Masažai",
                    "gallery": "Galerija",
                    "prices": "Kainos",
                    "book": "Užsakyti",
                    "contacts": "Kontaktai",
                },
                "de": {
                    "about": "Über",
                    "massages": "Massagen",
                    "gallery": "Galerie",
                    "prices": "Preise",
                    "book": "Bestellen",
                    "contacts": "Kontakte",
                },
                "ru": {
                    "about": "Oбо",
                    "massages": "Mассажы",
                    "gallery": "Галерея",
                    "prices": "Цена",
                    "book": "Заказать",
                    "contacts": "Kонтакты",
                }
            };
        },

        getAboutMeTitle: function () {
            return {
                "lt": {
                    "whoIAm": "Kas aš?",
                    "exp": "Išsilavinimas",
                    "workExp": "Darbo patirtis",
                    "spa": "Sertifikatai",
                    "title": "Jūsų paslaugoms"
                },
                "de": {
                    "whoIAm": "Wer bin ich?",
                    "exp": "Bildung",
                    "workExp": "Berufserfahrung",
                    "spa": "Zertifikate",
                    "title": "Zu Ihren Diensten"
                },
                "ru": {
                    "whoIAm": "Kто я?",
                    "exp": "Oбразование",
                    "workExp": "Oпыт работы",
                    "spa": "Сертификаты",
                    "title": "К вашим услугам"
                }
            }
        },

        getAboutMeBody: function () {
            return {
                "lt": {
                    "whoIAm": ["Mano vardas Vida. Atvykau iš Lietuvos. Gyvenu Šveicarijoje, Schaffhausen mieste.", "Man masažai – tai iššūkis ir malonumas.", "Iššūkis – panaikinti skausmus žmogaus kūne.", "Malonumas – kai nebelieka skausmų, dingsta įtampa, sugražinama gera savijauta, o žmogaus veide atsiranda šypsena.", "Mano tikslas yra padėti žmonėms jaustis puikiai, bet kuriuo amžiaus periodu."],
                    "exp": ["1984 m. – Vilniaus aukštesnioji medicinos mokykla, Lietuva.", "2009 m. – Klaipėdos universitetas. Bakalauro laipsnis Visuomenės sveikata.", "2010 m. – Baltic SPA Professional Kursai (Latvija), SPA masažai.", "2012 m. – Slaugos darbuotojų tobulinimosi ir specializacijos centras: Pažymėjimas Nr. KV 120146 – suteikta teisė daryti gydomuosius masažus."],
                    "workExp": ["27 metai: Medicinos sesuo.", "8 metai: Visuomenės sveikatos priežiūros specialistė.", "8 metai: Masažuotoja."],
                    "spa": ["Klasikinis segmentinis masažas", "Karštų akmenų masažas", "Limfodrenažinis masažas", "Tajų masažas", "Tradicinis ajurvedinis Keralos masažas", "Gydomieji masažai"]
                },
                "de": {
                    "whoIAm": ["Meine Name ist Vida. Ich komme aus Litauen. Ich wohne jetzt in der Schweiz, in der Stadt Schaffhausen.", "Für mich ist Massage eine Herausforderung und Vergnügen.", "Die Herausforderung – beseitigen Schmerzen im menschlichen Körper.", "Vergnügen – es mehr keinen Schmerz, verschwindet die Spannung, kommt die gut Gesundheit zurück, und ein Lächeln erscheint auf dem Gesicht der Mensch.", "Mein Ziel – den Leuten zu helfen, sich in jedem Alter gut zu fühlen."],
                    "exp": ["Vilnius Höhere Medizinische Fakultät Litauen.", "Klaipeda Universität. Bachelor Öffentliches Gesundheitswesen verliehen. Litauen.", "2010 – \"Baltic SPA Profi\" Kurse (Lettland), Wellness–Massagen.", "2012 – Zentrum für Entwicklung und Spezialisierung des Pflegepersonals: Zertifikat Nr. 120146 KV – das Recht hat therapeutische Massage zu machen."],
                    "workExp": ["27 Jahre: Krankenschwester.", "8 Jahre: Facharzt für öffentliche Gesundheit.", "8 Jahre: Masseurin."],
                    "spa": ["Klassische segmentale Massage", "Hot Stone Massage", "Lymphdrainage-Massage", "Thai-Massage", "Traditionelle ayurvedische Keral-Massage", "Massage-Therapie"]
                },
                "ru": {
                    "whoIAm": ["Меня зовут Вида. Я приехала из Литвы. Теперь живу в Швейцарии, в городе Шаффхаузен.", "Для меня массаж – это вызов и удовольствие.", "Вызов – устранить боль в теле человека.", "Удовольствие – когда нет больше боли, напряжение исчезает, возвращается хорошое самочувствие, а на лице человека появляется улыбка.", "Моя цель – помочь людям чувствовать себя прекрасно в любом возрасте."],
                    "exp": ["Вильнюсская высшая медицинская школа. Литва.", "Клайпедский университет. Степень бакалавра в области общественного здравоохранения. Литва.", "2010 г. – \"Baltic SPA Professional\" курсы (Латвия), спа–массажы.", "2012 г. – Центр развития и специализации медсестринского персонала: Сертификат Нет. KV 120146 – предоставляется право делать терапевтические (лечебные) массажы."],
                    "workExp": ["27 лет: медицинская сестра.", "8 лет: специалист общественного здравоохранения.", "7 лет: массажист."],
                    "spa": ["Классический сегментарный массаж", "Массаж горячими камнями", "Лимфодренажный массаж", "Тайский массаж", "Традиционный aюрведический Керал массаж", "Терапевтические массажы"]
                }
            }
        },

        getBulletPoints: function(){
            return {
                "lt": {
                    "limphoBodyBul1": ["Mažinant kūno svorį;", "Esant kojų patinimams;", "Esant odos suglebimui;", "Po operacijų ir t.t."],
                    "limphoBodyBulTit1": ["Rekomenduojamas:", "Profilaktikai:"],
                    "limphoBodyBul2": ["Išsiplėtusių kojų venų."],

                    "limphoFaceBul1": ["Pašalinti iš organizmo nereikalingus skysčius, šlakus, pašalinti patinimus.", "Atsikratyti chroniško nuovargio, įtampos, galvos skausmų, taip pat pakrauti organizmą.", "Pagerinti veido spalvą ir odos būklę: pašalindamas nedidelę įtampą, manualinis limfodrenažas pagerina kraujotaką, todėl oda, gavusi pilnavertį maitinimą, atrodo elastingesnė, gyvesnė ir sveikesnė, be to, išsilygina raukšlės."],
                    "limphoFaceBulTit1": ["Rankinis limfodrenažas leis per trumpą laiką:", "Veido limfodrenažas suteikia puikių rezultatų prie:"],
                    "limphoFaceBul2": ["veido pabrinkimo,","išsausėjusios odos,","ankstyvojo senėjimo,","tamsių ratilų ir maišelių po akimis,","sumažėjusio audinių elastingumo,","kovojant su kuperoze."],

                    "HotColdStoneBul1": ["pagerina miegą,","teigiamas poveikis širdies susitraukimų dažniui, kurį sukelia natūrali organizmo jėga, padedanti įveikti ligą, pagreitina srauto procesą."],
                    "HotColdStoneTit1": ["Taip pat:", "Masažas yra efektyvus esant:"],
                    "HotColdStoneBul2": ["nugaros ir kaklo skausmams,","teigiamai veikia nervų sistemą,","lėtiniam nuovargiui,","migrenai,","pirštų tirpimui,","šalčio pojūčiui galūnėse ir t.t."],

                    "backSpinBul1": ["prie kompiuterio ar vairuodami automobilį,", "dirbantiems sėdimą ar sunkų fizinį darbą kai visa įtampa susikaupia stuburo dalyje, kaklo ir pečių, juosmens ir sėdmenų srityse, ir dėl to susiformuoja skausmingi raumenų mazgai.", "Šis masažas ypač tinka po treniruočių.","Be to, dėl netaisyklingos stuburo padėties dažnai skauda galvą."],
                },
                "de": {
                    "limphoBodyBul1": ["Verringerung des Körpergewichts;", "Beinschwellung;", "Reduzierte Hautelastizität;", "nach der Operation usw."],
                    "limphoBodyBulTit1": ["Empfohlen:", "Prophylaxe:"],
                    "limphoBodyBul2": ["Krampfadern in den Beinen."],

                    "limphoFaceBul1": ["Befreien von chronischer Müdigkeit, Verspannungen, Kopfschmerzen sowie der Belastung des Körpers.","Verbessern Sie die Gesichtsfarbe und den Hautzustand: Durch die Beseitigung von Verspannungen verbessert die manuelle Lymphdrainage die Blutzirkulation.  Die Haut nach der vollwertigen Ernährung elastischer, lebendiger und gesünder aussieht und Falten glättet."],
                    "limphoFaceBulTit1": ["Manuelle Lymphdrainage gibt für kurze Zeit :", "Die Lymphdrainage des Gesichts liefert hervorragende Ergebnisse bei:"],
                    "limphoFaceBul2": ["Schwellung des Gesichts,","trockene Haut,","frühes Altern,","dunkle Kreise und Taschen unter den Augen,","reduzierte Gewebeelastizität,","Bekämpfung von Kuperosis."],

                    "HotColdStoneBul1": ["schmerzen im Rücken und Nacken,"],
                    "HotColdStoneTit1": ["Massage ist wirksam bei:"],
                    "HotColdStoneBul2": ["eine positive Wirkung auf das Nervensystem","chronische Müdigkeit","Migräne","Taubheit der Finger","Erkältung in den Gliedmaßen usw."],

                    "backSpinBul1": ["am Computer oder beim Autofahren;", "sowie schwere körperliche Arbeit, wenn die ganze Macht in der Wirbelsäule, Nacken konzentriert, Schultern, Hüfte und Gesäß, Schmerzen in den Muskeln verursacht.", "Šis masažas ypač tinka po treniruočių.","Be to, dėl netaisyklingos stuburo padėties dažnai skauda galvą.","Diese Massage eignet sich besonders nach dem Training.","Außerdem verursacht die falsche Position der Wirbelsäule oft Kopfschmerzen."]

                },
                "ru": {
                    "limphoBodyBul1": ["Cнижение массы тела;", "Oтечность ног;", "Пониженная упругость кожи;", "После операции и т. Д."],
                    "limphoBodyBulTit1": ["Рекомендуется", "Профилактика:"],
                    "limphoBodyBul2": ["Варикозное расширение вен на ногах."],

                    "limphoFaceBul1": ["вывести лишнюю жидкость, шлаки, снять отёки и одутловатость лица.", "снять хроническую усталость, напряжение, подавленность, головные боли, зарядить организм энергией.", "улучшить цвет лица и состояние кожи: снимая малейшие мышечные напряжения, лимфодренаж улучшает кровообращение, получая полноценное питание, кожа выглядит более эластичной, свежей и здоровой, разглаживаются морщины."],
                    "limphoFaceBulTit1": ["Позволит за короткий срок:", "Лимфодренаж лица обеспечивает отличные результаты при:"],
                    "limphoFaceBul2": ["отеки лица,","сухости кожи,","раннем старении,","темных кругах и мешках под глазами,","снижение эластичности тканей,","борьбе с купоросом."],

                    "HotColdStoneBul1": ["улучшает сон,","положительно влияет на частоту сердечных сокращений."],
                    "HotColdStoneTit1": ["А также:", "Массаж эффективен при:"],
                    "HotColdStoneBul2": ["боль в спине и шее,","положительно влияет на нервную систему,","хронической усталости,","мигрени,","онемение пальцев,","ощущение холода в конечностях и т. д."],

                    "backSpinBul1": ["за компьютером или за рулем автомобиля,", "а также тяжело физически работая, когда все напряжение сосредоточено в позвоночнике, шее и плечах, поясе и ягодицах, вызывая болезненные ощущения в мышцах..", "Этот массаж особенно подходит после тренировки.","Кроме того, неправильное положение позвоночника часто вызывает головную боль."]
                }
            }
        },

        getMassagesTitles: function () {
            return {
                "lt": {
                    "limphoBody": "Limfodrenažinis kūno masažas (metodika pagal Paskalis Kose)",
                    "limphoFace": "Limfodrenažinis veido masažas",
                    "stoneHotCold": "Karštų akmenų masažas",
                    "backSpin": "Klasikinis – segmentinis nugaros masažas",
                    "older": "Masažas vyresnio amžiaus žmonėms",
                    "relaxBody": "Atpalaiduojantis viso kūno masažas",
                    "ajurved": "Ajurvedinis krūtų masažas moterims",
                    "antice": "Anticeliulitiniai masažai",
                    "relaxFoot": "Atpalaiduojantis pėdų – blauzdų masažas",
                    "sepHead": "Galvos masažas",
                    "sepNeck": "Pečių – kaklo – rankų masažas",
                    "sepStoma": "Pilvo masažas",
                    "sepWaist": "Juosmens – sėdmenų – kojų masažas",
                    "sepPar": "Atskirų kūno dalių masažai",
                    "labelMore": "Daugiau",
                    "labelLess": "Mažiau",
                    "buttonReserve": "Rezervuoti"
                },
                "de": {
                    "limphoBody": "Manuelle Lymphdrainage (Methodik von Pascal Kose)",
                    "limphoFace": "Manuelle Lymphdrainage Gesicht",
                    "stoneHotCold": "Hot Stone Massage",
                    "backSpin": "Rücken Massage",
                    "older": "Massage für ältere Menscher",
                    "relaxBody": "Entspannende Ganzkörpermassagе",
                    "ajurved": "Ayurvedische Brüstmassage für Frauen",
                    "antice": "Anti – Cellulite massage",
                    "relaxFoot": "Entspannende Füße – Waden massage",
                    "sepHead": "Kopfmassage",
                    "sepNeck": "Massage Schulter – Hals – Hände",
                    "sepStoma": "Bauchmassage",
                    "sepWaist": "Lendenwirbel – Gesäß – Beinmassage",
                    "sepPar": "Teilkörpermassage",
                    "labelMore": "Mehr",
                    "labelLess": "Weniger",
                    "buttonReserve": "Reservieren"

                },
                "ru": {
                    "limphoBody": "Лимфодренажный массаж тела (методика Паскаля Коше)",
                    "limphoFace": "Лимфодренажный массаж лица",
                    "stoneHotCold": "Массаж горячими камнями",
                    "backSpin": "Классический – Сегментный массаж спины",
                    "older": "Массаж для пожилых людей",
                    "relaxBody": "Расслабляющий массаж всего тела",
                    "ajurved": "Аюрведический массаж грудей",
                    "antice": "Антицеллюлитные массажы",
                    "relaxFoot": "Расслабляющий массаж стоп – голень",
                    "sepHead": "Массаж головы",
                    "sepNeck": "Плечо – шеи – рук массаж",
                    "sepStoma": "Абдоминальный массаж",
                    "sepWaist": "Поясницы – Ягодицы – Ног Массаж",
                    "sepPar": "Массаж отдельнных частей тело",
                    "labelMore": "Больше",
                    "labelLess": "Меньше",
                    "buttonReserve": "Резервировать"

                }
            };
        },
        getMassageBodyData: function () {
            return {
                "lt": {
                    "limphoBody": "Tai vienintelis būdas suaktyvinantis limfos tekėjimą, skatinantis skysčių, toksinų ir riebalų sankaupų pasišalinimą iš organizmo. Taip pagerėja galūnių kraujotaka, organizmas aprūpinamas deguonimi.",
                    "limphoBody2": "Masažas yra neskausmingas, malonus, o tam, kad būtų atkurta limfinės sistemos veikla ir matomi akivaizdūs rezultatai, paprastai užtenka maždaug 10 seansų. Masažo metu limfos cirkuliacija suaktyvinama net iki 10 kartų!",
                    "limphoFace": "Esant nuolatiniam stresui ir nuovargiui, veido raumenys sustingsta ,,liūdesio\" kaukėje.\n" +
                    "Sunkėja limfos nutekėjimas, o kartu toksinių medžiagų apykaitos produktų šalinimas.",
                    "limphoFace2": "Sumažinę veido suglebimą, sulaukiame ryškaus standinamojo efekto.\n" +
                    "Terapijai ši procedūra skiriama kasdien arba kas 2 dieną, profilaktiškai – 2–3 kartus per savaitę. Norimas efektas pasiekiamas po 15 procedūrų.",
                    "stoneHotCold": "Akmenys, naudojami masažui buvo surinkti Baltijos pakrantėje. Jie, tūkstantmečiais augdami jūros dugne prisisodrina didžiule sūrių vandenų galia ir išmesti į krantą susijungia su Saulės spindulių vibracijomis įgyja unikalias savybes, kurios veikia žmogaus kūną.",

                    "stoneHotCold1":"Akmenys turi gebėjimą iš raumenų pašalinti toksinus, sukauptus dėl streso ir nesveiko gyvenimo būdo.",
                    "stoneHotCold2": "Po masažo jausitės pailsėję ir atgausite jėgas, po kūną pasklis jauki šiluma, grįš fizinė ir emocinė pusiausvyra.\n" +
                    "Nėštumo metu, vėžio ir infekcinių ligų atveju, šis masažas nerekomenduojamas.",

                    "backSpin": "Šis masažas idealiai tinka žmonėms, kurie visą dieną praleidžia, pavyzdžiui: ",
                    "backSpin2": "Periodiškai atliekamas masažas padės atsikratyti dažnų nugaros ir galvos skausmų, atpalaiduoti įtemptas raumenų grupes. ",
                    "older": "Masažas yra būtina ir labai naudinga procedūra pagyvenusiems žmonėms, pensininkams. Tyrimai parodė, kad masažas lėtina senėjimo procesą. Taip pat masažas veikia raminančiai visą organizmą ir gali sumažinti skausmus. Masažas gali padėti žmonėms, kenčiantiems raumenų skausmus ar sergantiems atritu. Kada žmogus kenčia, jis tampa vis mažiau aktyvus, nukenčia gyvenimo kokybė ir sveikata. Masažas gerina kraujotaką, pašalina raumenų nuovargį ir raumenys įgauna tonusą. Dėl to pagerėja pagyvenusio žmogaus gyvenimo kokybė. \n" +
                    "Prieš masažą Jums gerai būtų pasikonsultuoti su savo gydytoju. Kai tik gausite gydytojo leidimą masažui, jus drąsiai galite kreiptis pas mane.",
                    "relaxBody": "Atpalaiduojantis masažas tinka visiems, norintiems atsipalaiduoti po sunkios dienos, užsimiršti bei pabėgti nuo kasdienės rutinos. Pašalina įtampą ir stresą, atslūgsta nugaros ir galvos skausmai, atsipalaiduoja raumenys, teigiamai veikia vidinę organizmo būseną, pagerina nuotaiką bei grąžina energiją.",
                    "ajurved": "Yra skirtas krūtinės sričiai. Jis atliekamas ne tik norint pagražinti krūtinę, sustangrinti krūtis, suteikti joms gražią formą, bet ir siekiant gilesnių terapinių tikslų. Šis masažas daro teigiamą įtaką visų moters reprodukcinių organų sistemai bei padeda subalansuoti hormonų sistemos veiklą. Labai sumažina nemalonų krūtų jautrumą, susijusį su menstruacijų ciklu. Praktiškai išnyksta krūtų vėžio rizika. Švelnėja implantų surandėjimai.\n" +
                    "Toks masažas pagerina savijautą, padaro krūtis gražesnes, suteikia pasitikėjimo ir padeda geriau jaustis kaip moteriai.",
                    "antice": "Tai ypač efektyvus kovos su celiulitu būdas, taikomas tam tikrų probleminių sričių – šlaunų, sėdmenų ir pilvo – netolygiam poodiniam sluksniui (celiulitui) mažinti. \n" +
                    "Masažas aktyvina limfotaką, padidina raumenų susitraukimą ir tonusą dėl to, mažėja celiulitas ir patinimai. Išvalo organizmą nuo šlakų bei suteikia ryškiai išreikštą kosmetinį efektą. \n" +
                    "Masažas su Tibeto moline taure yra pats švelniausias – nepalieka mėlynių, nežaloja kapiliarų.\n" +
                    "Naudojant Tibeto molinę vakuuminę taurę.",
                    "relaxFoot": "Taikomas pavargusioms, skausmingoms pėdoms ir blauzdoms atpalaiduoti, kūno gyvybiniam tonusui padidinti, imunitetui stiprinti. Ši procedūra tinka daug vaikštantiems, dirbantiems stovimą arba žmonėms šąlančiomis kojomis. Pėdų, blauzdų masažas padeda atsigauti ir pailsėti visam organizmui.",

                    "sepHead": "Sumažina stresą, galvos skausmus, gerina kraujo apytaką.",
                    "sepNeck": "Efektyviausia nemalonių simptomų šalinimo priemonė. Jau po pirmo karto jus pajusite bendrą savijautos pagerėjimą. Po pilno masažo kurso skausmingi pojūčiai išnyksta, atsiranda žvalumas, padidėja darbingumas, išnyksta nemiga ir irzlumas. Tai yra puiki priemonė atsikratyti galvos, kaklo, pečių skausmo, rankų tirpimo jausmo.",
                    "sepStoma": "Stimuliuoja virškinimą, turi teigiamą poveikį vidinių organų veiklai, gerina virškinimo trakto funkcijas ir tulžies sekreciją, padeda su vidurių užkietėjimais arba dujų susikaupimo žarnyne",
                    "sepWaist": "Gerina kraujo ir limfos apytaką juosmens bei kojų srityse, atpalaiduoja įsitempusius raumenis, mažina juosmens, sėdmenų, kojų skausmą, stiprina nusilpusius raumenis. Sumažina skausmą po operacijos, mažina nervinių šaknų uždegimą."


                },
                "de": {
                    "limphoBody": "Dies ist die einzige Art und Weise löst Lymphfluss, ermutigende Flüssigkeiten, Toxine, die Entfernung von Fettablagerungen im Körper. Dies verbessert die Blutzirkulation der Gliedmaßen und versorgt den Körper mit Sauerstoff.",
                    "limphoBody2": "Die Massage ist schmerzlos und angenehm. In der Regel reichen etwa 10 Sitzungen, um das Lymphsystem wieder Ergebnisse zu machen. Massage Lymphzirkulation wird bis zu 10 Mal aktiviert!",
                    "limphoFace": "Bei konstantem Stress und Müdigkeit sind die Gesichtsmuskeln in der Maske der \"Traurigkeit\" eingefroren.\n" +
                    "Die manuelle Lymphdrainage ist eine exklusive Prozedur.\n" +
                    "Entfernt unnötige Flüssigkeiten, Schlacken und Schwellungen aus dem Körper.",
                    "limphoFace2": "Durch die Verwendung einer Lymphdrainage-Massage können spürbare, effektive Ergebnisse erzielt werden!\n" +
                    "Zur Behandlung wird dieses Verfahren täglich oder alle zwei Tage;\n" +
                    " 2-3 Mal pro Woche zur Vorbeugung.\n" +
                    " Die gewünschte Wirkung wird nach 15 Behandlungen erreicht.",
                    "stoneHotCold": "Die Steine, die bei dieser Massage eingesetzt werden, wurden an der Küste der Ostsee gesammelt. Über Tausende von Jahren waren sie den Kräften des Meeres ausgesetzt, wurden von Sonne, Luft und Winden geformt und erhielten so ihre einzigarten Formen und Eigenschaften, die den menschlichen Körper positiv beeinflussen. ",
                    "stoneHotCold1": "Die Steine haben die Fähigkeit, Giftstoffe und angestauten Stress abzubauen sowie Anspannungen zu lösen. Sie verbessern den Schlaf, unterstützen den Blutdruck und ihre Energie wirkt sich positiv aufs Herz aus und reguliert so die körpereigenen, natürlichen Kräfte. Diese Massage eignet sich deshalb besonders gegen Müdigkeit und Stress, da die Wärme der Steine muskelentspannend wirken. Die Abwechslung mit den kühlen Steinen wirkt sich dabei vitalisierend auf das vegetative Nervensystem aus und entspannt zudem verkrampfte Rücken–, Kopf– und Nackenmuskulatur. ",
                    "stoneHotCold2": "Nach der Massage werden Sie sich entspannt fühlen und verjüngen den Körper verbreitet Wärme, die körperliche und emotionale Gleichgewicht zurückgibt.\n" +
                    "Bei Schwangerschaft, Infektions– und Krebskrankheiten wird diese Massage nicht empfohlen.",

                    "backSpin": "Die Rücken Massage den Rücken und insbesondere der Schulter– und Nackenbereich optimal zu entspannen. Ist eine stark energetische Massage, Blockaden zu lösen. Diese Massage ist ideal für Menschen, die den ganzen Tag im Stehen oder Sitzen verbringen, zum Beispiel:",
                    "backSpin2": "Eine regelmäßige Massage hilft Ihnen dabei, sich zu befreien häufige Rückenschmerzen, Kopfschmerzen, Muskelverspannungen. Nach der Massage fühlen Sie sich entspannt und voller Energie.",
                    "older": "Massage ist ein notwendiges und sehr nützliches Verfahren für ältere Menschen, Rentner. Studien haben gezeigt, dass die Massage den Alterungsprozess verlangsamt. Auch Massage hat eine beruhigende Wirkung im ganzen Körper und kann Schmerzen reduzieren. \n" +
                    "Мassage kann Menschen helfen, die unter Muskelschmerzen leiden: Zum Beispiel, diejenigen, die an Arthritis leiden, Massage hilft, Schmerzen zu reduzieren, erhöht die Amplitude der Bewegung in den Gelenken. Wenn eine Person leidet, wird sie immer weniger aktiv und beeinflusst die Lebensqualität und Gesundheit. Massage verbessert die Durchblutung, beseitigt Muskelermüdung und Muskeln erhalten Ton. Dies verbessert die Lebensqualität einer älteren Person. \n" +
                    "Vor einer Massage ist es ratsam, einen Arzt zu konsultieren. Sobald Sie die Erlaubnis vom Arzt für eine Massage bekommen, können Sie sich mit mir in Verbindung setzen.",
                    "relaxBody": "Entspannende Massage für diejenigen, die nach einem anstrengenden Tag entspannen wollen, vergessen und weg von der täglichen Routine. Beseitigt Spannung und Stress, Anfälle, und Kopfschmerzen, entspannt die Muskeln, wirkt sich positiv auf den inneren Zustand des Körpers, verbessert die Stimmung und liefert die Energie wieder hergestellt. \n" +
                    "Absolute Entspannung von Kopf bis Fuss. Die umfassende Massage löst Verspannungen, lockert Muskeln und verleiht neue Energie und Vitalität.",
                    "ajurved": "Ayurveda empfiehlt der Brüstemassage, denn hierdurch entsteht ein optimaler Stimulus zur Harmonisierung des weiblichen Hormonzyklus. Die Massage sorgt für straffe Haut und straffes Bindegewebe, verhindert Brustschmerzen, Verspannungen und Entzündungen im Brustbereich, beugt Zystenbildung und Brustkrebs vor, aktiviert das Herz und das Herzchakra. \n" +
                    "Die Massage wird mit der Verwendung von Pflanzenölen durchgeführt und dauert bis zu einer Stunde. Inklusive Arbeit mit dem Hals (Rücken– und Vorderflächen) und Schultern, Arbeiten mit dem Unterarmbereich, Hände, Bauch und natürlich mit der Brust.",
                    "antice": "Dies ist eine besonders effektive Möglichkeit zur Bekämpfung von Cellulite, die verwendet wird, uneben subkutanes (Cellulite) Probleme in spezifischen Problembereichen zu reduzieren – Oberschenkel, Gesäß und Bauch. \n" +
                    "Massage stimuliert die Zirkulation der Lymphe, erhöht Muskeltonus und Kontraktion durch die Reduzierung von Cellulite und Schwellungen. Löscht den Körper von Toxinen und hat eine ausgeprägte kosmetische Wirkung. \n" +
                    "Dies ist die kleinste Methode – verlässt keine Prellungen.\n" +
                    "Der tibetische Vakuum Cup wird verwendet.",
                    "relaxFoot": "Gebrauchte müde Füsse und Waden zu entspannen, erhöhen Vitalität, Verbesserung der Immunität. Dieses Verfahren eignet sich für viele Menschen, die stehen oder eine Menge Leute auch, die einen kalten Fusse haben. Massage der Füsse, Waden hilft, den ganzen Körper wiederherzustellen und zu atmen.",

                    "sepHead": "Entspannt bei Stress, lindert Krämpfe, verbessert den Blutkreislauf.",
                    "sepNeck": "Die effektivste Behandlung, sowie ein Heilmittel für die Beseitigung von unangenehmen Symptomen. Nach der ersten Massage des Halses, fühlen Sie eine allgemeine Verbesserung in Ihrem Gesundheitszustand. Nach einem vollen Massagen verschwinden schmerzhafte Empfindungen, die Arbeitskapazität steigt, Schlaflosigkeit und Reizbarkeit verschwinden. Nackenmassage ist ein ausgezeichnetes Werkzeug, um Kopfschmerzen loszuwerden. \n" +
                    "Dies ist eine hervorragende Maßnahme zur Reduzierung von Kopf, Hals, Schulter Schmerzen, Taubheit Hände.",
                    "sepStoma": "Regt die Verdauung an, wirkt sich positiv auf die intra–abdominalen Organe aus, verbessert Magen– und Darmfunktionen sowie die Gallensekretion, hilft bei Verstopfung oder Gasansammlung im Darm.",
                    "sepWaist": "Verbessert die Blut– und Lymphzirkulation im unteren Rücken und in den Beinen, entspannt enge Muskeln, Gesäß, Beinschmerzen, stärkt die geschwächten Muskeln. Verringert den Schmerz nach der Operation, reduziert die Entzündung der Nervenwurzeln."


                },
                "ru": {
                    "limphoBody": "Это единственный способ активировать лимфоток, способствующий удалению жидкости, токсинов и жировых отложений из организма. Это улучшает кровообращение конечностей и обеспечивает организм кислородом.",
                    "limphoBody2": "Массаж безболезненный, приятный, и обычно достаточно около 10 сеансов, чтобы восстановить лимфатическую систему до видимых результатов. Массаж активизирует циркуляцию лимфы до 10 раз!",
                    "limphoFace": "В случае постоянного стресса и усталости, мышцы лица замораживаются в маске «грусти».\n" +
                    "Ручной лимфодренаж - эксклюзивная процедура. ",
                    "limphoFace2": "Благодаря применению лимфодренажного массажа можно достигнуть ощутимых эффективных результатов!\n" +
                    "Для лечения эту процедуру назначают ежедневно или каждые 2 дня, 2-3 раза в неделю для профилактики. Желаемый эффект достигается после 15 процедур.",
                    "stoneHotCold": "Камни, используемые в массаже, собранных на побережье Балтийского моря. Они растут на протяжении тысяч лет на морском дне обогащает огромную силу и солоноватой воды нити в сочетании с солнечным светом колебания приобретают уникальные характеристики, которые влияют на организм человека.",
                    "stoneHotCold1": "Камень имеет способность из мышц удалить токсины, накопленные в результате стресса и нездорового образа жизни.",
                    "stoneHotCold2": "После массажа вы будете чувствовать себя отдохнувшими и восстановится силы по телу распространится тепло возвратится физический и эмоциональный баланс.\n" +
                    "Во время беременности, рака и инфекционных заболеваний, этот массаж не рекомендуется.",
                    "backSpin": "Этот массаж идеально подходит для людей, которые проводят весь день стоя или сидя, например:",
                    "backSpin2": "Периодический массаж поможет вам избавиться от частых болей в спине, головных болей, расслабить напряженные группы мышц. После массажа вы почувствуете себя расслабленным и энергичным.",
                    "older": "Массаж – необходимая и очень полезная процедура для пожилых людей, пенсионеров. Исследования показали, что массаж замедляет процесс старения. Также массаж оказывает успокаивающее действие по всему телу и может уменьшить боль. Массаж может помочь людям, страдающим от мышечных болей : Например, те кто страдает от артрита, массаж помогает уменьшить боль, увеличивает амплитуду движения в суставах. Когда человек страдает, он становится все менее и менее активным, влияющий на качество жизни и здоровье. Массаж улучшает кровообращение, устраняет мышечную усталость, а мышцы получают тонус. Это улучшает качество жизни пожилого человека. \n" +
                    "Перед массажем необходимо проконсультироваться с врачом. Как только вы получите разрешение врача на массаж, вы можете спокойно связаться со мной.",
                    "relaxBody": "Aсслабляющий массаж для тех, кто хочет расслабиться после напряженного рабочего дня, забыть и уйти от ежедневной рутины. Устраняет напряжение и стресс, спазмы cпины и головные боли, расслабляет мышцы, позитивно влияет на внутреннее состояние организма, улучшает настроение и восстанавливает энергию.",
                    "ajurved": "Он оказывает положительное влияние на всю систему репродуктивных органов у женщин и помогает сбалансировать гормональную систему, уменьшает неприятное ощущение груди, связанное с менструальным циклом, у грудей появляетса упругость, улучшается их форма, делает их более здоровыми и практически исчезает риск рака молочной железы. \n" +
                    "Массаж выполняется с применением растительных масел и длится до одного часа. Включает в себя работу с шеей (задняя и передняя поверхности) и плечами, работу с областью подмышек, руками, животом, и, конечно же, с грудью.",
                    "antice": "Это особенно эффективный способ борьбы с целлюлитом, который используется для уменьшения неравномерной подкожной (целлюлитной) проблемы в определенных проблемных областях – бедрах, ягодицах и брюшной полости. \n" +
                    "Массаж стимулирует циркуляцию лимфы, повышает мышечный тонус и сокращение за счет уменьшения целлюлита и припухлости. Очищает организм от шлаков и оказывает выраженный косметический эффект. \n" +
                    "Это является самым небольным методом – не оставляет синяков. Используется тибетская глиняная чаша",
                    "relaxFoot": "Используется для расслабления усталых стоп и голень, увеличения жизненого тонуса, повышения иммунитета. Эта процедура подходит для многих людей, которые работают стоя или много ходитб также людей у которых мёрзнит стопы. Массаж стоп, голень помогает восстановить и одохнуть всему телу.",

                    "sepHead": "Уменьшает стресс, головные боли, улучшает кровообращение.",
                    "sepNeck": "Наиболее эффективное средство для устранения неприятных симптомов. Уже после первого раза вы почувствуете улучшение общего состояния. После полного курса массажа исчезают болезненные ощущения, поевляетса бодрость, возрастает работоспособность, исчезает бессонница и раздражительность. Это отличный способ избавиться от боли в голове, шее, плечах и онемение рук.",
                    "sepStoma": "Стимулирует пищеварение, оказывает положительное влияние на внутрибрюшные органы, улучшает функции желудка и кишечника, а также секрецию желчи, помогает при запоре или накоплении газа в кишечнике.",
                    "sepWaist": "Улучшает циркуляцию крови и лимфы в пояснице и ногах, расслабляет напряженные мышцы, уменьшает поясничные, ягодицы, ногах боль, укрепляет ослабленные мышцы. Уменьшает боль после операции, уменьшает воспаление нервных корешков."


                }
            };
        },
        getPrices: function () {
            return {
                "lt": {
                    "title": "Kainos",
                    "spaTitle": ["Spa masažai", "60min", "90min", "120min"],
                    "limphoBody": ["Limfodrenažinis kūno masažas", "–", "140 CHF", "–"],
                    "limphoFace": ["Limfodrenažinis veido masažas", "100 CHF", "–", "–"],
                    "stoneHotCold": ["Karštų – šaltų akmenų masažas", "–", "–", "220 CHF"],
                    "backSpin": ["Klasikinis – segmentinis nugaros masažas", "100 CHF", "150 CHF", "–"],
                    // "older": ["Masažas vyresnio amžiaus žmonėms"],
                    "relaxBody": ["Atpalaiduojantis viso kūno masažas", "–", "–", "200 CHF"],
                    "ajurved": ["Ajurvedinis krūtų masažas moterims", "100 CHF", "–", "–"],
                    // "antice": ["Anticeliulitinis masažas rankomis"],
                    "relaxFoot": ["Atpalaiduojantis pėdų–blauzdų masažas", "100 CHF", "–", "–"],
                    "anticel": ["Anticeliulitiniai masažai", "–", "130 CHF", "180 CHF"],
                    "antiSed": ["Sėdmenų masažas", "–", "130", "180"],
                    "antiTig": ["Šlaunų masažas", "–", "130", "180"],
                    "antiSto": ["Pilvo masažas", "70", "130", "180"],
                    "antiTro": ["Žąsto masažas", "–", "130", "180"],
                    // "sepPar": ["Atskirų kūno dalių masažai", "30min", "60min", "90min"],
                    "sepPar": ["Atskirų kūno dalių masažai", "50 CHF", "100 CHF", "150 CHF"],

                    "waist": ["Juosmens, sėdmenų, kojų masažas", "50", "100", "–"],
                    "neck": ["Pečių, kaklo, rankų masažas", "50", "100", "–"],
                    "head": ["Galvos masažas", "50", "–", "–"],
                    "stoma": ["Pilvo masažas", "50", "–", "–"],
                    "kidsMas": ["Vaikams (12–15m)", "60min", "90min", "120min"],
                    "kidBackSpin": ["Klasikinis segmentinis nugaros masažas", "80", "120", "–"],
                    "kidsNeck": ["Pečių, kaklo, rankų masažas", "80", "–", "–"],
                    "kidsWaist": ["Juosmens, sėdmenų, kojų masažas", "80", "–", "–"],
                    "kidsFull": ["Viso kūno masažas", "–", "–", "160"],
                    "otherTitle": ["Kiti masažai", "30min", "60min", "90min"],


                },
                "de": {
                    "title": "Preise",
                    "spaTitle": ["Spa–Massagen", "60min", "90min", "120min"],
                    "limphoBody": ["Manuelle Lymphdrainage", "–", "140 CHF", "–"],
                    "limphoFace": ["Manuelle Lymphdrainage Gesicht", "100 CHF", "–", "–"],
                    "stoneHotCold": ["Heiß–kalt Steinmassage", "–", "–", "220 CHF"],
                    "backSpin": ["Rücken Massage", "100 CHF", "150 CHF", "–"],
                    // "older": ["Massage für ältere Menscher"],
                    "relaxBody": ["Entspannende Ganzkörpermassagе", "–", "–", "200 CHF"],
                    "ajurved": ["Ayurvedische Brüstmassage für Frauen", "100 CHF", "–", "–"],
                    // "antice": ["Anti–Cellulite massage"],
                    "relaxFoot": ["Entspannende Füße – Waden massage", "100 CHF", "–", "–"],
                    "anticel": ["Anti–Cellulite–Massagen", "–", "130 CHF", "180 CHF"],
                    "antiSed": ["Gesäß", "–", "130", "180"],
                    "antiTig": ["Die Oberschenkel", "–", "130", "180"],
                    "antiSto": ["Bauch", "70", "130", "180"],
                    "antiTro": ["Oberarmmassage", "–", "130", "180"],
                    // "sepPar": ["Teilkörpermassage", "30min", "60min", "90min"],
                    "sepPar": ["Teilkörpermassage", "50 CHF", "100 CHF", "150 CHF"],
                    "waist": ["Massage Schulter–Hals–Hände", "50", "100", "–"],
                    "neck": ["Lendenwirbel – Gesäß – Beinmassage", "50", "100", "–"],
                    "head": ["Kopfmassage", "50", "–", "–"],
                    "stoma": ["Bauchmassage", "50", "–", "–"],
                    "kidsMas": ["Für kinder ab 12 bis 15 jahren", "60min", "90min", "120min"],
                    "kidBackSpin": ["Rückenmassage", "80", "120", "–"],
                    "kidsNeck": ["Massage Schulter–Hals–Hände", "80", "–", "–"],
                    "kidsWaist": ["Lendenwirbel – Gesäß – Beinmassage", "80", "–", "–"],
                    "kidsFull": ["Ganzkörpermassagе", "–", "–", "160"],
                    "otherTitle": ["Andere Massagen", "30min", "60min", "90min"]
                },
                "ru": {
                    "title": "Цены",
                    "spaTitle": ["Спа–массажы", "60min", "90min", "120min"],
                    "limphoBody": ["Лимфодренажный массаж тела", "–", "140 CHF", "–"],
                    "limphoFace": ["Лимфодренажный массаж лица", "100 CHF", "–", "–"],
                    "stoneHotCold": ["Горячих – холодных камней массаж", "–", "–", "220 CHF"],
                    "backSpin": ["Классический – Сегментный массаж спины", "100 CHF", "150 CHF", "–"],
                    // "older": ["Массаж для пожилых людей"],
                    "relaxBody": ["Расслабляющий массаж всего тела", "–", "–", "200 CHF"],
                    "ajurved": ["Аюрведический массаж грудей", "100 CHF", "–", "–"],
                    // "antice": ["Антицеллюлитный массаж"],
                    "relaxFoot": ["Расслабляющий массаж стоп–голень", "100 CHF", "–", "–"],
                    "anticel": ["Антицеллюлитные массажы", "–", "130 CHF", "180 CHF"],
                    "antiSed": ["Ягодицы", "–", "130", "180"],
                    "antiTig": ["Бедры", "–", "130", "180"],
                    "antiSto": ["Живота", "70", "130", "180"],
                    "antiTro": ["Массаж Предплечье", "–", "130", "180"],
                    // "sepPar": ["Массаж отдельнных частей тело", "30min", "60min", "90min"],
                    "sepPar": ["Массаж отдельнных частей тело", "50 CHF", "100 CHF", "150 CHF"],
                    "waist": ["Поясницы– Ягодицы – Ног массаж", "50", "100", "–"],
                    "neck": ["Плечо – шеи – рук массаж", "50", "100", "–"],
                    "head": ["Galvos masažas", "50", "–", "–"],
                    "stoma": ["Pilvo masažas", "50", "–", "–"],
                    "kidsMas": ["Для детей от 12 до 15 лет", "60min", "90min", "120min"],
                    "kidBackSpin": ["Классический – Сегментный массаж спины", "80", "120", "–"],
                    "kidsNeck": ["Плечо – шеи – рук массаж", "80", "–", "–"],
                    "kidsWaist": ["Поясницы– Ягодицы – Ног массаж", "80", "–", "–"],
                    "kidsFull": ["Массаж всего тела", "–", "–", "160"],
                    "otherTitle": ["Другие массажи", "30min", "60min", "90min"]
                }
            };


        },
        getFormNames: function () {
            return {
                "lt": {
                    "name": "Vardas",
                    "surname": "Pavardė",
                    "email": "Elektroninis paštas",
                    "phone": "Telefono numeris",
                    "massage": "Masažas",
                    "massageOption": "Trukmė",
                    "date": "Data",
                    "time": "Laikas",
                    "message": "Žinutė",
                    "button": "Rezervuoti",
                    "title": "Užsisakykite masažą jums patogiu laiku!",
                },
                "de": {
                    "name": "Name",
                    "surname": "Nachname",
                    "email": "E–Mail",
                    "phone": "Telefonnummer",
                    "massage": "Massage",
                    "massageOption": "Dauer",
                    "date": "Datum",
                    "time": "Zeit",
                    "message": "Nachricht",
                    "button": "Buche es",
                    "title": "Buchen Sie Ihre Massage nach Ihren Wünschen!"

                },
                "ru": {
                    "name": "Имя",
                    "surname": "Фамилия",
                    "email": "Электронная почта",
                    "phone": "Номер телефона",
                    "massage": "Массаж",
                    "massageOption": "Продолжительность",
                    "date": "Дата",
                    "time": "Время",
                    "message": "Сообщение",
                    "button": "Забронировать",
                    "title": "Зaкажите свой массаж в удобное для вас время!"

                }
            }
        },
        getPlaceHolders: function () {
            return {
                "lt": {
                    "name": "Įveskite vardą",
                    "surname": "Įveskite pavardę",
                    "email": "Įveskite elektroninį paštą",
                    "phone": "Įveskite telefono numerį",
                    "massage": "Pasirinkite masažą",
                    "massageOption": "Pasirinkitę masažo trukmę",
                    "date": "Pasirinkite datą",
                    "time": "Pasirinkite laiką",
                    "message": "Papildomi pageidavimai",

                },
                "de": {
                    "name": "Geben Sie einen Namen ein",
                    "surname": "Geben Sie einen Nachnamen ein",
                    "email": "E–Mail eingeben",
                    "phone": "Geben Sie eine Telefonnummer ein",
                    "massage": "Wählen Sie eine Massage",
                    "massageOption": "Die Dauer der Massage gewählt haben",
                    "date": "Wählen Sie ein Datum aus",
                    "time": "Wähle eine Zeit aus",
                    "message": "Zusätzliche Anfragen"

                },
                "ru": {
                    "name": "Введите имя",
                    "surname": "Введите фамилию",
                    "email": "Введите адрес электронной почты",
                    "phone": "Введите номер телефона",
                    "massage": "Выберите массаж",
                    "massageOption": "Выберите продолжительность массажа",
                    "date": "Выберите дату",
                    "time": "Выберите время",
                    "message": "Дополнительные запросы"
                }

            }

        },
        getFormErrors: function () {
            return {
                "lt": {
                    "name": "Neįvestas vardas",
                    "surname": "Neįvesta pavardė",
                    "email": "Neįvestas elektroninis paštas",
                    "phone": "Neįvestas telefono numeris",
                    "massage": "Nepasirinktas masažas",
                    "massageOption": "Nepasirinkta masažo trukmė",
                    "date": "Nepasirinkta data",
                    "time": "Nepasirinktas laikas",
                    "emailBadFormat": "Neteisingas elektroninio pašto adresas",
                    "captcha": "Patvirtinkite, kad esate ne robotas"
                },
                "de": {
                    "name": "Kein Name eingegeben",
                    "surname": "Nachname nicht eingegeben",
                    "email": "Keine E–Mail–Adresse eingegeben",
                    "phone": "Telefonnummer nicht eingegeben",
                    "massage": "Massage ist nicht ausgewählt",
                    "massageOption": "Die Massagezeit ist nicht ausgewählt",
                    "date": "Kein Datum ausgewählt",
                    "time": "Keine Zeit ausgewählt",
                    "emailBadFormat": "Ungültige E–Mail–Adresse",
                    "captcha": "Bestätigen Sie, dass Sie sind kein Roboter"


                },
                "ru": {
                    "name": "Имя не введено",
                    "surname": "Фамилия не введена",
                    "email": "Не введено электронное письмо",
                    "phone": "Номер телефона не введен",
                    "massage": "Массаж не выбран",
                    "massageOption": "Продолжительность массажа не выбрано",
                    "date": "Дата не выбрана",
                    "time": "Не выбрано времени",
                    "emailBadFormat": "Недопустимый адрес электронной почты",
                    "captcha": "Подтвердите, что вы не робот"


                }
            }
        },
        getContactUsData: function () {
            return {
                "lt": {
                    "secTitle": "Susisiekite su mumis",
                    "sentence": "Turite klausimų?  Klauskite ir atsakysime. Taip pat mus galite sekti socialiniuose tinkluose.",
                    "title": "Klauskite",
                    "name": "Vardas",
                    "namePH": "Įveskite vardą",
                    "email": "Elektroninis paštas",
                    "emailPH": "Įveskite elektroninį paštą",
                    "question": "Žinutė",
                    "questionPH": "Jūsų žinutė",
                    "button": "Siųsti",
                    "socNet": "Mūsų socialiniai tinklai",
                    "contacts": "Mūsų kontaktai"
                },
                "de": {
                    "secTitle": "Kontaktiere uns",
                    "sentence": "Haben Sie Fragen? Frage und antworte. Sie können uns auch in sozialen Netzwerken folgen.",
                    "title": "Fragen",
                    "name": "Name",
                    "namePH": "Geben Sie einen Namen ein",
                    "email": "E–Mail",
                    "emailPH": "E–Mail eingeben",
                    "question": "Frage",
                    "questionPH": "Deine Frage",
                    "button": "Senden",
                    "socNet": "Unsere sozialen Netzwerke",
                    "contacts": "Unsere Kontakte"

                },
                "ru": {
                    "secTitle": "Свяжитесь с нами",
                    "sentence": "Есть вопросы? Спросите и ответьте. Вы также можете следить за нами в социальных сетях.",
                    "title": "Спрашивать",
                    "name": "Имя",
                    "namePH": "Введите имя",
                    "email": "Электронная почта",
                    "emailPH": "Введите адрес электронной почты",
                    "question": "Вопрос",
                    "questionPH": "Ваш вопрос",
                    "button": "Послать",
                    "socNet": "Наши социальные сети",
                    "contacts": "Наши контакты"

                }
            }
        },
        getContactFormErrors: function () {
            return {
                "lt": {
                    "nameLength": "Vardas turi būti tarp 2 ir 100 simbolių",
                    "nameFormat": "Vardas negali turėti skaičių bei specialių simbolių",
                    "email": "Neįvestas elektroninis paštas",
                    "emailBadFormat": "Neteisingas elektroninio pašto adresas",
                    "message": "Neįvesta žinutė",
                    "captcha": "Patvirtinkite, kad esate ne robotas"
                },
                "de": {
                    "name": "Kein Name eingegeben",
                    "email": "Keine E–Mail–Adresse eingegeben",
                    "emailBadFormat": "Ungültige E–Mail–Adresse",
                    "message": "Nachricht nicht eingegeben",
                    "captcha": "Bitte bestätigen Sie, dass Sie kein Roboter sind"

                },
                "ru": {
                    "name": "Имя не введено",
                    "email": "Не введено электронное письмо",
                    "emailBadFormat": "Недопустимый адрес электронной почты",
                    "message": "Сообщение не введено",
                    "captcha": "Пожалуйста, подтвердите, что вы не робот"

                }
            }

        },

        getMassagesFromBackend: function () {
            return {
                "lt": {
                    "limphoBody": [
                        ["Limfodrenažinis kūno masažas", "0"], ["Limfodrenažinis veido masažas", "1"], ["Karštų – šaltų akmenų masažas", "2"], ["Klasikinis – segmentinis nugaros masažas", "3"], ["Atpalaiduojantis viso kūno masažas", "4"], ["Ajurvedinis krūtų masažas moterims", "5"], ["Atpalaiduojantis pėdų – blauzdų masažas", "6"], ["Anticeliulitiniai masažai", "7"], ["Atskirų kūno dalių masažai", "8"]]

                },
                "de": {
                    "limphoBody": [
                        ["Manuelle Lymphdrainage", "0"], ["Manuelle Lymphdrainage Gesicht", "1"], ["Heiß – kalt Steinmassage", "2"], ["Rücken Massage", "3"], ["Entspannende Ganzkörpermassagе", "4"], ["Ayurvedische Brüstmassage für Frauen", "5"], ["Entspannende Füße – Waden massage", "6"], ["Anti – Cellulite massage", "7"], ["Teilkörpermassage", "8"]]

                },
                "ru": {
                    "limphoBody": [
                        ["Лимфодренажный массаж тела", "0"], ["Лимфодренажный массаж лица", "1"], ["Горячих – холодных камней массаж", "2"], ["Классический – Сегментный массаж спины", "3"], ["Расслабляющий массаж всего тела", "4"], ["Аюрведический массаж грудей", "5"], ["Расслабляющий массаж стоп – голень", "6"], ["Антицеллюлитные массажы", "7"], ["Массаж отдельнных частей тело", "8"]]

                }
            }
        },

        getFFBEErrorMessages: function () {
            return {
                "lt": {
                    "nameFormat": "Vardas negali turėti skaičių bei specialių simbolių",
                    "nameLength": "Vardo ilgis turi būti nuo 2 iki 100 simbolių",
                    "surnameFormat": "Pavardė negali turėti skaičių bei specialių simbolių",
                    "surnameLength": "Pavardės ilgis turi būti tarp nuo 2 iki 100 simbolių",
                    "emailFormat": "Neteisingas elektroninio pašto adreso formatas",
                    "emailLength": "Elektroninio pašto adresas negali būti tuščias arba ilgesnis nei 100 simbolių",
                    "phoneFormat": "Neteisingai įvestas telefono numeris",
                    "phoneLength": "Telefono numeris turi būti nuo 9 iki 20 simbolių",
                    "massageFormat": "xxx1",
                    "massageLength": "Pasirinkite masažą",
                    "massageOptionFormat": "Pirmiausia pasirinkite masažą",
                    "massageOptionLength": "Pasirinkite masažo variantą",
                    "dateFormat": "Pasirinkite kitą datą",
                    "dateLength": "Pasirinkite datą",
                    "timeFormat": "Pirmiausia pasirinkite datą",
                    "timeLength": "Pasirinkite laiką",
                    "messageLength": "Žinutė negali viršyti 1000 simbolių",
                    "messageFormat": "Prašome nenaudoti tokių simbolių kaip '<>`'",
                    "captchaFormat": "Patvirtinkite, kad esate ne robotas",
                    "slots": "Atsiprašome, bet pasirinktai datai vietų nebėra. Pasirinkite kitą datą"
                },
                "de": {
                    "nameFormat": "Der Name darf keine Zahlen und Sonderzeichen enthalten",
                    "nameLength": "Die Länge des Namens muss zwischen 2 und 100 Zeichen betragen",
                    "surnameFormat": "Der Nachname darf keine Zahlen und Sonderzeichen enthalten",
                    "surnameLength": "Der Nachname muss zwischen 2 und 100 Zeichen lang sein",
                    "emailFormat": "Ungültiges E-Mail-Adressformat",
                    "emailLength": "Die E-Mail-Adresse darf nicht leer oder länger als 100 Zeichen sein",
                    "phoneFormat": "Ungültige Telefonnummer",
                    "phoneLength": "Die Telefonnummer muss zwischen 9 und 20 Zeichen lang sein",
                    "massageFormat": "xxx",
                    "massageLength": "Wählen Sie eine Massage",
                    "massageOptionFormat": "Wählen Sie zuerst eine Massage",
                    "massageOptionLength": "Wählen Sie eine Massageoption",
                    "dateFormat": "Wählen Sie ein anderes Datum",
                    "dateLength": "Wählen Sie ein Datum aus",
                    "timeFormat": "Wählen Sie zuerst ein Datum aus",
                    "timeLength": "Wähle eine Zeit aus",
                    "messageLength": "Die Nachricht darf nicht länger als 1000 Zeichen sein",
                    "messageFormat": "Bitte verwenden Sie nicht die folgenden Symbole '<>`'",
                    "captchaFormat": "Bestätigen Sie, dass Sie kein Roboter sind",
                    "slots": "Entschuldigung, aber für das ausgewählte Datum sind keine weiteren Standorte verfügbar. Wählen Sie ein anderes Datum"

                },
                "ru": {
                    "nameFormat": "Имя не может содержать числа и специальные символы",
                    "nameLength": "Длина имени должна быть от 2 до 100 символов",
                    "surnameFormat": "Фамилия не может содержать числа и специальные символы",
                    "surnameLength": "Фамилия должна быть от 2 до 100 символов",
                    "emailFormat": "Недопустимый формат адреса электронной почты",
                    "emailLength": "Адрес электронной почты не может быть пустым или длиннее 100 символов",
                    "phoneFormat": "Недопустимый номер телефона",
                    "phoneLength": "Номер телефона должен быть от 9 до 20 символов.",
                    "massageFormat": "xxx",
                    "massageLength": "Выберите массаж",
                    "massageOptionFormat": "Сначала выберите массаж",
                    "massageOptionLength": "Выберите вариант массажа",
                    "dateFormat": "Выберите другую дату",
                    "dateLength": "Выберите дату",
                    "timeFormat": "Сначала выберите дату",
                    "timeLength": "Выберите время",
                    "messageLength": "Сообщение не может превышать 1000 символов",
                    "messageFormat": "Пожалуйста, не используйте следующие символы '<>`'",
                    "captchaFormat": "Потвердите что вы не робот",
                    "slots": "Извините, но мест для выбранной даты больше нет. Выберите другую дату"


                }
            }
        },
        getContactFormBackendErrorMessages: function () {
            return {
                "lt": {
                    "nameFormat": "Vardas negali turėti skaičių bei specialių simbolių",
                    "nameLength": "Vardo ilgis turi būti nuo 2 iki 100 simbolių",
                    "emailFormat": "Neteisingas elektroninio pašto adreso formatas",
                    "emailLength": "Elektroninio pašto adresas negali būti tuščias arba ilgesnis nei 100 simbolių",
                    "messageLength": "Žinutė negali viršyti 1000 simbolių",
                    "messageFormat": "Prašome nenaudoti tokių simbolių kaip '<>`'",
                    "captchaFormat": "Patvirtinkite, kad esate ne robotas"
                },
                "de": {
                    "nameFormat": "Der Name darf keine Zahlen und Sonderzeichen enthalten",
                    "nameLength": "Die Länge des Namens muss zwischen 2 und 100 Zeichen betragen",
                    "emailFormat": "Ungültiges E-Mail-Adressformat",
                    "emailLength": "Die E-Mail-Adresse darf nicht leer oder länger als 100 Zeichen sein",
                    "messageLength": "Die Nachricht darf nicht länger als 1000 Zeichen sein",
                    "messageFormat": "Bitte verwenden Sie nicht die folgenden Symbole '<>`'",
                    "captchaFormat": "Bestätigen Sie, dass Sie kein Roboter sind"


                },
                "ru": {
                    "nameFormat": "Имя не может содержать числа и специальные символы",
                    "nameLength": "Длина имени должна быть от 2 до 100 символов",
                    "emailFormat": "Недопустимый формат адреса электронной почты",
                    "emailLength": "Адрес электронной почты не может быть пустым или длиннее 100 символов",
                    "messageLength": "Сообщение не может превышать 1000 символов",
                    "messageFormat": "Пожалуйста, не используйте следующие символы '<>`'",
                    "captchaFormat": "Потвердите что вы не робот",
                }
            }
        },
        getSucRespFullBookForm: function () {
            return {
                "lt": {
                    "response": "Ačiū, Jūsų laikas rezervuotas."

                },
                "de": {
                    "response": "Danke, Ihre Zeit ist reserviert."


                },
                "ru": {
                    "response": "Спасибо, ваше время зарезервировано."


                }
            }
        },
        getSucRespContactUsForm: function () {
            return {
                "lt": {
                    "response": "Ačiū, Jūsų klausimas gautas."

                },
                "de": {
                    "response": "Danke, Ihre Frage wurde empfangen."


                },
                "ru": {
                    "response": "Спасибо, ваш вопрос получен."


                }
            }
        }

    }

});
















