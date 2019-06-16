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
                    "about": "Apie mane",
                    "massages": "Masažai",
                    "gallery": "Galerija",
                    "prices": "Kainos",
                    "book": "Užsakyti",
                    "contacts": "Kontaktai",
                },
                "de": {
                    "about": "Über mich",
                    "massages": "Massagen",
                    "gallery": "Galerie",
                    "prices": "Preise",
                    "book": "Bestellen",
                    "contacts": "Kontakte",
                },
                "ru": {
                    "about": "Oбо мне",
                    "massages": "Mассажи",
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
                    "whoIAm": ["Mano vardas Vida. Atvykau iš Lietuvos. Gyvenu Šveicarijoje, Schaffhausen mieste.", "Man masažai – tai iššūkis ir malonumas", "Iššūkis – panaikinti skausmus žmogaus kūne", "Malonumas – kai nebelieka skausmų, dingsta įtampa, grąžinama gera savijauta, o žmogaus veide atsiranda šypsena", "Mano tikslas yra padėti žmonėms jaustis puikiai, bet kuriuo amžiaus periodu"],
                    "exp": ["Vilniaus aukštesnioji medicinos mokykla. Lietuva", "Klaipėdos universitetas. Bakalauro laipsnis “Visuomenės sveikata”. Lietuva", "\"Baltic SPA Professional\" kursai (Latvija), SPA masažai", "Slaugos darbuotojų tobulinimosi ir specializacijos centras: Pažymėjimas Nr. KV 120146 – suteikta teisė daryti gydomuosius masažus"],
                    "workExp": ["27 metai: medicinos sesuo", "8 metai: visuomenės sveikatos priežiūros specialistė", "9 metai: masažuotoja","3 metai: individuali veikla \"Fizinės gerovės užtikrinimo veikla\". Lietuva"],
                    "spa": ["Klasikinis segmentinis masažas", "Karštų akmenų masažas", "Limfodrenažinis masažas", "Tajų masažas", "Tradicinis ajurvedinis Keralos masažas", "Gydomieji masažai"],
                    "welcome":["Džiaugiuosi galėdama pasveikinti Jus mano masažo praktikoje!"],
                    "welcome2":["Linkiu gero laiko ir iki greito pasimatymo!"],
                    "hob1":["Pomėgiai:"],
                    "hob2":["Snieglenčių sportas, Skaitymas, Bėgimas, Sodas"]
                },
                "de": {
                    "whoIAm": ["Meine Name ist Vida. Ich komme aus Litauen. Ich wohne jetzt in der Schweiz, in der Stadt Schaffhausen.", "Für mich ist Massage eine Herausforderung und Vergnügen", "Die Herausforderung – beseitigen Schmerzen im menschlichen Körper", "Vergnügen – es mehr keinen Schmerz, verschwindet die Spannung, kommt die gut Gesundheit zurück, und ein Lächeln erscheint auf dem Gesicht der Mensch", "Mein Ziel – den Leuten zu helfen, sich in jedem Alter gut zu fühlen"],
                    "exp": ["Vilnius Höhere Medizinische Fakultät Litauen", "Klaipeda Universität. Bachelor Öffentliches Gesundheitswesen verliehen. Litauen", "\"Baltic SPA Profi\" Kurse (Lettland), SPA–Massagen", "Zentrum für Entwicklung und Spezialisierung des Pflegepersonals: Zertifikat Nr. 120146 KV – das Recht hat therapeutische Massage zu machen"],
                    "workExp": ["27 Jahre Erfahrung Krankenschwester", "8 Jahre Erfahrung Facharzt für öffentliche Gesundheit", "9 Jahre Erfahrung Masseurin","3 Jahre individuelle Aktivität \"Aktivitäten zum körperlichen Wohlbefinden\". Litauen"],
                    "spa": ["Klassische segmentale Massage", "Hot Stone Massage", "Lymphdrainage-Massage", "Thai-Massage", "Traditionelle ayurvedische Kerala-Massage", "Therapeutische Massage"],
                    "welcome":["Ich freue mich, dich in meiner Massage-Praxis zu begrüssen!"],
                    "welcome2":["Ich wünsche Dir eine gute Zeit und bis bald!"],
                    "hob1":["Hobbys:"],
                    "hob2":["Snowboarding, Lesen, Laufen, Garten"]
                },
                "ru": {
                    "whoIAm": ["Меня зовут Вида. Я приехала из Литвы. Теперь живу в Швейцарии, в городе Шаффхаузен.", "Для меня массаж – это вызов и удовольствие", "Вызов – устранить боль в теле человека", "Удовольствие – когда нет больше боли, напряжение исчезает, возвращается хорошее самочувствие, а на лице человека появляется улыбка", "Моя цель – помочь людям чувствовать себя прекрасно в любом возрасте"],
                    "exp": ["Вильнюсская высшая медицинская школа. Литва", "Клайпедский университет. Степень бакалавра в области общественного здравоохранения. Литва", "\"Baltic SPA Professional\" курсы (Латвия), спа–массажи", "Центр развития и специализации медсестринского персонала: Сертификат Нет. KV 120146 – предоставляется право делать терапевтические (лечебные) массажи"],
                    "workExp": ["27 лет: медицинская сестра", "8 лет: специалист общественного здравоохранения", "9 лет: массажист","3 года: индивидуальная деятельность «Физкультурно-оздоровительная деятельность». Литва"],
                    "spa": ["Классический сегментарный массаж", "Массаж горячими камнями", "Лимфодренажный массаж", "Тайский массаж", "Традиционный аюрведический Керал массаж", "Лечебные массажи"],
                    "welcome":["Я рада приветствовать Вас в моей массажной практике!"],
                    "welcome2":["Желаю вам хорошего времени и до скорой встречи!"],
                    "hob1":["Хобби:"],
                    "hob2":["Сноубординг, Чтение, Бег, Сад"]
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

                    "relaxBodyBulTit1":["Pašalina:"],
                    "relaxBodyBul1":["įtampą ir stresą","atslūgsta nugaros ir galvos skausmai","atsipalaiduoja raumenys","teigiamai veikia vidinę organizmo būseną","pagerina nuotaiką bei grąžina energiją"]


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

                    "backSpinBul1": ["am Computer oder beim Autofahren;", "sowie schwere körperliche Arbeit, wenn die ganze Macht in der Wirbelsäule, Nacken konzentriert, Schultern, Hüfte und Gesäß, Schmerzen in den Muskeln verursacht.", "Diese Massage eignet sich besonders nach dem Training.","Außerdem verursacht die falsche Position der Wirbelsäule oft Kopfschmerzen."],

                    "relaxBodyBulTit1":["Entfernt:"],
                    "relaxBodyBul1":["Spannung und Stress","Rücken- und Kopfschmerzen","Entspannt die Muskeln","wirkt sich positiv auf den inneren Zustand des Organismus aus","verbessert Stimmung und Energie"]




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

                    "backSpinBul1": ["за компьютером или за рулем автомобиля,", "а также тяжело физически работая, когда все напряжение сосредоточено в позвоночнике, шее и плечах, поясе и ягодицах, вызывая болезненные ощущения в мышцах..", "Этот массаж особенно подходит после тренировки.","Кроме того, неправильное положение позвоночника часто вызывает головную боль."],

                    "relaxBodyBulTit1":["Удаляет:"],
                    "relaxBodyBul1":["напряжение и стресс","боли в спине и голове","расслабляет мышцы","оказывает положительное влияние на внутреннее состояние организма","улучшает настроение и энергию"]

                }
            }
        },

        getMassagesTitles: function () {
            return {
                "lt": {
                    "limphoBody": "Limfodrenažinis kūno masažas (metodika pagal Pascal Kose)",
                    "limphoFace": "Limfodrenažinis veido masažas (metodika pagal Pascal Kose)",
                    "stoneHotCold": "Karštų akmenų masažas",
                    "backSpin": "Klasikinis – segmentinis nugaros masažas",
                    "older": "Masažas vyresnio amžiaus žmonėms",
                    "relaxBody": "Atpalaiduojantis viso kūno masažas",
                    "ajurved": "Ajurvedinis krūtų masažas moterims",
                    "antice": "Anticeliulitinis masažas rankomis (kojos, sėdmuo) ir vakuumine taurele",
                    "relaxFoot": "Sveikatą gerinantis pėdų masažas (+blauzdos)",
                    "sepHead": "Galvos masažas",
                    "sepNeck": "Pečių – kaklo – rankų masažas",
                    "sepStoma": "Pilvo masažas",
                    "sepWaist": "Juosmens – sėdmenų – kojų masažas",
                    "sepPar": "Juosmens – sėdmenų – kojų masažas",
                    "labelMore": "Daugiau",
                    "labelLess": "Mažiau",
                    "buttonReserve": "Rezervuoti",
                    "collar":"Apykaklės masažas",
                    "senior":"Masažas Senjorams"
                },
                "de": {
                    "limphoBody": "Lymphdrainage-Körpermassage (Methodik von Pascal Kose)",
                    "limphoFace": "Lymphdrainage Gesichtsmassage (Methodik von Pascal Kose)",
                    "stoneHotCold": "Hot Stone Massage",
                    "backSpin": "Klassische – Segmentale Rückenmassage",
                    "older": "Massage für ältere Menscher",
                    "relaxBody": "Entspannende Ganzkörpermassagе",
                    "ajurved": "Ayurvedische Brust-Massage für Frauen",
                    "antice": "Anti - Cellulite Massage (Beine und das Gesäß) von Hand und Vakuumschale",
                    "relaxFoot": "Gesundheitsfördernde Füße Massage (+Waden)",
                    "sepHead": "Kopfmassage",
                    "sepNeck": "Massage Schulter – Hals – Hände",
                    "sepStoma": "Bauchmassage",
                    "sepWaist": "Lendenwirbel – Gesäß – Beinmassage",
                    "sepPar": "Lendenwirbel – Gesäß - Beinmassage",
                    "labelMore": "Mehr",
                    "labelLess": "Weniger",
                    "buttonReserve": "Reservieren",
                    "collar":"Massage des Hals und Kragen Bereichs und der Oberarme",
                    "senior":"Massage für Senioren"

                },
                "ru": {
                    "limphoBody": "Лимфодренажный массаж тела (методика Паскаль Коше)",
                    "limphoFace": "Лимфодренажный массаж лица (методика Паскаль Коше)",
                    "stoneHotCold": "Массаж горячими камнями",
                    "backSpin": "Классический – Сегментный массаж спины",
                    "older": "Массаж для пожилых людей",
                    "relaxBody": "Расслабляющий массаж всего тела",
                    "ajurved": "Аюрведический массаж грудей (для женщин)",
                    "antice": "Антицеллюлитный массаж (Ноги и ягодицы) вручную и вакуумной чашей",
                    "relaxFoot": "Оздоровительный массаж стоп (+голень)",
                    "sepHead": "Массаж головы",
                    "sepNeck": "Плечо – шеи – рук массаж",
                    "sepStoma": "Абдоминальный массаж",
                    "sepWaist": "Поясницы – Ягодицы – Ног Массаж",
                    "sepPar": "Поясницы- Ягодицы - Ног Массаж",
                    "labelMore": "Больше",
                    "labelLess": "Меньше",
                    "buttonReserve": "Резервировать",
                    "collar":"Массаж шейно-воротниковой зоны",
                    "senior":"Массаж для пенсионеров"

                }
            };
        },
        getMassageBodyData: function () {
            return {
                "lt": {
                    "limphoBody": "Tai specialus viso kūno masažas, skiriamas ląstelių medžiagų apykaitos produktų, toksinų ir skysčių pertekliui pašalinti iš audinių. Masažas tinka visiems, kurie jaučia kojų paburkimą ar tiesiog nuovargį. Po ilgos darbo dienos jis puikiai atpalaiduoja pavargusias kojas ir suteikia lengvumo pojūtį. Po limfodrenažo kurso pranyksta pastovus, chroniškas nuovargis ir galvos skausmas, sumažinamas galūnių tinimas - limfedema (limfinė edema), pagerėja odos elastingumas. Norimas efektas pasiekiamas maždaug per 15 procedūrų. Profilaktiškai rekomenduojama atlikti 3 - 5 manualinio limfodrenažo seansus (kartą per dvi savaites), terapija akivaizdžiai ir ilgam pagerina Jūsų išvaizdą ir savijautą. Limfodrenažinis kūno masažas atliekamas tiek moterims, tiek vyrams.",
                    "limphoBody2": "Masažas yra neskausmingas, malonus, o tam, kad būtų atkurta limfinės sistemos veikla ir matomi akivaizdūs rezultatai, paprastai užtenka maždaug 10 seansų. Masažo metu limfos cirkuliacija suaktyvinama net iki 10 kartų!",
                    "limphoFace": "Esant nuolatiniam stresui ir nuovargiui, veido raumenys sustingsta \"liūdesio\"  kaukėje.\n" +
                    "Jei limfos sistema užteršta, tada sunkėja limfos nutekėjimas,  medžiagų apykaitos procesai organizme sulėtėja.\n" +
                    "Masažas gerina veido spalvą ir odos būklę. Pašalinama veide įtampa,  pagerėja kraujotaka, todėl oda, gavusi pilnavertį maitinimą, atrodo elastingesnė, gyvesnė ir sveikesnė.\n" +
                    "Veido limfodrenažas suteikia puikių rezultatų prie: veido pabrinkimo, išsausėjusios odos, ankstyvojo senėjimo, tamsių ratilų ir maišelių po akimis, sumažėjusio audinių elastingumo ir kovojant su kuperoze.\n" +
                    "Sumažinę veido suglebimą, sulaukiame ryškaus standinamojo efekto.\n" +
                    "\n" +
                    "Terapijai ši procedūra skiriama kasdien arba kas antrą dieną. Norimas efektas pasiekiamas maždaug per 15 procedūrų. \n" +
                    "Profilaktiškai rekomenduojama atlikti 3 - 5 manualinio limfodrenažo seansus (kartą per dvi savaites) terapija akivaizdžiai ir ilgam pagerina Jūsų išvaizdą ir savijautą.\n" +
                    "Limfodrenažinis veido masažas atliekamas tiek moterims, tiek vyrams.\n",
                    "stoneHotCold":"Akmenys, naudojami masažui buvo surinkti Baltijos pakrantėje. Jie, tūkstantmečiais augdami jūros dugne prisisodrina didžiule sūrių vandenų galia ir išmesti į krantą susijungia su Saulės spindulių vibracijomis įgyja unikalias savybes, kurios veikia žmogaus kūną.\n" +
                    "Akmenys turi gebėjimą iš raumenų pašalinti toksinus sukauptus dėl streso ir nesveiko gyvenimo būdo. Pagerinamas miegas. Masažas yra efektyvus esant nugaros ir kaklo skausmams, teigiamai veikia nervų sistemą, lėtiniam nuovargiui, migrenai, pirštų tirpimui, šalčio pojūčiui galūnėse ir t.t.\n" +
                    "Po masažo jausitės pailsėję ir atgausite jėgas po kūną pasklis jauki šiluma, grįš fizinė ir emocinė pusiausvyra.\n" +
                    "\n" +
                    "Nėštumo metu, vėžio ir infekcinių ligų atveju, šis masažas nerekomenduojamas.\n",
                    "stoneHotCold1":"Akmenys turi gebėjimą iš raumenų pašalinti toksinus, sukauptus dėl streso ir nesveiko gyvenimo būdo.",
                    "stoneHotCold2": "Po masažo jausitės pailsėję ir atgausite jėgas, po kūną pasklis jauki šiluma, grįš fizinė ir emocinė pusiausvyra.\n" +
                    "Nėštumo metu, vėžio ir infekcinių ligų atveju, šis masažas nerekomenduojamas.",

                    "backSpin": "Šis masažas idealiai tinka žmonėms, kurie visą dieną praleidžia, pavyzdžiui: prie kompiuterio ar vairuodami automobilį, dirbantiems sėdimą ar sunkų fizinį darbą įtampa susikaupia stuburo dalyje, kaklo ir pečių, juosmens ir sėdmenų srityse, ir dėl to susiformuoja skausmingi mazgai. Be to, dėl netaisyklingos stuburo padėties dažnai skauda galvą. \n" +
                    "Šis masažas ypač tinka po treniruočių.\n" +
                    "Periodiškai atliekamas masažas padės atsikratyti dažnų nugaros, galvos skausmų, atpalaiduoti įtemptas raumenų grupes.\n",
                    "backSpin2": "Periodiškai atliekamas masažas padės atsikratyti dažnų nugaros ir galvos skausmų, atpalaiduoti įtemptas raumenų grupes. ",
                    "older": "Masažas yra būtina ir labai naudinga procedūra pagyvenusiems žmonėms, pensininkams. Tyrimai parodė, kad masažas lėtina senėjimo procesą. Taip pat masažas veikia raminančiai visą organizmą ir gali sumažinti skausmus. Masažas gali padėti žmonėms, kenčiantiems raumenų skausmus ar sergantiems atritu. Kada žmogus kenčia, jis tampa vis mažiau aktyvus, nukenčia gyvenimo kokybė ir sveikata. Masažas gerina kraujotaką, pašalina raumenų nuovargį ir raumenys įgauna tonusą. Dėl to pagerėja pagyvenusio žmogaus gyvenimo kokybė. \n" +
                    "Prieš masažą Jums gerai būtų pasikonsultuoti su savo gydytoju. Kai tik gausite gydytojo leidimą masažui, jus drąsiai galite kreiptis pas mane.",
                    "relaxBody": "Šis masažas tinka visiems, norintiems atsipalaiduoti po sunkios dienos, užsimiršti bei pabėgti nuo kasdienės rutinos.\n" +
                    "Pašalina: įtampą ir stresą, atslūgsta nugaros ir galvos skausmai, atsipalaiduoja raumenys,     \n" +
                    "teigiamai veikia vidinę organizmo būseną, pagerina nuotaiką bei grąžina energiją.\n" +
                    "Vienas ar du šio atpalaiduojančio masažo seansai per savaitę garantuoja Jums gerą darbingumą, puikią nuotaiką ir savijautą.\n",
                    "relaxBody2":"Vienas ar du šio atpalaiduojančio masažo seansai per savaitę garantuoja Jums gerą darbingumą, puikią nuotaiką bei savijautą.",
                    "ajurved": "Masažas atliekamas ne tik norint pagražinti krūtinę, sustangrinti krūtis, suteikti joms gražią formą, bet ir siekiant gilesnių terapinių tikslų.\n" +
                    "Masažas daro teigiamą įtaką visų moters reprodukcinių organų sistemai bei padeda subalansuoti hormonų sistemos veiklą. Pastebimai sumažina nemalonų krūtų jautrumą  susijusį su menstruacijų ciklu. \n" +
                    "Praktiškai išnyksta krūtų vėžio rizika. \n" +
                    "Švelnėja implantų surandėjimai.\n" +
                    " Pagerina savijautą, padaro krūtis gražesnes, suteikia pasitikėjimo ir padeda geriau jaustis kaip moteriai. \n" +
                    "Masažas atliekamas naudojant augalinius aliejus ir trunka iki vienos valandos.\n" +
                    "Reguliarus masažas padeda pašalinti dažnus krūtų skausmus.\n",
                    "antice": "Nugalėkime celiulitą kartu!\n" +
                    "Daugybė moterų ieško būdų kaip nugalėti didžiausią gražių kojų priešą – celiulitą.\n" +
                    "Reklamuojami brangūs produktai ne visuomet būna efektyvūs, ne visuomet stebuklingai pašalina celiulitą. Todėl mokslininkai, tiriantys šią problemą, teigia, kad veiksmingus, gerus rezultatus žadantis gali būti tik kompleksinė terapija: subalansuota mityba + aktyvi fizinė veikla + anticeliulitinis masažas.\n" +
                    "Masažo metu šildoma oda, skatinama medžiagų apykaita, kraujotaka ir limfos apytaka. Probleminėse vietose atliekami specifiniai gilūs judesiai.\n" +
                    "Taigi, šis masažas gerina limfos tekėjimą, šalina iš organizmo šlakus, toksinus bei audiniuose susikaupusius skysčius. Gerina medžiagų apykaitą ląstelėse, aktyvina kraujotaką, atkuria mikrocirkuliaciją, minkština audinius ir gerina raumenų tonusą, ko pasekoje stangrėja oda.\n" +
                    "\n" +
                    "Rekomenduojama 10-15 procedūrų, atliekant jas kas antrą dieną. Po to procedūros atliekamos kelis kartus per mėnesį.\n",
                    "relaxFoot": "Pėdų masažas taikomas pavargusioms, skausmingoms kojoms atpalaiduoti, kūno     gyvybiniam tonusui padidinti bei imunitetui stiprinti. \n" +
                    "Taip pat šis masažas taikomas esant miego sutrikimams, įtampai ir stresui mažinti.\n" +
                    "Ypač tinka moterims ar merginoms, kurios dažnai dėvi aukštakulnius, antsvorį turintiems žmonėms ir nėščiosioms.\n" +
                    "Atliekant reguliariai pėdų masažą pamiršite skausmus !\n" +
                    "Rekomenduojamas 10-12 procedūrų kursas 2-3 k./sav.\n",

                    "sepHead": "Sumažina stresą, galvos skausmus, gerina kraujo apytaką.",
                    "sepNeck": "Efektyviausia nemalonių simptomų šalinimo priemonė. Jau po pirmo karto jus pajusite bendrą savijautos pagerėjimą. Po pilno masažo kurso skausmingi pojūčiai išnyksta, atsiranda žvalumas, padidėja darbingumas, išnyksta nemiga ir irzlumas. Tai yra puiki priemonė atsikratyti galvos, kaklo, pečių skausmo, rankų tirpimo jausmo.",
                    "sepStoma": "Stimuliuoja virškinimą, turi teigiamą poveikį vidinių organų veiklai, gerina virškinimo trakto funkcijas ir tulžies sekreciją, padeda su vidurių užkietėjimais arba dujų susikaupimo žarnyne",


                    "sepPar":"Gerina kraujo ir limfos apytaką juosmens ir kojų srityse, mažina juosmens, sėdmenų, kojų skausmą, stiprina nusilpusius raumenis. Kojų masažas – atpalaiduoja įtemptus audinius, mažina sąnarių, raumenų, pėdos skausmus, dažniausiai rekomenduojamas po patirtų traumų, operacijų, esant kojų nuovargiui.\n" +
                    " Šis masažas ypač tinka po treniruočių.\n",

                    "collar":"Pečių juosta ir apykaklės zona - tai vietos, kurios jautriausiai reaguoja į stresą ir netaisyklingai sėdimą padėtį. Pečiai ir kaklo zona ypatingai kenčia  dėl šiuolaikinio įpročio nuolat palenkus galvą žiūrėti į kompiuterio ir mobiliuosius ekranus, telefonus, planšetes.\n" +
                    "Apykaklės masažas rekomenduojamas, jei Jus vargina rankų tirpimas, svaigulys, akių,     galvos ar kaklo skausmai. Taip pat  jaučiamas skausmas  sukiojant galvą į vieną ar kitą pusę. Dažniausiai tai vyksta dėl ilgo ir nepatogaus sėdėjimo. \n" +
                    "Dirbantiems sėdimą darbą, ilgą laiką praleidžiantiems prie kompiuterio ar     vairuojant automobilį, nuolat dirbantiems persikreipus tam tikroje pozoje, dirbantiems fizinį darbą, kai patiriami sunkūs fiziniai krūviai. \n" +
                    "Reguliariai atliekant masažo kursus, Jūs pamiršite kūprinimąsi, įgausite karališką laikyseną ir lengvą bei grakščią eiseną.\n" +
                    "\n" +
                    "Atlikite procedūrą kas antrą dieną, o dar geriau - kas 2-3 dienas. Vidutinė norma yra 10 kartų. \n" +
                    "Kartoti 2-3 kartus metuose.\n",
                    "senior":"Masažas yra būtina ir labai naudinga procedūra. Tyrimai parodė, kad masažas lėtina senėjimo procesą. Taip pat masažas veikia raminančiai visą organizmą ir gali sumažinti skausmus, nuo kurių dažnai kenčia pagyvenę žmonės. Mokslininkai įrodė, kad masažas sėkmingai kovoja su šiais pasikeitimais. Pavyzdžiui, tiems, kurie kenčia nuo artrito, masažas sumažina skausmą ir padidina judesių amplitudę sąnariuose ir padeda organizmui gaminti  natūraliai skystį sąnariuose, gerina kraujotaką ir t.t. Masažas pagerina taip pat ir atmintį, o tai labai svarbu pagyvenusiems žmonėms. Dėl to pagerėja pagyvenusio žmogaus gyvenimo kokybė.\n" +
                    "Visi masažo judesiai švelnūs  ir lengvi.\n",

                    "sepWaist": "Gerina kraujo ir limfos apytaką juosmens bei kojų srityse, atpalaiduoja įsitempusius raumenis, mažina juosmens, sėdmenų, kojų skausmą, stiprina nusilpusius raumenis. Sumažina skausmą po operacijos, mažina nervinių šaknų uždegimą."




                },
                "de": {
                    "limphoBody": "Dies ist eine spezielle Ganzkörpermassage, um überschüssige zelluläre Metaboliten, Toxine und Flüssigkeiten aus dem Gewebe zu entfernen. Die Massage eignet sich für alle, die sich ödematös oder müde fühlen. Nach einem langen Arbeitstag entspannt er müde Beine perfekt und vermittelt ein Gefühl von Leichtigkeit. Nach der Lymphdrainage verschwinden anhaltende chronische Müdigkeit und Kopfschmerzen, die Schwellung der Extremitäten nimmt ab - das Lymphödem (Lymphschwellung) und die Hautelastizität verbessern sich." +
                    " Die gewünschte Wirkung wird nach etwa 15 Behandlungen erreicht." +
                    " Aus prophylaktischer Sicht: 3 bis 5 Sitzungen mit manueller Lymphdrainage (alle zwei Wochen) verbessern Ihr Aussehen und Ihr Wohlbefinden auf lange Sicht." +
                    "Die Lymphdrainage-Körpermassage wird sowohl für Frauen als auch für Männer durchgeführt.",

                    "limphoBody2": "Die Massage ist schmerzlos und angenehm. In der Regel reichen etwa 10 Sitzungen, um das Lymphsystem wieder Ergebnisse zu machen. Massage Lymphzirkulation wird bis zu 10 Mal aktiviert!",
                    "limphoFace": "Bei konstantem Stress und Müdigkeit sind die Gesichtsmuskeln in der Maske der \"Traurigkeit\" eingefroren.\n" +
                    "Die manuelle Lymphdrainage ist eine exklusive Prozedur.\n" +
                    "In kurzer Zeit entfernt unnötige Flüssigkeiten, Schlacken und Schwellungen. Auch chronische Müdigkeit, Verspannungen, Kopfschmerzen.\n" +
                    "Verbessern Sie die Gesichtsfarbe,  die Blutzirkulation. Die Haut nach der  elastischer, lebendiger und gesünder aussieht und Falten glättet.\n" +
                    "Die Lymphdrainage des Gesichts liefert hervorragende Ergebnisse bei: Schwellung des Gesichts, trockene Haut, frühes Altern, dunkle Kreise und Taschen unter den Augen, reduzierte Gewebeelastizität, Bekämpfung von Couperosis.\n" +
                    "Die gewünschte Wirkung wird nach etwa 15 Behandlungen erreicht. \n" +
                    "Aus prophylaktischer Sicht: 3 bis 5 Sitzungen mit manueller Lymphdrainage (alle zwei Wochen) verbessern Ihr Aussehen und Ihr Wohlbefinden auf lange Sicht.\n" +
                    "Die Lymphdrainage-Körpermassage wird sowohl für Frauen als auch für Männer durchgeführt.\n",
                    "stoneHotCold": "Die Steine, die bei dieser Massage eingesetzt werden, wurden an der Küste der Ostsee gesammelt. Über Tausende von Jahren waren sie den Kräften des Meeres ausgesetzt, wurden von Sonne, Luft und Winden geformt und erhielten so ihre einzigartigen Formen und Eigenschaften, die den menschlichen Körper positiv beeinflussen. Die Steine haben die Fähigkeit, Giftstoffe und angestauten Stress abzubauen sowie Anspannungen zu lösen. Sie verbessern den Schlaf, unterstützen den Blutdruck und ihre Energie wirkt sich positiv aufs Herz aus und reguliert so die körpereigenen, natürlichen Kräfte. Diese Massage eignet sich deshalb besonders gegen Müdigkeit und Stress, da die Wärme der Steine muskelentspannend wirken. Die Abwechslung mit den kühlen Steinen wirkt sich dabei vitalisierend auf das vegetative Nervensystem aus und entspannt zudem verkrampfte Rücken–, Kopf– und Nackenmuskulatur.\n" +
                    "Massage ist wirksam bei: schmerzen     im Rücken und Nacken eine positive Wirkung auf das Nervensystem chronische Müdigkeit, Migräne, Taubheit der Finger, Erkältung in den Gliedmaßen usw.\n" +
                    "\n" +
                    "\n" +
                    "Nach der Massage werden Sie sich entspannt fühlen und verjüngen den Körper verbreitet Wärme, die körperliche und emotionale Gleichgewicht zurückgibt.\n" +
                    "Bei Schwangerschaft, Infektions– und Krebskrankheiten wird diese Massage nicht empfohlen.\n",
                    "stoneHotCold1": "Die Steine haben die Fähigkeit, Giftstoffe und angestauten Stress abzubauen sowie Anspannungen zu lösen. Sie verbessern den Schlaf, unterstützen den Blutdruck und ihre Energie wirkt sich positiv aufs Herz aus und reguliert so die körpereigenen, natürlichen Kräfte. Diese Massage eignet sich deshalb besonders gegen Müdigkeit und Stress, da die Wärme der Steine muskelentspannend wirken. Die Abwechslung mit den kühlen Steinen wirkt sich dabei vitalisierend auf das vegetative Nervensystem aus und entspannt zudem verkrampfte Rücken–, Kopf– und Nackenmuskulatur. ",
                    "stoneHotCold2": "Nach der Massage werden Sie sich entspannt fühlen und verjüngen den Körper verbreitet Wärme, die körperliche und emotionale Gleichgewicht zurückgibt.\n" +
                    "Bei Schwangerschaft, Infektions– und Krebskrankheiten wird diese Massage nicht empfohlen.",

                    "backSpin": "Die Rückenmassage den Rücken und insbesondere der Schulter– und Nackenbereich optimal zu entspannen. Ist eine stark energetische Massage, Blockaden zu lösen. Diese Massage ist ideal für Menschen, die den ganzen Tag im Stehen oder Sitzen verbringen, zum Beispiel: am Computer oder beim Autofahren sowie schwere körperliche Arbeit. Wann die ganze Macht in der Wirbelsäule, Nacken konzentriert, Schultern, Hüfte und Gesäß, Schmerzen in den Muskeln verursacht.     \n" +
                    "Diese Massage eignet sich besonders nach dem Training.     \n" +
                    "Außerdem verursacht die falsche Position der Wirbelsäule oft Kopfschmerzen.     \n" +
                    "Eine regelmäßige Massage hilft Ihnen dabei, sich zu befreien häufige Rückenschmerzen, Kopfschmerzen, Muskelverspannungen.\n" +
                    " Nach der Massage fühlen Sie sich entspannt und voller Energie.\n",
                    "backSpin2": "Eine regelmäßige Massage hilft Ihnen dabei, sich zu befreien häufige Rückenschmerzen, Kopfschmerzen, Muskelverspannungen. Nach der Massage fühlen Sie sich entspannt und voller Energie.",
                    "older": "Massage ist ein notwendiges und sehr nützliches Verfahren für ältere Menschen, Rentner. Studien haben gezeigt, dass die Massage den Alterungsprozess verlangsamt. Auch Massage hat eine beruhigende Wirkung im ganzen Körper und kann Schmerzen reduzieren. \n" +
                    "Мassage kann Menschen helfen, die unter Muskelschmerzen leiden: Zum Beispiel, diejenigen, die an Arthritis leiden, Massage hilft, Schmerzen zu reduzieren, erhöht die Amplitude der Bewegung in den Gelenken. Wenn eine Person leidet, wird sie immer weniger aktiv und beeinflusst die Lebensqualität und Gesundheit. Massage verbessert die Durchblutung, beseitigt Muskelermüdung und Muskeln erhalten Ton. Dies verbessert die Lebensqualität einer älteren Person. \n" +
                    "Vor einer Massage ist es ratsam, einen Arzt zu konsultieren. Sobald Sie die Erlaubnis vom Arzt für eine Massage bekommen, können Sie sich mit mir in Verbindung setzen.",
                    "relaxBody": "Entspannungsmassage eignet sich für alle, die sich nach einem anstrengenden Tag erholen, vergessen und dem Alltag entfliehen möchten.\n" +
                    "Entfernt: Spannung und Stress Rücken- und Kopfschmerzen, entspannt die Muskeln wirkt sich positiv auf den inneren Zustand des Organismus aus verbessert Stimmung und Energie.\n" +
                    "Eine oder zwei diese entspannende Massage pro Woche garantieren Ihnen ein gutes Arbeitsleben, gute Laune und Wohlbefinden.\n",
                    "relaxBody2":"Eine oder zwei diese entspannende Massage pro Woche garantieren Ihnen ein gutes Arbeitsleben, gute Laune und Wohlbefinden.",
                    "ajurved": "Ayurveda empfiehlt der Brust-Massage, denn hierdurch entsteht ein optimaler Stimulus zur Harmonisierung des weiblichen Hormonzyklus.\n" +
                    "Die Massage sorgt für straffe Haut und straffes Bindegewebe  verhindert Verspannungen und Entzündungen im Brustbereich, beugt Zystenbildung und Brustkrebs vor, aktiviert das Herz und das Herz Chakra.\n" +
                    "Diese Massage verbessert Ihr Wohlbefinden, macht Ihre Brüste schöner, gibt Ihnen Sicherheit und hilft Ihnen, sich besser zu fühlen wie eine Frau.\n" +
                    "Die Massage wird mit der Verwendung von Pflanzenölen durchgeführt und dauert bis zu einer Stunde.\n" +
                    "Regelmäßige Massage hilft, Schmerzen in die Brüste zu beseitigen.\n",
                    "antice": "Gemeinsam Cellulite gewinnen!\n" +
                    "Viele Frauen suchen nach Wegen, um den größten Feind der schönen Beine zu besiegen - Cellulite.\n" +
                    "Geförderte teure Produkte sind nicht immer wirksam, sie entfernen Cellulite nicht immer auf magische Weise. Wissenschaftler, die dieses Problem untersuchen, behaupten daher, dass nur eine komplexe Therapie: ausgewogene Ernährung + aktive körperliche Aktivität + Anti Cellulite-Massage wirksam sein kann und gute Ergebnisse verspricht.\n" +
                    "Während der Massage erwärmt sich die Haut, der Stoffwechsel, die Durchblutung und die Lymphzirkulation werden angeregt. In Problembereichen werden bestimmte tiefe Bewegungen ausgeführt.\n" +
                    "Also diese Massage verbessert den Lymphfluss, beseitigt Giftstoffe  und Flüssigkeit, die sich im Körpergewebe angesammelt haben, verbessert den Zellstoffwechsel, aktiviert     die Durchblutung, stellt die Mikrozirkulation wieder her erweicht Stoffe verbessert den Muskeltonus, stärkt die Haut.     \n" +
                    "\n" +
                    "Jeden zweiten Tag werden 10-15 Verfahren empfohlen. Anschließend werden die Verfahren mehrmals im Monat durchgeführt.\n",
                    "relaxFoot": "Füße Massage wird verwendet für  um müde, schmerzende Beine zu entspannen,  Verbesserung der Vitalität des Körpers,  Stärkung des Immunsystems.\n" +
                    "Zusätzlich wird diese Massage angewendet  Schlafstörungen,\n" +
                    " Spannungen und Stress reduzieren.\n" +
                    "Besonders geeignet für  Frauen oder Mädchen, die oft High Heels tragen,  Übergewichtige Menschen schwangere Frauen.\n" +
                    "Bei einer regelmäßigen Füße Massage werden Sie Ihre Beschwerden und Schmerzen in den Beinen vergessen!\n" +
                    "Empfohlene 10-12 Behandlungen, ein Kurs von 2-3 mal pro Woche.\n",

                    "sepHead": "Entspannt bei Stress, lindert Krämpfe, verbessert den Blutkreislauf.",
                    "sepNeck": "Die effektivste Behandlung, sowie ein Heilmittel für die Beseitigung von unangenehmen Symptomen. Nach der ersten Massage des Halses, fühlen Sie eine allgemeine Verbesserung in Ihrem Gesundheitszustand. Nach einem vollen Massagen verschwinden schmerzhafte Empfindungen, die Arbeitskapazität steigt, Schlaflosigkeit und Reizbarkeit verschwinden. Nackenmassage ist ein ausgezeichnetes Werkzeug, um Kopfschmerzen loszuwerden. \n" +
                    "Dies ist eine hervorragende Maßnahme zur Reduzierung von Kopf, Hals, Schulter Schmerzen, Taubheit Hände.",
                    "sepStoma": "Regt die Verdauung an, wirkt sich positiv auf die intra–abdominalen Organe aus, verbessert Magen– und Darmfunktionen sowie die Gallensekretion, hilft bei Verstopfung oder Gasansammlung im Darm.",
                    "sepPar":"Verbessert die Blut- und Lymphzirkulation im unteren Rücken und in den\n" +
                    "Beinen, entspannt enge Muskeln, Gesäß, Beinschmerzen, stärkt die\n" +
                    "geschwächten Muskeln. Diese Massage - entspannt angespannt Gewebe, entlastet  Gelenke, Muskeln Schmerzen in den Beinen, ist es in der Regel nach dem Trauma, Chirurgie, Bein Müdigkeit empfohlen.\n" +
                    "Diese Massage eignet sich besonders nach dem Training.\n",
                    "collar":"Der Kragenbereich des Rückens gilt als der problematischste.\n" +
                    "Die Vorteile der Massage im Nackenbereich entfernt das muskulo-tonische Syndrom des Kragenbereichs. Stimuliert die Funktionalität der Muskelfasern des Kragenbereichs. Verbessert die Elastizität, Erregbarkeit und Dehnbarkeit der Muskelfasern verbessert die Haltung, normalisiert die Arbeit des Atmungssystems beseitigt Schwellungen im Kragenbereich. Verbessert die Durchblutung, sättigt das Gehirn mit Sauerstoff und beseitigt auch Kopfschmerzen.     \n" +
                    "Normalisiert die allgemeine Gesundheit und verbessert die Leistung.\n" +
                    "Die Massage des Hals- und Kragen Bereichs und der Oberarme hat folgende Hinweise: langer Aufenthalt der Halswirbelsäule in einer statischen Position; häufige Kopfschmerzen, vestibuläre Störungen; chronisches Ermüdungssyndrom; ständiger Stress; bei durch Osteochondrose, Arthrose, Skoliose verursachten Nackenschmerzen; stabile Schlafstörung; Zustand nach Schlaganfall.\n" +
                    "  Die Massage kann für Patienten aller Altersgruppen machen werden.\n" +
                    "\n" +
                    "Machen Sie den Eingriff jeden zweiten Tag und noch besser - in 2-3 Tagen. Der durchschnittliche Kurs beträgt 10 mal.\n" +
                    "Wiederholen Sie 2-3 mal pro Jahr.\n",
                    "senior":"Massage ist eine notwendige und sehr nützliche Prozedur. Studien haben gezeigt, dass Massage den Alterungsprozess verlangsamt. Massage wirkt auch beruhigend auf den ganzen Körper und kann die Schmerzen lindern, unter denen ältere Menschen oft leiden. Wissenschaftler haben bewiesen, dass die Massage diese Veränderungen erfolgreich bekämpft. Zum Beispiel für diejenigen, die an Arthritis leiden, reduziert Massage Schmerzen und vergrößert den Bewegungsbereich in den Gelenken und hilft dem Körper, natürliche Flüssigkeit in den Gelenken zu produzieren, verbessert die Durchblutung und so weiter. Massage verbessert auch das Gedächtnis, was für ältere Menschen sehr wichtig ist. Dies verbessert die Lebensqualität eines älteren Menschen.\n" +
                    "  Alle Massagebewegungen sind sanft und leicht.\n",
                    "sepWaist": "Verbessert die Blut– und Lymphzirkulation im unteren Rücken und in den Beinen, entspannt enge Muskeln, Gesäß, Beinschmerzen, stärkt die geschwächten Muskeln. Verringert den Schmerz nach der Operation, reduziert die Entzündung der Nervenwurzeln."


                },
                "ru": {
                    "limphoBody": "Это специальный массаж всего тела для удаления избыточных клеточных метаболитов, токсинов и жидкостей из тканей. Массаж подходит всем, кто чувствует отечность ног или просто усталость. После долгого рабочего дня он прекрасно расслабляет тело, уставшие ноги и дает ощущение легкости. После лимфодренажа исчезает устойчивая хроническая усталость и головные боли, уменьшается отечность конечностей - лимфедема (отек лимфы), улучшается эластичность кожи." +
                    "Желаемый эффект достигается примерно после 15 процедур." +
                    " С профилактической точки зрения: от 3 до 5 сеансов ручного лимфодренажа (один раз в две недели) улучшают вашу внешность и хорошее самочувствие в течение длительного времени." +
                    " Лимфодренажный массаж тела проводится как для женщин, так и для мужчин.",
                    "limphoBody2": "Массаж безболезненный, приятный, и обычно достаточно около 10 сеансов, чтобы восстановить лимфатическую систему до видимых результатов. Массаж активизирует циркуляцию лимфы до 10 раз!",
                    "limphoFace": "В случае постоянного стресса и усталости, мышцы лица замораживаются в маске «грусти».\n" +
                    "Ручной лимфодренаж - эксклюзивная процедура.\n" +
                    "Позволит за короткий срок: вывести лишнюю жидкость, шлаки, снять отёки и     одутловатость лица. Cнять хроническую усталость, напряжение,     подавленность, головные боли, зарядить     организм энергией.     \n" +
                    "Улучшить цвет лица и состояние кожи: снимая малейшие мышечные напряжения, лимфодренаж улучшает кровообращение, получая полноценное питание, кожа выглядит более эластичной, свежей и здоровой, разглаживаются морщины.\n" +
                    "Лимфодренаж лица обеспечивает отличные результаты при: отеки лица, сухости кожи, раннем старении, темных кругах и мешках под глазами, снижение эластичности тканей, борьбе с купоросом.\n" +
                    "\n" +
                    "Желаемый эффект достигается примерно после 15 процедур.\n" +
                    "С профилактической точки зрения: от 3 до 5 сеансов ручного лимфодренажа (один раз в две недели) улучшают вашу внешность и хорошее самочувствие в течение длительного времени. \n" +
                    "Лимфодренажный массаж лица проводится как женщинам, так и мужчинам.\n",
                    "stoneHotCold": "Камни, используемые в массаже, собранных на побережье Балтийского моря. Они растут на протяжении тысяч лет на морском дне обогащает огромную силу и солоноватой воды нити в сочетании с солнечным светом колебания приобретают уникальные характеристики, которые влияют на организм человека. Камень имеет способность из мышц удалить токсины, накопленные в результате стресса и нездорового образа жизни.\n" +
                    "А также улучшает сон, положительно влияет на частоту сердечных сокращений.\n" +
                    "Массаж эффективен при боли в спине и шее, положительно влияет на нервную систему, хронической усталости, мигрени, онемение пальцев, ощущение холода в конечностях и т. д.\n" +
                    "После массажа вы будете чувствовать себя отдохнувшими и восстановится силы по телу распространяется тепло возвратится физический и эмоциональный баланс.\n" +
                    "Во время беременности, рака и инфекционных заболеваний, этот массаж не рекомендуется.\n",
                    "stoneHotCold1": "Камень имеет способность из мышц удалить токсины, накопленные в результате стресса и нездорового образа жизни.",
                    "stoneHotCold2": "После массажа вы будете чувствовать себя отдохнувшими и восстановится силы по телу распространится тепло возвратится физический и эмоциональный баланс.\n" +
                    "Во время беременности, рака и инфекционных заболеваний, этот массаж не рекомендуется.",
                    "backSpin": "Этот массаж идеально подходит для людей, которые проводят весь день стоя или сидя, например: за компьютером или за рулем автомобиля, а также тяжело физически работая, когда все напряжение сосредоточено в позвоночнике, шее и плечах, поясе и ягодицах, вызывая болезненные ощущения в мышцах. \n" +
                    "Этот массаж особенно подходит после тренировки. \n" +
                    "Кроме того, неправильное положение позвоночника часто вызывает головную боль. \n" +
                    "\n" +
                    "\n" +
                    "Периодически делая  массаж поможет вам избавиться от частых болей в спине, головных болей, расслабить напряженные группы мышц. После массажа вы почувствуете себя расслабленным и энергичным.\n",
                    "backSpin2": "Периодический массаж поможет вам избавиться от частых болей в спине, головных болей, расслабить напряженные группы мышц. После массажа вы почувствуете себя расслабленным и энергичным.",
                    "older": "Массаж – необходимая и очень полезная процедура для пожилых людей, пенсионеров. Исследования показали, что массаж замедляет процесс старения. Также массаж оказывает успокаивающее действие по всему телу и может уменьшить боль. Массаж может помочь людям, страдающим от мышечных болей : Например, те кто страдает от артрита, массаж помогает уменьшить боль, увеличивает амплитуду движения в суставах. Когда человек страдает, он становится все менее и менее активным, влияющий на качество жизни и здоровье. Массаж улучшает кровообращение, устраняет мышечную усталость, а мышцы получают тонус. Это улучшает качество жизни пожилого человека. \n" +
                    "Перед массажем необходимо проконсультироваться с врачом. Как только вы получите разрешение врача на массаж, вы можете спокойно связаться со мной.",
                    "relaxBody": "Расслабляющий массаж подойдет всем, кто хочет расслабиться после тяжелого дня, забыть и уйти от повседневной рутины.\n" +
                    "Удаляет: напряжение и стресс, боли в спине и голове, расслабляет мышцы, оказывает положительное влияние на внутреннее состояние организма,\n" +
                    "улучшает настроение и энергию.\n" +
                    "\n" +
                    "Один или два расслабляющих массажных сеансов в неделю обеспечат вам хорошую работоспособность, отличное настроение и хорошее самочувствие.\n",
                    "relaxBody2":"Один или два расслабляющих массажных сеансов в неделю обеспечат вам хорошую работоспособнось, отличное настроение и хорошее самочувствие.",
                    "ajurved": "Этот массаж положительно влияет на репродуктивную систему у женщин и помогает сбалансировать гормональную систему.\n" +
                    "Уменьшает и предотвращает: очень уменьшает неприятную болезненность молочной железы, связанное с менструальным циклом,  предотвращает боль в груди,  напряжения и воспаления в области груди,  предотвращает образование кист и рак молочной железы,  активирует сердце и сердечную чакру.\n" +
                    "Этот массаж улучшает самочувствие, делая вашу грудь более красивой, дает вам уверенность в себе и помогает вам чувствовать себя лучше, как женщине.\n" +
                    "Массаж выполняется с применением растительных масел и длится до одного часа.\n" +
                    "Регулярный массаж помогает у женщин устранить частые боли в грудях.\n",
                    "antice": "Давайте победим целлюлит вместе!\n" +
                    "Многие женщины ищут способы, чтобы победить величайший враг красивых ног - целлюлит.\n" +
                    "Продвигаемые дорогие продукты не всегда эффективны, они не всегда удаляют целлюлит волшебным образом. Поэтому ученые, исследующие эту проблему, утверждают, что только комплексная терапия: сбалансированное питание + активная физическая активность + антицеллюлитный массаж могут быть эффективными, обещая хорошие результаты.\n" +
                    "Во время массажа кожа прогревается, стимулируется обмен веществ, кровообращение, циркуляция лимфы. Определенные глубокие движения выполняются в проблемных зонах.\n" +
                    "Таким образом, этот массаж улучшает лимфоток;\n" +
                    "устраняет шлаки, токсины, жидкость скопившуюся в тканях организма. Улучшает клеточный метаболизм, активизирует кровообращение, восстанавливает микроциркуляцию, смягчает ткани, улучшает мышечный тонус, укрепляет кожу.\n",
                    "relaxFoot": "Массаж применяется чтобы расслабить усталые, болезненные ноги,\n" +
                    " повысить жизненный тонус организма, укрепить иммунитет.\n" +
                    "Кроме того, этот массаж применяется при  нарушении сна, уменьшить напряжение и стресс.\n" +
                    "Особенно подходит для  женщин или девушек, которые часто носят высокие каблуки,  людям с избыточным весом, беременным женщинам.\n" +
                    "При регулярном массаже стоп (+голень) вы забудете о своих неприятностях и болях!\n" +
                    "Рекомендуется 10-12 процедур, курсом 2-3 раза в неделю.\n",

                    "sepHead": "Уменьшает стресс, головные боли, улучшает кровообращение.",
                    "sepNeck": "Наиболее эффективное средство для устранения неприятных симптомов. Уже после первого раза вы почувствуете улучшение общего состояния. После полного курса массажа исчезают болезненные ощущения, поевляетса бодрость, возрастает работоспособность, исчезает бессонница и раздражительность. Это отличный способ избавиться от боли в голове, шее, плечах и онемение рук.",
                    "sepStoma": "Стимулирует пищеварение, оказывает положительное влияние на внутрибрюшные органы, улучшает функции желудка и кишечника, а также секрецию желчи, помогает при запоре или накоплении газа в кишечнике.",

                    "sepPar":"Улучшает циркуляцию крови и лимфы в пояснице и ногах, уменьшает  поясничные, ягодицы и в ногах боли, укрепляет ослабленные мышцы.Этот массаж - расслабляет напряженные ткани, снимает боли в суставах, мышцах ног, обычно рекомендуется после травм, операций, усталости ног.\n" +
                    "Этот массаж особенно подходит после тренировки.\n",
                    "collar":"Люди, которые подвержены длительному пребыванию с наклоненной вперед головой, сразу же попадают в группу риска. Сюда можно зачислить все сидячие профессии, особенно программисты, бухгалтера, водители.\n" +
                    "А также люди, которые особенно страдают из-за постоянной привычки постоянно смотреть на компьютер и мобильные экраны, телефоны, планшеты, наклонив голову. Наверное, многие представители сталкиваются с проблемами головных болей, частой усталости болью в области надплечий плечелопаточным болевым синдромом.     \n" +
                    "Многие, запасаясь терпением учатся жить с этими болями, периодически испытывая сильные боли в период острой стадии.\n" +
                    "Регулярно проходя курс массажа, поможет вам избавиться от болей в шейно-воротниковой зоне.\n" +
                    "\n" +
                    "Делайте процедуру через день, а еще лучше - через 2-3 дня. Средний курс составляет 10 раз.\n" +
                    "           Повторить 2-3 раза в год.",
                    "senior":"Массаж является необходимой и очень полезной процедурой. Исследования показали, что массаж замедляет процесс старения. Также массаж оказывает успокаивающее действие по всему телу и может уменьшить боль, которая часто страдает  пожилые люди. Ученые доказали, что массаж успешно борется с этими изменениями. Например, для тех, кто страдает от артрита, массаж уменьшает боль и увеличивает амплитуду движений в суставах и помогает организму вырабатывать естественную жидкость в суставах, улучшает кровообращение и так далее. Массаж также улучшает память и качество жизни, что очень важно для пожилых людей.\n" +
                    "Все массажные движения нежные и легкие.\n",
                    "sepWaist": "Улучшает циркуляцию крови и лимфы в пояснице и ногах, расслабляет напряженные мышцы, уменьшает поясничные, ягодицы, ногах боль, укрепляет ослабленные мышцы. Уменьшает боль после операции, уменьшает воспаление нервных корешков."


                }
            };
        },
        getPrices: function () {
            return {
                "lt": {
                    "title": "Kainos",
                    "length":"Trukmė",
                    "spaTitle": ["Spa masažai", "40min", "60min", "90min","120min"],
                    "spaTitle2":["","","","","","la"],
                    "limphoBody": ["Limfodrenažinis kūno masažas", "–", "–","150 CHF", "–","-", "10%/13%"],
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
                    "otherTitle": ["Kiti masažai", "40min", "60min", "75min","90min"],
                    "offers1":"PASIŪLYMAI",
                    "offers2":["Senjorams suteikiama 15% nuolaida nuo kainos.","Užsisakius 7 masažus suteikiama 10% nuolaida.","Užsisakius 11 masažų suteikiama 13 % nuolaida."],
                    "present1":"DOVANŲ KUPONAI",
                    "present2":["Dovanų kuponai užsakomi pagal Jūsų pageidavimus.","Masažo kuponas yra ideali dovana gimtadieniui, vestuvėms, Kalėdoms ar kitoms progoms."],
                    "attention1":"ATKREIPKITE DĖMESĮ",
                    "attention2":["Atsiskaitymas tik grynaisiais pinigais (laikinai).","Paslauga mokama kiekvieno masažo pabaigoje.","Nuolaidos nesumuojamos.","Jei negalite atvykti į masažą. Prašome atšaukti savo užsakymą prieš 24 valandas iki sutartos datos elektroniniu paštu arba sms žinute."]



                },
                "de": {
                    "title": "Preise",
                    "length":"DAUER",
                    "spaTitle": ["Spa–Massagen", "40min", "60min", "90min","120min"],
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
                    "otherTitle": ["Andere Massagen", "40min", "60min", "75min","90min"],
                    "offers1":"ANGEBOTE",
                    "offers2":["Senioren erhalten 15% Rabatt auf den Preis.","Wenn Sie bestellen 7 Massagen einen Rabatt von 10%.","Wenn Sie bestellen 11 Massagen einen Rabatt von 13%."],
                    "present1":"GUTSCHEINE",
                    "present2":["Geschenkgutscheine werden nach Ihren Wünschen bestellt.","Massagegutschein ist die ideale Geschenkidee zum Geburtstag, zur Hochzeit, zu Weihnachten oder zu jeder anderen Gelegenheit."],
                    "attention1":"BITTE BEACHTEN",
                    "attention2":["Zahlen Sie nur in bar (vorübergehend).","Der Dienst ist am Ende jeder Massage zu bezahlen.","Rabatte können nicht kombiniert werden.","Wenn Sie nicht für eine Massage kommen können. Bitte stornieren Sie Ihre Bestellung bis 24 Stunden vor dem vereinbarten Termin per E-Mail/SMS."]
                },
                "ru": {
                    "title": "Цены",
                    "length":"ВРЕМЯ",
                    "spaTitle": ["Спа–массажы", "40мин", "60мин", "90мин","120мин"],
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
                    "otherTitle": ["Другие массажи", "40мин", "60мин", "75мин","90мин"],
                    "offers1":"ПРЕДЛОЖЕНИЯ",
                    "offers2":["Пожилые люди получают 15% скидку от цены.","Если закажете 7 массажей  предоставляется скидка 10%.","Если закажете  11 массажей скидка 13%."],
                    "present1":"ПОДАРОЧНЫЕ КУПОНЫ",
                    "present2":["Подарочные купоны заказываются  в соответствии с вашими пожеланиями.","Массажный купон - идеальная идея для подарка на день рождения, свадьбу, Рождество или любой другой случай."],
                    "attention1":"ОБРАТИТЕ ВНИМАНИЕ",
                    "attention2":["Oплата только наличными (временно).","Услуга оплачивается в конце каждого массажа.","Скидки не могут быть объединены.","Если вы не можете прийти на массаж. Пожалуйста, отмените ваш заказ по электронной почте или смс за 24 часа до согласованной даты."]
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
                    "contacts": "Mūsų kontaktai",
                    "location":"Vieta",
                    "open":"Darbo laikas",
                    "openHours":["Pi: 09:00 - 20:00","An: Geschlossen","Tr: 13:00 - 20:00","Ke: 16:00 - 20:00","Pe: 10:00 - 18:00","Še: 10:00 - 18:00","Se: Geschlossen"]

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
                    "contacts": "Unsere Kontakte",
                    "location":"Lage",
                    "open":"Öffnungszeiten",
                    "openHours":["Mo: 09:00 - 20:00","Di: Geschlossen","Mi: 13:00 - 20:00","Do: 16:00 - 20:00","Fr: 10:00 - 18:00","Sa: 10:00 - 18:00","So: Geschlossen"]

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
                    "contacts": "Наши контакты",
                    "location":"Место",
                    "open":"Часы работы",
                    "openHours":["По: 09:00 - 20:00","Вт: Geschlossen","Ср: 13:00 - 20:00","Че: 16:00 - 20:00","Пя: 10:00 - 18:00","Су: 10:00 - 18:00","Во: Geschlossen"]


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
















