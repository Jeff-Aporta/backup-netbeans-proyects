package HerramientasAudio.Midi;

import static HerramientasAudio.Midi.ReproductorNotas.Constantes.*;

public final class BibliotecaSonidos {

    public static void main(String[] args) {
        Efectos.Reproducir.Zelda.PuzzleSolved();
    }

    public static final class Efectos {

        public static final class Reproducir {

            private static void Reproducir(long[] l, float v) {//<editor-fold defaultstate="collapsed" desc="Implementación de código »">
                Reproducir(l, v, ReproductorNotas.Constantes.SQUARE);
            }//</editor-fold>

            private static void Reproducir(long[] l, float v, int instrumento) {//<editor-fold defaultstate="collapsed" desc="Implementación de código »">
                new Thread() {
                    @Override
                    public void run() {
                        try {
                            InterpretadorMIDI reproductor = new InterpretadorMIDI();
                            reproductor.CargarSecuenciaLong(l);
                            reproductor.velocidadReproducción(v);
                            reproductor.Volúmen = .8f;
                            reproductor.CambiarInstrumento_TodosLosCanales(instrumento);
                            reproductor.Reproducir();
                            sleep(3000);
                        } catch (Exception ex) {
                        }
                    }
                }.start();
            }//</editor-fold>

            public static final class Megaman {//<editor-fold defaultstate="collapsed" desc="Cuerpo de biblioteca »">

                public static void Leading() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Megaman.Landing(), 4.5f);
                }//</editor-fold>

                public static void Pause() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Megaman.Pause(), 2.4f);
                }//</editor-fold>

                public static void Select() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Megaman.Select(), 3.6f);
                }//</editor-fold>

                public static void HitEnemy() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Megaman.HitEnemy(), 3.6f, GUN_SHOT);
                }//</editor-fold>

                public static void OneUp() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Megaman.OneUp(), 1.5f, SOLO_VOX);
                }//</editor-fold>

                public static void ShootingLemons() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Megaman.ShootingLemons(), 4f, SAW);
                }//</editor-fold>

                public static void SuperArm() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Megaman.SuperArm(), 4f);
                }//</editor-fold>

                public static void RollingCutter() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Megaman.RollingCutter(), 4.5f, GUN_SHOT);
                }//</editor-fold>

                public static void MagnetBeam() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Megaman.MagnetBeam(), 3.7f, SYNTH_BASS_3);
                }//</editor-fold>

                public static void ThunderBeam() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Megaman.ThunderBeam(), 4.5f, SAW);
                }//</editor-fold>

                public static void IceSlasher() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Megaman.IceSlasher(), 4.5f, SAW);
                }//</editor-fold>

                public static void HyperBomb() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Megaman.HyperBomb(), 4.5f);
                }//</editor-fold>

                public static void SparkShock() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Megaman.SparkShock(), 2.4f, SAW);
                }//</editor-fold>

            }//</editor-fold>

            public static final class Castlevania {//<editor-fold defaultstate="collapsed" desc="Cuerpo de la biblioteca »">

                public static void HolyWater() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Castlevania.HolyWater(), 3f, SQUARE);
                }//</editor-fold>

                public static void EnemyCry() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Castlevania.EnemyCry(), 3f, SAW);
                }//</editor-fold>

                public static void EnemyKill() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Castlevania.EnemyKill(), 2.25f, MACHINE_GUN);
                }//</editor-fold>

                public static void Heart() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Castlevania.Heart(), 3.65f, SINE_WAVE);
                }//</editor-fold>

                public static void GoldKnife() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Castlevania.GoldKnife(), 3.65f, FEEDBACK_GT);
                }//</editor-fold>

            }//</editor-fold>

            public static final class Sonic {//<editor-fold defaultstate="collapsed" desc="Cuerpo de la biblioteca »">

                public static void Skid() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Sonic.Skid(), 3.04f, SYNTH_BASS_3);
                }//</editor-fold>

                public static void RingPickup() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Sonic.RingPickup(), 2.04f, ATMOSPHERE);
                }//</editor-fold>

                public static void RingSpill() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Sonic.RingSpill(), 3.63f, MUSIC_BOX);
                }//</editor-fold>

            }//</editor-fold>

            public static final class Pacman {//<editor-fold defaultstate="collapsed" desc="Cuerpo de la biblioteca »">

                public static void EatingDots() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Pacman.EatingDots(), 2f, SYNTH_BASS_1);
                }//</editor-fold>

                public static void Start() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Pacman.Start(), 2.25f, SYNTH_BASS_1);
                }//</editor-fold>

                public static void DeathBloop() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Pacman.DeathBloop(), 1.5f, OBOE);
                }//</editor-fold>

            }//</editor-fold>

            public static final class Zelda {

                public static void Treasure1() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Zelda.Treasure1(), 1.5f, SQUARE);
                }//</editor-fold>

                public static void Treasure2() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Zelda.Treasure2(), 1.5f, SQUARE);
                }//</editor-fold>

                public static void PuzzleSolved() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Zelda.PuzzleSolved(), .75f, SQUARE);
                }//</editor-fold>

                public static void HitEnemy() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Zelda.HitEnemy(), 2.3f, SQUARE);
                }//</editor-fold>

                public static void KillEnemy() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Zelda.KillEnemy(), 2.3f, SQUARE);
                }//</editor-fold>

                public static void Block() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Zelda.Block(), 4.5f, SQUARE);
                }//</editor-fold>

                public static void Death() {//<editor-fold defaultstate="collapsed" desc="Lanzamiento del sonido »">
                    Reproducir(SecuenciasLong.Zelda.Death(), .9f, SQUARE);
                }//</editor-fold>
            }

        }

        public static final class SecuenciasLong {

            public static final class Megaman {//<editor-fold defaultstate="collapsed" desc="Cuerpo de la biblioteca »">

                public static long[] Landing() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        2000L,
                        4280549626L, 17046714450174L, 68723757285626L, 85766191186174L
                    };
                }//</editor-fold>

                public static long[] Pause() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        2664L,
                        4279501342L, 45634010743330L, 91538620416546L, 137168358212130L
                    };
                }//</editor-fold>

                public static long[] Select() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        3000L,
                        4282385206L, 68723757286878L
                    };
                }//</editor-fold>

                public static long[] HitEnemy() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        6000L,
                        205L, 4284743930L, 17046712353022L, 34364018917626L, 51406447837438L,
                        68723754926330L, 85766184370430L, 103083491983610L, 120125921427710L, 137443229040890L,
                        154485658485498L, 206711051518946L, 12871009758L, 137451823169662L, 206171299119230L,
                        274890774806654L, 21446787322L, 17063880163582L, 34381189611770L, 51423621677310L,
                        68740931125498L, 85783363191038L, 103100672377082L, 120143103656190L, 137460412842234L,
                        154502844121342L, 171820154355962L, 188862587732222L, 206179899015418L, 223222332391678L,
                        240539640791290L, 257582042448126L, 274899353731322L, 291941787107582L, 309259096555770L,
                        326301528621558L
                    };
                }//</editor-fold>

                public static long[] OneUp() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        4000L,
                        4283695278L, 17046714450094L, 34364023111854L, 51406453604526L, 68723762266286L,
                        85766193021102L, 103083501682862L, 120125932175534L, 137441291010222L, 154483721765038L,
                        171801030426798L, 188843460919470L, 206160769581230L, 223203200336046L, 240520508997806L,
                        257562939490478L
                    };
                }//</editor-fold>

                public static long[] ShootingLemons() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        2000L,
                        4279763194L, 17046710518014L, 34364019441914L, 51406450458878L, 68723759907066L,
                        85766191448318L, 103083501682938L, 120125935845630L
                    };
                }//</editor-fold>

                public static long[] SuperArm() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        4744L,
                        297L, 4281860346L, 17046711566586L, 34089141534974L, 51406449410298L,
                        85766188826874L, 102808618533118L, 120125926408442L, 137168356376830L, 171528095793406L,
                        188845403406586L, 205887833374974L, 223205141250298L, 257564880666874L, 274607310373118L,
                        291924618248442L, 308967048216826L, 12866289914L, 17055296258298L, 34097726226686L,
                        85774773256442L, 102817203224830L, 120134511100154L, 171536680222974L, 188853988098298L,
                        205896418066686L, 257573465096442L, 274615895064830L, 291933202940154L
                    };
                }//</editor-fold>

                public static long[] RollingCutter() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        28304L,
                        405L, 4288151802L, 17046718120186L, 34089148612862L, 51406457274618L,
                        68448887767294L, 102808625348862L, 120125933224186L, 137168363716862L, 154485672378618L,
                        171528102871294L, 188845411533050L, 205887841239294L, 223204041818362L, 240246471524606L,
                        257563779399930L, 274606209892606L, 291922914574586L, 308965345067262L, 326282653729018L,
                        343325083435262L, 360641887994106L, 377684317700350L, 395001625575674L, 412044056068350L,
                        429360760750330L, 446403191243006L, 463720499904762L, 480762929611006L, 498079767724282L,
                        515122197430526L, 532439505305850L, 549481935798526L, 566799714222330L, 583842144715006L,
                        601159453376762L, 618201883083006L, 652564439236862L, 669881747112186L, 686924177604862L,
                        704241486266618L, 721283916759294L, 755643654340862L, 772960962216186L, 790003392708862L,
                        807320701370618L, 824363131863294L, 841680440525050L, 858722870231294L, 876039070810362L,
                        893081500516606L, 910398808391930L, 927441238884606L, 944757943566586L, 961800374059262L,
                        979117682721018L, 996160112427262L, 1013476916986106L, 1030519346692350L, 1047836654567674L,
                        1064879085060350L, 1082195789742330L, 1099238220235006L, 1116555528896762L, 1133597958603006L,
                        1150914796716282L, 1167957226422526L, 1185274534297850L, 1202316964790526L, 1219634743214330L,
                        1236677173707006L, 1253994482368762L, 1271036912075006L, 1305399468228862L, 1322716776104186L,
                        1339759206596862L, 1357076515258618L, 1374118945751294L, 1408478683332862L, 1425795991208186L,
                        1442838421700862L, 1460155730362618L, 1477198160855294L, 1494515469517050L, 1511557899223294L,
                        1528874099802362L, 1545916529508606L, 1563233837383930L, 1580276267876606L, 1597592972558586L,
                        1614635403051262L, 1631952711713018L, 1648995141419262L, 1666311945978106L, 1683354375684350L,
                        1700671683559674L, 1717714114052350L, 1735030818734330L, 1752073249227006L, 1769390557888762L,
                        1786432987595006L, 1803749825708282L, 1820792255414526L, 1838109563289850L, 1855151993782526L,
                        1872469772206330L, 1889512202699006L, 1906829511360762L, 1923871941067006L, 12868387066L,
                        17055294685434L, 34097728848126L, 51415041179898L, 68457480847614L, 102817205584126L,
                        120134509789434L, 137176943952126L, 154494256283898L, 171536695951614L, 188853978923258L,
                        205896434319614L, 223213733019898L, 240256159056126L, 257573463261434L, 274615897424126L,
                        291933209755898L, 308975649423614L, 326292932395258L, 343335387791614L, 360651545641210L,
                        377693971677438L, 395011275882746L, 412053710045438L, 429370049298682L, 446412488966398L,
                        463729771938042L, 480772227334398L, 498088787837178L, 515131213873406L, 532448518078714L,
                        549490952241406L, 566807526375674L, 583849966043390L, 601167249015034L, 618209704411390L,
                        652573019472126L, 669890323677434L, 686932757840126L, 704250070171898L, 721292509839614L,
                        755652234576126L, 772969538781434L, 790011972944126L, 807329285275898L, 824371724943614L,
                        841689007915258L, 858731463311614L, 876048762011898L, 893091188048126L, 910408492253434L,
                        927450926416126L, 944768238747898L, 961810678415614L, 979127961387258L, 996170416783614L,
                        1013486574633210L, 1030529000669438L, 1047846304874746L, 1064888739037438L, 1082205078290682L,
                        1099247517958398L, 1116564800930042L, 1133607256326398L, 1150923816829178L, 1167966242865406L,
                        1185283547070714L, 1202325981233406L, 1219642555367674L, 1236684995035390L, 1254002278007034L,
                        1271044733403390L, 1305408048464126L, 1322725352669434L, 1339767786832126L, 1357085099163898L,
                        1374127538831614L, 1408487263568126L, 1425804567773434L, 1442847001936126L, 1460164314267898L,
                        1477206753935614L, 1494524036907258L, 1511566492303614L, 1528883791003898L, 1545926217040126L,
                        1563243521245434L, 1580285955408126L, 1597603267739898L, 1614645707407614L, 1631962990379258L,
                        1649005445775614L, 1666321603625210L, 1683364029661438L, 1700681333866746L, 1717723768029438L,
                        1735040107282682L, 1752082546950398L, 1769399829922042L, 1786442285318398L, 1803758845821178L,
                        1820801271857406L, 1838118576062714L, 1855161010225406L, 1872477584359674L, 1889520024027390L,
                        1906837306999034L, 1923879762395390L
                    };
                }//</editor-fold>

                public static long[] MagnetBeam() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        6000L,
                        273L, 4279238906L, 17046709469938L, 68723755974906L, 85766186205938L,
                        137443232710906L, 154485662941938L, 206162709446906L, 223205139677938L, 274882186182906L,
                        291924616413938L, 343601662918906L, 360644093149938L, 12859998458L, 17054059462910L,
                        34370719318266L, 51412489208062L
                    };
                }//</editor-fold>

                public static long[] ThunderBeam() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        6000L,
                        405L, 4285006074L, 17046714974462L, 34364022587642L, 51406452556030L,
                        68723760955642L, 85766191710462L, 103083500110074L, 120125930864894L, 137443239526650L,
                        154485670281470L, 171802978943226L, 188845409960190L, 206162717311226L, 223205147017470L,
                        240522454630650L, 257564884336894L, 274882191950074L, 291924621918462L, 309241929531642L,
                        326284359500030L, 343601667899642L, 360644098654462L, 377961407054074L, 11831607546L,
                        17054261575934L, 34371569975546L, 51414000730366L, 68731309392122L, 85773740146942L,
                        103091047760122L, 120133477466366L, 137450785079546L, 154493215047934L, 171810523447546L,
                        188852954202366L, 206170262864122L, 223212693618942L, 240530001232122L, 257572430938366L,
                        274889738551546L, 291932168519934L, 309249476919546L, 326291907674366L, 343609216336122L,
                        360651647090942L, 377968954704122L, 20420493562L, 17062841286910L, 34380158861562L,
                        51422572052734L, 68739894870266L, 85782338994430L, 103099633238266L, 120142051934462L,
                        137459373965562L, 154501794758910L, 171819112333562L, 188861525524734L, 206178848342266L,
                        223221292466430L, 240538586710266L, 257581005406462L, 274898327437562L, 291940748230910L,
                        309258065805562L, 326300478996734L, 343617801814266L, 360660245938430L, 377977540182266L
                    };
                }//</editor-fold>

                public static long[] IceSlasher() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        2000L,
                        285L, 4280025338L, 17046712090878L, 34364023374074L, 68723756761338L,
                        85766188826878L, 103083500110074L, 12878873326L, 68732355609326L, 21470118638L,
                        68740946854638L
                    };
                }//</editor-fold>

                public static long[] HyperBomb() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        8000L,
                        177L, 4282908922L, 17046711566590L, 34364018655482L, 51406447837438L,
                        68723755188474L, 85766184894718L, 103083492245754L, 120125922214142L, 137443229827322L,
                        154485659533566L, 171802966884602L, 188845396852990L, 206162704728314L, 223205134696702L,
                        240522442572026L, 257564872540414L, 274882180415738L, 291924610384126L, 309241918259450L,
                        360642752807166L, 377960059896058L, 395002489078014L, 412319796691194L, 429362226135290L,
                        446404655841534L, 12869435642L, 17055298879742L, 34372606230778L, 51415035937022L,
                        68732343550202L, 85774773256446L, 103092080869626L, 120134510838014L, 137451818451194L,
                        154494248419582L, 171811556032762L, 188853986001150L, 206171293876474L, 223213723844862L,
                        240531031720186L, 257573461688574L, 360651309973758L, 377968617062650L, 395011046244606L,
                        412328353595642L, 429370783039738L, 446413212745982L
                    };
                }//</editor-fold>

                public static long[] SparkShock() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        4000L,
                        4177789334L, 45633910342042L, 91538520801686L, 137443131261334L
                    };
                }//</editor-fold>

            }//</editor-fold>

            public static final class Castlevania {//<editor-fold defaultstate="collapsed" desc="Cuerpo de la biblioteca »">

                public static long[] HolyWater() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        6000L,
                        4290773494L, 34364030190070L, 68723764363766L, 103083503780342L, 171802983662070L, 206162723865078L, 240522456728054L, 274882196668918L, 343601674191350L, 377961413870070L
                    };
                }//</editor-fold>

                public static long[] EnemyCry() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        4664L,
                        4285792422L, 11274278142122L, 22819152068774L, 34089142583466L, 45633751220326L, 52505596395722L, 66249355690186L, 79993117343946L, 93736943747274L, 107480736596070L,
                        114352690823370L, 128096483672266L, 141840276521062L, 148712157610086L, 155584103710922L, 169327795896522L, 183071630688458L, 196815457091786L, 210559283495014L, 217431198138470L,
                        224303076868298L, 238046869717194L, 251790771617994L, 265534564466890L, 279278390870118L, 286150339068006L, 293022218059978L, 306766078017738L
                    };
                }//</editor-fold>

                public static long[] EnemyKill() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        4000L,
                        4276879862L, 34363646935542L, 68723117654518L, 103082555081206L, 137441959739894L, 171801362301430L, 206160999743990L
                    };
                }//</editor-fold>

                public static long[] Heart() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        8000L,
                        4283433362L, 27492073079186L, 54979862987150L, 82192774726038L, 109955442016658L, 137442195669994L, 206161672930282L, 274881149666282L
                    };
                }//</editor-fold>

                public static long[] GoldKnife() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        6000L,
                        4285792758L, 34363891253750L, 68723326321142L, 103082865459702L, 137442366849526L, 171801905988086L, 206161340269046L, 240520845853174L, 274880313688566L, 309239819272694L,
                        343599287108086L, 377958792692214L
                    };
                }//</editor-fold>

            }//</editor-fold>

            public static final class Sonic {//<editor-fold defaultstate="collapsed" desc="Cuerpo de la biblioteca »">

                public static long[] Skid() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        6012L,
                        4282908838L, 11274276569258L, 22819149185190L, 34089142845610L, 68448881737898L, 79993753305258L, 91538625921190L, 102808619581610L, 114353492197546L, 125898363764902L,
                        137168358473898L, 148713230041258L, 160258102657190L, 171528096317610L, 183072968933546L, 194617840500902L, 205887835209898L, 217432706777258L, 228977579393190L, 240247573053610L,
                        251792445669546L, 263337317236902L, 274607311945898L, 286152183513258L, 297697056129190L, 308967049789610L
                    };
                }//</editor-fold>

                public static long[] RingPickup() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        4064L,
                        4281336306L, 34089142583798L, 68448882265086L
                    };
                }//</editor-fold>

                public static long[] RingSpill() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        18248L,
                        279160554722L, 17321590260090L, 43160113513574L, 86041067521002L, 120400805367962L, 154760544257002L, 223480020992998L, 291924619822058L, 360644096558058L, 412321142538490L,
                        429363572769770L, 429363573294058L, 498083049515770L, 498083050040058L
                    };
                }//</editor-fold>

            }//</editor-fold>

            public static final class Pacman {//<editor-fold defaultstate="collapsed" desc="Cuerpo de la biblioteca »">

                public static long[] EatingDots() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        4000L,
                        4241490046L, 8525458178174L, 17046674604158L, 25567890505858L, 34363984314494L, 68723723206782L, 77244937535614L, 85766151864446L, 94287365931138L, 103083457642622L,
                        137443194962046L, 145964411650174L, 154485628076158L, 163006843977858L, 171802937786494L, 206162676678782L, 214683891007614L, 223205105336446L, 231726319403138L, 240522411114622L
                    };
                }//</editor-fold>

                public static long[] Start() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        2000L,
                        4277928062L, 8525492256894L, 17046706061438L, 25567919603842L, 34364009480318L, 42885221449854L, 51406439710846L, 59927657971842L, 68723752566910L, 77244968992894L,
                        85766184894590L, 94287400796290L, 103083494604926L
                    };
                }//</editor-fold>

                public static long[] DeathBloop() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        1988L,
                        4275568722L, 5501836853334L, 11274274734166L, 17046712090710L, 22819149185110L, 28591586017362L, 34089144942678L, 39861581512790L, 45634018082902L, 51406454653014L,
                        57178891223126L, 68448874397782L, 74221313589334L, 79993751470166L, 85766188826710L, 91538625921110L, 97311062753362L, 102808621678678L, 108581058248790L, 114353494818902L,
                        120125931389014L, 125898367959126L
                    };
                }//</editor-fold>

            }//</editor-fold>

            public static final class Zelda {

                public static long[] Treasure1() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        4000L,
                        4180934906L, 17046611689726L, 34363920351482L, 51406351106302L, 68723659505914L, 85766090260734L, 103083398922490L, 120125829415166L, 137443138078674L
                    };
                }//</editor-fold>

                public static long[] Treasure2() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        7996L,
                        277L, 4279501798L, 68448878593002L, 137168355591146L, 205887832592290L, 12865242086L, 68457464333290L, 137176941331434L, 205896418332578L
                    };
                }//</editor-fold>

                public static long[] PuzzleSolved() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        6000L,
                        4282122742L, 34364020228598L, 68723757810166L, 103083494605302L, 137443232711158L, 171802973176310L, 206162712592886L, 240522452011462L
                    };
                }//</editor-fold>

                public static long[] HitEnemy() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        2000L,
                        3804233854L, 8525019873406L, 17046234464382L, 25567450628226L, 34363542601854L, 42884759027838L, 51405972832382L, 59927662428290L, 68723752304766L, 77244968992894L,
                        85766185681022L, 94287396077698L, 103083492245630L
                    };
                }//</editor-fold>

                public static long[] KillEnemy() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        2000L,
                        4278452350L, 8525496451198L, 17046708158590L, 25567926157566L, 42885229576318L, 51406448099454L, 59927660331138L, 68723756761338L
                    };
                }//</editor-fold>

                public static long[] Block() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        2000L,
                        4283171066L, 17046712877310L, 34364021540318L
                    };
                }//</editor-fold>

                public static long[] Death() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
                    return new long[]{
                        8000L,
                        4281073914L, 17046711042302L, 34364018917626L, 51406448886014L, 68723757547770L, 85766187516158L, 103083495391482L, 120125925359870L, 137443234021626L, 154485663990014L,
                        171802971865338L, 188845401833726L, 206162710495482L, 223205140463870L, 240522448339194L, 257564878307582L, 274882186969338L, 291924616937726L, 309241924813050L, 326284354781438L,
                        343601662394618L, 360644092363006L, 377961400240582L
                    };
                }//</editor-fold>
            }

        }

    }

    public static final class Melodias {//<editor-fold defaultstate="collapsed" desc="Cuerpo de la biblioteca »">

        public static long[] Simpsons() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
            return new long[]{
                27748,
                6998198474L, 154488919819742L, 257568135448030L, 360647888208626L,
                412323860449482L, 566805780235742L, 669884994291166L, 772964745478898L,
                824641791197934L, 876043959796466L, 927721006301934L, 979121564552122L,
                1288360820212466L, 1340037866717934L, 1391440035316466L, 1443117082084078L,
                1494518177728718L, 1649275513602798L, 1700677682201330L, 1752354728706798L,
                1803756360435166L
            };
        }//</editor-fold>

        public static long[] CarolOfTheBells() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
            return new long[]{
                332984L,
                41L, 17179869233L,
                1830290882L, 112152217387750L, 168227478438630L, 224302335788482L,
                336452723934658L, 448602741932774L, 504678103646950L, 560752659006918L, 672903416251846L,
                785328177939174L, 841403506098918L, 897478095013314L, 1009628718040514L, 1121778635375334L,
                1177854030643942L, 1233928820884934L, 1346078939811014L, 1346079309694406L, 1458504373371622L,
                1514579399541478L, 1649542337134918L, 1682804274630974L, 1682804779255234L, 1794954663035622L,
                1851029823423206L, 1907104915654086L, 2019255100641602L, 2019255438017990L, 2131680132596454L,
                2187755427201766L, 2243830183888322L, 2355980469276990L, 2355980773361090L, 2468130824913638L,
                2524206018855654L, 2580280976868806L, 2692431228965186L, 2692431163688390L, 2804856026039014L,
                2860931421307622L, 2917006245103042L, 3029156329165118L, 3029156767466946L, 3141306651247334L,
                3197382080070374L, 3253456903865798L, 3365606987403586L, 3365607292011974L, 3478032322134754L,
                3534107314750182L, 3590182339872194L, 3702332489994558L, 3702332694463938L, 3814482846679782L,
                3870558141285094L, 3926632864417222L, 4038783314694466L, 4151208279016162L, 4151208280326882L,
                4207283674022630L, 4207283675333350L, 4263358565713346L, 4263358567024066L, 4375508817547582L,
                4487658904224486L, 4487658905010918L, 4543734165013222L, 4543734165799654L, 4599809224476098L,
                4599809225262530L, 4711959409463618L, 4824384306676450L, 4824384307987170L, 4880459601019622L,
                4880459602330342L, 4936534626928066L, 4936534628238786L, 5048684945871166L, 5160834764112614L,
                5160834764899046L, 5216910125564646L, 5216910126351078L, 5272985319245250L, 5272985320031682L,
                5385135403307330L, 5497285456429798L, 5497285457216230L, 5553635494462182L, 5553635495248614L,
                5609710654588354L, 5609710655374786L, 5721861007610174L, 5834010825327334L, 5834010826113766L,
                5890086220333798L, 5890086221120230L, 5946161279796674L, 5946161280583106L, 6058311498862914L,
                6170461517644518L, 6170461518430950L, 6226811522122466L, 6226811522908898L, 6282886715803074L,
                6282886716589506L, 6395037002240318L, 6507186887328486L, 6507186888377062L, 6563262114562790L,
                6563262115611366L, 6619337274688962L, 6619337275737538L, 6731487963255106L, 6843637713864134L,
                6843637714912710L, 6956063012685250L, 6956063013733826L, 7068213197934910L, 7180363317642690L,
                7180363318691266L, 7292513705002434L, 7292513706051010L, 7404663923806530L, 7516813742048710L,
                7516813742835142L, 7629239208641986L, 7629239209428418L, 7741389192040766L, 7853539211085250L,
                7853539212133826L, 7965689631999426L, 7965689633048002L, 8077839614611778L, 8189989734581702L,
                8189989735368134L, 8302415033402818L, 8302415034189250L, 8414565218390334L, 8526715305067970L,
                8526715305854402L, 8638865893754306L, 8638865894540738L, 8751015877153090L, 8863165728687558L,
                8863165729473990L, 8975591161726402L, 8975591162512834L, 9087741313159486L, 9199891164956098L,
                9199891165742530L, 9312041652979138L, 9312041653765570L, 9424191973232958L, 9424192041128254L,
                9424192042176830L, 9760917241467198L, 9760917141328190L, 9760917142114622L, 10097367429943614L,
                10097367698903358L, 10097367700738366L, 10434093101355326L, 10434093136220478L, 10434093137006910L,
                10770543491697318L, 10770543359314598L, 12116895583702210L, 12116895852922306L, 12229045568930534L,
                12285120829981414L, 12420083364921674L, 12453620415205694L, 12453621121156546L, 12565770837164774L,
                12621846232433382L, 12677921123337666L, 12790070972780862L, 12790071612147138L, 12902221563036390L,
                12958296756978406L, 13014371815654854L, 13126796408525118L, 13126797048153538L, 13238946864825062L,
                13295022260093670L, 13351097150997954L, 13463247033995582L, 13463247438480834L, 13575397490033382L,
                13631472918856422L, 13687547641988550L, 13799972436185406L, 13799972908041666L, 13912122993148646L,
                13968198187090662L, 14024272910222786L, 14136422859542846L, 14136423499695554L, 14248573584802534L,
                14304648812298982L, 14360723535431110L, 14473148529905982L, 14473148902147522L, 14585298886591206L,
                14641374248305382L, 14697448937883074L, 14809599287497022L, 14921749206139622L, 14921749207450342L,
                14977824634700518L, 14977824636011238L, 15033899660608966L, 15033899661919686L, 15146049811779906L,
                15258474809918182L, 15258474810704614L, 15314550171370214L, 15314550172156646L, 15370625130169794L,
                15370625130956226L, 15482775449375038L, 15594925334463206L, 15594925335773926L, 15651000796578534L,
                15651000797889254L, 15707075788932550L, 15707075790243270L, 15819225839440194L, 15931650770469606L,
                15931650771256038L, 15987725964149478L, 15987725964935910L, 16043801157830082L, 16043801158616514L,
                16155951342555454L, 16268101261460198L, 16268101262246630L, 16324176589357798L, 16324176590144230L,
                16380251783038406L, 16380251783824838L, 16492401834070338L, 16604826731021030L, 16604826731807462L,
                16660901891146470L, 16660901891932902L, 16716977185490370L, 16716977186276802L, 16829127371002174L,
                16941277389783782L, 16941277390570214L, 16997352516354790L, 16997352517141222L, 17053427810698694L,
                17053427811485126L, 17165577996472642L, 17278002625250022L, 17278002626298598L, 17334078053810918L,
                17334078054859494L, 17390153415263682L, 17390153416312258L, 17502303734731070L, 17614453753775554L,
                17614453754824130L, 17726603973363142L, 17726603974411718L, 17838754259276098L, 17951179122673090L,
                17951179123721666L, 18063329442923970L, 18063329443972546L, 18175479829500222L, 18287629647742402L,
                18287629648528834L, 18399780102211014L, 18399780102997446L, 18511930454708546L, 18624355016115650L,
                18624355017164226L, 18736505537693122L, 18736505538741698L, 18848655620968766L, 18960805808047554L,
                18960805808833986L, 19072956027635138L, 19072956028421570L, 19185106447503682L, 19297530975880642L,
                19297530976667074L, 19409681665230274L, 19409681666016706L, 19521831648629054L, 19633981667935682L,
                19633981668722114L, 19746132189513154L, 19746132190299586L, 19858282307391810L, 19970432259851718L,
                19970432260638150L, 20082857525118402L, 20082857525904834L, 20195007912481086L, 20195007946821950L,
                20195007947870526L, 20531458235699522L, 20531458001342786L, 20531458002129218L, 20868183436300606L,
                20868183705260350L, 20868183707095358L, 21204634196250946L, 21204634164007234L, 21204634164793666L,
                21541359229618854L, 21541359432780454L, 2692439383740738L, 3029164852777278L, 3365615745896770L,
                3702341080977726L, 4038792580695494L, 4151217073947362L, 4207292469215974L, 4263367192348098L,
                4375517580494274L, 4487667531383526L, 4543742893097702L, 4599817616229826L, 4711968239257030L,
                4824392967389922L, 4880468396212966L, 4936543253562818L, 5048693675263426L, 5160843559043814L,
                5216918920757990L, 5272993643890114L, 5385144368629378L, 5497294319256386L, 5553644626248510L,
                5609719114237454L, 5721869838190210L, 5834019721708350L, 5890094983021374L, 5946169638782482L,
                6058320530507394L, 6170470380471106L, 6226820452582206L, 6282895175452174L, 6395046067177090L,
                6507195715814206L, 6563270977127230L, 6619346069095954L, 6731496995685830L, 6843646812619494L,
                6899996548661986L, 6956071574045502L, 7012146700092166L, 7068221859956162L, 7180372280869606L,
                7236447139005158L, 7292522197943102L, 7348597223326470L, 7404672618857926L, 7516822804890342L,
                7572897763689190L, 7629247835800382L, 7685322659857214L, 7741397819459202L, 7853547736793918L,
                7909623333389062L, 7965697989412290L, 8077848039916262L, 8133923737436902L, 8189998763868902L,
                8246073890702054L, 8302423795041086L, 8358499056091966L, 8414574149632830L, 8470649511609150L,
                8526723933013634L, 8638874017859086L, 8751023698477798L, 8807099697988326L, 8863174757974758L,
                8919249884807910L, 8975599755592510L, 9031674983088958L, 9087750210847550L, 9143825472160574L,
                9199899860010626L, 9312049911301646L, 9424200466433666L, 9536350517986114L, 9592425779036994L,
                9648775380076046L, 9760925902440066L, 9873075584893758L, 9929151047271230L, 9985225770403342L,
                10097376225658498L, 10209526075884354L, 10265601336935234L, 10321676127176210L, 10434101493892738L,
                10546251444781886L, 10602326571615038L, 10658401361856014L, 10770551817111170L, 10882701835109186L,
                10938777129714498L, 10994852121282066L, 11107277320226434L, 11219427204006718L, 11275502397948734L,
                11331577355961870L, 11443727676999298L, 11555877527225154L, 11611952855384898L, 11668027679180306L,
                11780452676798082L, 11892602661241662L, 11948677888738110L, 12004752746087950L, 13463255591424318L,
                13799980993351998L, 14136431550927166L, 14473157053780286L, 14809608486389186L, 14921758068179686L,
                14977833429893862L, 15033908320798150L, 15146058675389894L, 15258483604849382L, 15314558899454694L,
                15370633656141250L, 15482784212059586L, 15594933995176678L, 15651009356890854L, 15707084247795142L,
                15819234736604614L, 15931659531846374L, 15987734927114982L, 16043809616692674L, 16155960442095234L,
                16268110157841214L, 16324185385599806L, 16380260209133074L, 16492410899531398L, 16604835761619774L,
                16660910955823934L, 16716985712248334L, 16829136369092226L, 16941286353273662L, 16997361513923390L,
                17053436404565522L, 17165587061409414L, 17278011755725630L, 17334086983484222L, 17390161907680782L,
                17502313035597250L, 17614462718313190L, 17670537710666470L, 17726612668941118L, 17782687660770054L,
                17838762787079622L, 17951188052345574L, 18007263178916582L, 18063338002973502L, 18119413028356870L,
                18175488457442754L, 18287638609920742L, 18343713702937318L, 18399788930695998L, 18455863788307266L,
                18511938746582662L, 18624363608933182L, 18680439171973894L, 18736513794442690L, 18848663912055526L,
                18904739542467302L, 18960814736671462L, 19016889930613478L, 19072964957045566L, 19129040117433154L,
                19185115110310722L, 19241190338069314L, 19297539838707330L, 19409689822889486L, 19521839771943654L,
                19577915536573158L, 19633990730777318L, 19690065790501606L, 19746140884042558L, 19802216077984578L,
                19858290936644418L, 19914366164403010L, 19970441022015110L, 20082865884104206L, 20195016237909634L,
                20307166390125374L, 20363241785393982L, 20419316307199506L, 20531466997335682L, 20643616881115970L,
                20699967020073790L, 20756041743205902L, 20868192232015490L, 20980342015132478L, 21036417276183358L,
                21092492099978770L, 21204642555233922L, 21316792539677506L, 21373142577972030L, 21429217334658574L,
                21541367823468162L, 21653517942129470L, 21709592867636030L, 21765667691431442L, 21877818348013186L,
                21989968265347906L, 22046043492844354L, 22102393026774542L, 22214543414920834L, 22326693365809982L,
                22382768660415294L, 22438843517765134L, 22550993671030402L, 22663143722582850L, 22719218882970434L,
                22775568551118350L
            };
        }//</editor-fold>

        public static long[] ParaElisa() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
            return new long[]{
                618124L,
                1227883334L, 56351097881418L, 112976349627206L, 169601131086662L,
                226226215060294L, 282850693481286L, 339475777979206L, 396100559176518L,
                452725233156934L, 452725239449110L, 509350083822406L, 565975202398982L,
                622325107000138L, 678950158205766L, 735574840574790L, 792199480476486L,
                792199958365718L, 848824433115974L, 905449450767110L, 962073899041606L,
                1018698950247238L, 1075323833418566L, 1131948608324422L, 1131948783175190L,
                1188298614637386L, 1244923565441798L, 1301548080563014L, 1358173100311366L,
                1414797881770822L, 1471422730863430L, 1528047646540614L, 1584672596296518L,
                1641297410261830L, 1697922360542022L, 1754272129614666L, 1810896971367238L,
                1810896944104986L, 1867521922696006L, 1924147108381446L, 1980771421127494L,
                2037396405224262L, 2094021624464198L, 2150646029484870L, 2150646809363990L,
                2207271049233222L, 2263895999775494L, 2320245905163082L, 2376871192822598L,
                2433495571628870L, 2490120279425862L, 2490120386382906L, 2546745197200198L,
                2603370382885638L, 2716619850646342L, 2773244665660230L, 2829869749633862L,
                2886219720295242L, 2942844368061254L, 2999468947145542L, 3056094165861190L,
                3112718879949638L, 3169343520375622L, 3169343727994390L, 3225968605922118L,
                3282593623835398L, 3339218104353606L, 3395843054895942L, 3452193329120074L,
                3508817935467334L, 3508818514019866L, 3565442955215686L, 3622067972866822L,
                3678692253369158L, 3735317069693766L, 3791942456181574L, 3848566794879814L,
                3848567238166038L, 3905191679099718L, 3961816864785158L, 4018166602662730L,
                4074791790183238L, 4131416403870534L, 4188041487844166L, 4244665833096006L,
                4301290849960774L, 4357915697480518L, 4414540647760710L, 4471165328294726L,
                4527790203601734L, 4527789874349590L, 4584140377686858L, 4640765160719110L,
                4697389943227206L, 4754014927323974L, 4810639911682886L, 4867264417366854L,
                4867264895256086L, 4923889537778502L, 4980514320548614L, 5037138835407686L,
                5093763854631750L, 5150114060174154L, 5206738700862278L, 5206738640045594L,
                5263363719299910L, 5319988670104326L, 5376613656822598L, 5433238975677254L,
                5489864429011782L, 5546488935482182L, 5546489177704742L, 5603113920365382L,
                5659739072496390L, 5716088239948618L, 5772713527608134L, 5829338644611910L,
                5885963115692870L, 5885963325147434L, 5942588336767814L, 5999213354418950L,
                6055837332407110L, 6112462720992070L, 6169087435080518L, 6225712007873350L,
                6225712082061606L, 6282062114849610L, 6338687132762886L, 6395311211676486L,
                6451936532890438L, 6508561481859910L, 6565185550549406L, 6565185894221334L,
                6621811107169094L, 6678436563124998L, 6735060271104838L, 6791685492179718L,
                6848035124413258L, 6904660412596998L, 6961284657447750L, 7017909878522630L,
                7074534321292102L, 7131159405265670L, 7187783884735302L, 7244408901600006L,
                7301033615950662L, 7357658397934342L, 7414008100160330L, 7470632882144074L,
                7527257831375686L, 7583882747577158L, 7640507730363206L, 7697132579455814L,
                7753757393421126L, 7810382310146886L, 7867007091344198L, 7923631798879046L,
                7923631771616790L, 7980256750207814L, 8036606755996422L, 8093231471395654L,
                8149856455492422L, 8206481506960198L, 8263106012644166L, 8263106490533398L,
                8319730931729222L, 8376356083598086L, 8432980464763718L, 8489605415306054L,
                8546230566912838L, 8602580262585162L, 8602580605208090L, 8659205213913926L,
                8715830131163910L, 8772454847611718L, 8829080001577798L, 8885704648819526L,
                8942329531466566L, 8998954413589318L, 9055579396899654L, 9112204043092806L,
                9168554115466058L, 9225178829554502L, 9281803469980486L, 9281803576935962L,
                9338428421309254L, 9395053606994694L, 9451678255285062L, 9508303105164102L,
                9564928223740742L, 9621552628761414L, 9621553140205078L, 9678177547846470L,
                9734527721145094L, 9791152437330758L, 9847777456554822L, 9904402070242118L,
                9961026912256838L, 9961026817885718L, 10017651964248902L, 10074276881498886L,
                10130901801108294L, 10187527421952838L, 10244152606851910L, 10300502369633098L,
                10300502913845546L, 10357127455179590L, 10413752640865030L, 10470376585560902L,
                10527001973883718L, 10583626822452038L, 10640251461305158L, 10640251570096422L,
                10696876581716806L, 10753501599367942L, 10810125745128262L, 10866476121588554L,
                10923101003449158L, 10979725341360966L, 10979725482658090L, 11036350326244166L,
                11092975344157446L, 11149599691506502L, 11206224945611590L, 11262849760363334L,
                11319473862607262L, 11319473937843734L, 11376099117237062L, 11432449728840454L,
                11489073537483590L, 11545698859221766L, 11602323268698950L, 11658948556882694L,
                11715573170832198L, 11772198157026054L, 11828822499132230L, 11885447314670342L,
                11942072196793158L, 11998422100869894L, 12055047083656006L, 12111671731421958L,
                12168296479327046L, 12224921227756358L, 12281546311205702L, 12338171126743878L,
                12394796075975494L, 12451421059285830L, 12508045638370118L, 12564395677188938L,
                12621020525495110L, 12677645467910982L, 12677645339985434L, 12734270385685318L,
                12790895302935302L, 12847519682790214L, 12904144532669254L, 12960769919681350L,
                13017394291147590L, 13017394903254550L, 13074019310895942L, 13130369417085702L,
                13186993966023494L, 13243618849456966L, 13300244001063750L, 13356868641751878L,
                13356868950820374L, 13413493626635078L, 13470118510330630L, 13526743059006278L,
                13583368246526790L, 13639992960877382L, 13696342932063050L, 13752967847740230L,
                13809592730387270L, 13866217376580422L, 13922842159088454L, 13979467040949062L,
                14036091782038342L, 14036091821884950L, 14092716565594950L, 14149341885498118L,
                14205966500234054L, 14262316505760586L, 14318941725000518L, 14375566062912326L,
                14375566742128154L, 14432191049106246L, 14488816167420678L, 14545440447398726L,
                14602065634394950L, 14658690382299974L, 14715314989433670L, 14715315096389142L,
                14771939907208006L, 14828290181432074L, 14884915298959774L, 14884915299484062L,
                14884914797216158L, 14884914799313310L, 14941540281745822L, 14941540282532254L,
                14941540216734110L, 14941540218569118L, 14998165499150750L, 14998165499937182L,
                14998165500461470L, 14998165400846750L, 14998165401633182L, 14998165402943902L,
                15054789777031994L, 15054789949787426L, 15111414794683194L, 15168039476527930L,
                15224664190354234L, 15281289341961018L, 15281289379972322L, 15337914022232886L,
                15366226485182874L, 15394263757226810L, 15394263931029134L, 15450888976466746L,
                15507513826345786L, 15507513460393498L, 15564138305028922L, 15620763423343418L,
                15620763697022178L, 15677388103353146L, 15705701037113758L, 15734012850209594L,
                15734012991767366L, 15790638339457850L, 15790637638746950L, 15847262614979386L,
                15847262615503674L, 15847262616290106L, 15847262554161990L, 15903887735128890L,
                15903887234958150L, 15960512413303606L, 15960512413827894L, 15960512414614326L,
                15960512385254214L, 16016862689100602L, 16016862288544586L, 16073487031731002L,
                16073487237514894L, 16130112217154362L, 16186737066771258L, 16186736666478026L,
                16243361747043130L, 16288441592971434L, 16299986797986618L, 16299986464801182L,
                16328298989355422L, 16356611444704058L, 16356611615621534L, 16384924107407774L,
                16413236292485946L, 16413236633013534L, 16469861276582714L, 16526486394635062L,
                16582835861455674L, 16639460912399162L, 16639461318722374L, 16696085693334330L,
                16696085865825094L, 16752710540854074L, 16752710916245802L, 16809335357440826L,
                16865960441938746L, 16922585021547322L, 16922585026528070L, 16979210271195962L,
                16979210274341690L, 16979210043392838L, 17035834583941946L, 17035834353255238L,
                17092459802395446L, 17092459739744718L, 17148809909895994L, 17205434454377274L,
                17262059574002490L, 17262059475960018L, 17276353227260110L, 17290372000252114L,
                17304665752338638L, 17318683917157178L, 17318684358345954L, 17375309372588858L,
                17403621563695518L, 17431933951673970L, 17431933952722546L, 17431933954818434L,
                17460246548840862L, 17488558332576158L, 17516871598997918L, 17545183282594206L,
                17573496313610654L, 17601808197484958L, 17601808198009246L, 17601808064840094L,
                17630121162441118L, 17658433314488730L, 17658433315275162L, 17658433048150426L,
                17686471133364638L, 17714783318442398L, 17714783319228830L, 17714783319753118L,
                17714782986043806L, 17743095847977374L, 17771407998977650L, 17771408000026226L,
                17771408000812658L, 17771407969616286L, 17799720763916702L, 17828033223197086L,
                17856345345360286L, 17884657661249138L, 17884657662297714L, 17884657601479070L,
                17912969991815582L, 17941282516369822L, 17969594839859614L, 17997907460097650L,
                17997907461146226L, 17997907364413854L, 18026220125684126L, 18054532314694046L,
                18082844704768386L, 18111157393950322L, 18111157394998898L, 18111156927332766L,
                18139469823345054L, 18167781607080350L, 18196094873502110L, 18224406590652826L,
                18252444643099038L, 18280756694745502L, 18280756695269790L, 18280756729872798L,
                18309069525483934L, 18337381677531550L, 18337381678317982L, 18337381478302110L,
                18365694407868830L, 18394006559392158L, 18394006560178590L, 18394006560702878L,
                18394006327656862L, 18422318988263838L, 18450631374145138L, 18450631375193714L,
                18450631375980146L, 18450631143457182L, 18478943904203166L, 18507256665473438L,
                18535568485646750L, 18563880868644466L, 18563880869693042L, 18563881110864286L,
                18592193400537502L, 18620505690210718L, 18648818382799262L, 18677130801710706L,
                18677130802759282L, 18677130706026910L, 18705443467297182L, 18733755555643806L,
                18762067878609282L, 18790380499633774L, 18790380500420206L, 18790380571984282L,
                18818418185863582L, 18846730442244510L, 18875042732179870L, 18903355223966110L,
                18931667512852894L, 18959980274123166L, 18988292496949662L, 19016605089399198L,
                19044917277622686L, 19073229871120798L, 19101542261719454L, 19129854820616486L,
                19299728828924742L, 19356353746174790L, 19412703884608330L, 19469328800811306L,
                19639203312436026L, 19695828431013078L, 19780765368451910L, 19837390251098886L,
                19894014965449542L, 19950639747433222L, 20006989919421258L, 20063614802068230L,
                20120239415755590L, 20176864231293766L, 20233489214079814L, 20290114096726854L,
                20346738776474438L, 20403363659645766L, 20459988776387398L, 20516613483922246L,
                20516613490214422L, 20572963624452938L, 20629588508148486L, 20686213324211014L,
                20742838308307782L, 20799463225557830L, 20856087764796230L, 20856088175576598L,
                20912712750990150L, 20969337466651398L, 21025962351133510L, 21082587301675846L,
                21138937105613642L, 21195561746301766L, 21195562021815834L, 21252186563412806L,
                21308811816207110L, 21365436331328326L, 21422061552403270L, 21478686166090566L,
                21535311015183174L, 21591935997969222L, 21648560981279558L, 21704910615348042L,
                21761535498519366L, 21818160447488838L, 21874784987251526L, 21874785194870294L,
                21931409938580294L, 21988034990048006L, 22044659772556102L, 22101284790207302L,
                22157909808120646L, 22214534347359046L, 22214534892357142L, 22270884623418186L,
                22327509406188294L, 22384133887492934L, 22440758839608134L, 22497383788839750L,
                22554008429527878L, 22554008402265622L, 22610633380856646L, 22667258331661062L,
                22723882982835014L, 22780508670788422L, 22836859346879306L, 22893483886904134L,
                22893484296898858L, 22950109073113926L, 23006734359462662L, 23063358102831942L,
                23119983424045894L, 23176608373277510L, 23233233012130630L, 23233233120921894L,
                23289858166096710L, 23346483217302278L, 23402832149611338L, 23459457303315270L,
                23516082420056902L, 23572706791523142L, 23572707067037994L, 23629331843515206L,
                23685957062755078L, 23742581108114246L, 23799206496437062L, 23855831311188806L,
                23912455379878302L, 23912455790659094L, 23968805756601162L, 24025431246111494L,
                24082055188972358L, 24138680510710534L, 24195304785969990L, 24251930241925894L,
                24308554486776646L, 24365179707851526L, 24421804184175430L, 24478429100376838L,
                24534778970374986L, 24591403752358662L, 24648028466709318L, 24704653483574022L,
                24761278063706950L, 24817902912799558L, 24874527794922310L, 24931152711123782L,
                24987777492583238L, 25044402341675846L, 25100752210625354L, 25157377060242246L,
                25214002076320582L, 25270626750300998L, 25270626957919766L, 25327251735184198L,
                25383876719543046L, 25440501367833414L, 25497126251266886L, 25553751436952390L,
                25610375909081926L, 25610376353416726L, 25666726017368906L, 25723350967911174L,
                25779975651066694L, 25836600534500166L, 25893225585443654L, 25949850091914054L,
                25949850568754710L, 26006475143906118L, 26063099994047238L, 26119724744049478L,
                26176349931569990L, 26232699566687050L, 26289324482888522L, 26345949398565702L,
                26402574448984902L, 26459198893851462L, 26515823911240518L, 26572448658883398L,
                26629073265754950L, 26629073406264854L, 26685698183529286L, 26742323335660294L,
                26798673038934858L, 26855298157249354L, 26911923141608262L, 26968547680846662L,
                26968547957409302L, 27025172633486150L, 27081797516919558L, 27138422300214086L,
                27195047487210310L, 27251672033788742L, 27308297110684062L, 27308297184085526L,
                27364922093732250L, 27421272467308958L, 27477897181921694L, 27534522064306590L,
                27591146879582622L, 27647771996848542L, 27647771666289486L, 27647771667075918L,
                27647771667862350L, 27647771668648782L, 27704396946342302L, 27761021795172766L,
                27817646711112094L, 27874271325061534L, 27930896475881882L, 27987246715240862L,
                27987246049397986L, 27987246050446562L, 27987246051757282L, 28043871228527006L,
                28100495976694174L, 28157120959742366L, 28213745808572830L, 28213745446814522L,
                28213745447600954L, 28270370590294430L, 28270370128134970L, 28270370128921402L,
                28326995338461598L, 28326995747146974L, 28326995748719838L, 28326995749506270L,
                28383620287955358L, 28440244969013662L, 28496869884952986L, 28553219822322078L,
                28553220398777970L, 28553220400350834L, 28553220401137266L, 28609844637598110L,
                28666469519983006L, 28666469794714450L, 28666469795500882L, 28666469796549458L,
                28723094402367902L, 28779719385416094L, 28836344167137694L, 28892968982413726L,
                28949593797689758L, 29006218476913054L, 29006218478748062L, 29006218517548318L,
                29006218519907614L, 29062843426406810L, 29062843428241818L, 29119193263112606L,
                29119193264947614L, 29175818078388638L, 29175818080223646L, 29232443094991262L,
                29232443096826270L, 29232442934035270L, 29232442936132422L, 29289067876712862L,
                29289067878547870L, 29289068050776902L, 29289068053136198L, 29345692457370014L,
                29345692458942878L, 29345692764867642L, 29345692766440506L, 29345692767226938L,
                29402317406863774L, 29402317408436638L, 29458942423466398L, 29458942425039262L,
                29515567070970270L, 29515567072543134L, 29572191986909598L, 29572191988482462L,
                29572192428623470L, 29572192430982766L, 29628816869294490L, 29628816870867354L,
                29685166874034590L, 29685166875345310L, 29685167214823054L, 29685167217182350L,
                29741791689310622L, 29741791690621342L, 29798416471032222L, 29798416472342942L,
                29798417081304714L, 29798417083401866L, 29855041286308254L, 29855041287618974L,
                29911666235802014L, 29911666236850590L, 29911666510005898L, 29911666512365194L,
                29968291151741342L, 29968291152789918L, 30024915797410206L, 30024915800555934L,
                30024915569611342L, 30024915571970638L, 30081540246733214L, 30138165330444702L,
                30194790112166298L, 30251139814654366L, 30307764797702558L, 30364389914968478L,
                30364390255498066L, 30364390256284498L, 30364390257070930L, 30364390257857362L,
                30421014797353374L, 30477639646183838L, 30534264394351006L, 30590889310290334L,
                30647514226229662L, 30704139242832286L, 30704139248078046L, 30704139249126622L,
                30704139250437342L, 30760764024553882L, 30817113827705246L, 30873738877862302L,
                30930363693138334L, 30930363901805370L, 30930363902591802L, 30986988743295390L,
                30986988549571386L, 30986988550357818L, 31043613692789150L, 31043614505700578L,
                31043614506487010L, 31100238541619614L, 31156863323341214L, 31213488272834974L,
                31270112987447710L, 31270114068792942L, 31270114069579374L, 31326737903387038L,
                31383088109453726L, 31383088754332498L, 31383088755118930L, 31439712689848734L,
                31496337538679198L, 31552962454618526L, 31609587337003422L, 31666212286497182L,
                31722836699120030L, 31722837409271006L, 31722837411368158L, 31779461715722654L,
                31836086396780958L, 31892711212056990L, 31949061317198238L, 31949061926159162L,
                31949061928518458L, 32005686098919838L, 32005686707356474L, 32005686709715770L,
                32062310612205982L, 32062311321046242L, 32062311321832674L, 32062311323143394L,
                32118935360373150L, 32175560242758046L, 32232185091588510L, 32288810175299998L,
                32288810850584178L, 32288810851370610L, 32288810852419186L, 32345434822803870L,
                32402059772559774L, 32402060380474590L, 32402060381261022L, 32402060382047454L,
                32458684487172510L, 32515034424541598L, 32571659340480926L, 32628284055093662L,
                32628284931442290L, 32628284932228722L, 32628284933015154L, 32684909105250718L,
                32741534189227234L, 32741534158818530L, 32741534159867106L, 32741534161177826L,
                33081008103360114L, 33081008104408690L, 33081008038872690L, 33081008039396978L,
                33081008041231986L, 33420756788708978L, 33420756929217054L, 33457865548104234L,
                33495798666756654L, 33534006898459166L, 33571115316019754L, 33609048501781034L,
                33646981379523386L, 33646981380309818L, 33646981381358394L, 33646981484642850L,
                33684364611027498L, 33722297795478022L, 33760230909412154L, 33760230910198586L,
                33760230911247162L, 33760230979666462L, 33797339699216942L, 33835547829994026L,
                33873480915354142L, 33910589366469166L, 33948797396582954L, 33986730371842874L,
                33986730372629306L, 33986730373677882L, 33986730513662494L, 34023838929912362L,
                34061772013699590L, 34099980405048122L, 34099980405834554L, 34099980406883130L,
                34099979840913950L, 34137088929563178L, 34175022115324458L, 34212955234239010L,
                34250338596815402L, 34288271681913386L, 34326204553364282L, 34326204554150714L,
                34326204555199290L, 34326204731884062L, 34363313114579502L, 34401521176937002L,
                34439454452351802L, 34439454453138234L, 34439454454186810L, 34439454193615390L,
                34476562710790702L, 34514770907365930L, 34552704058262046L, 34589812608991786L,
                34627745692779054L, 34665953755136542L, 34703062372975146L, 34740995490316842L,
                34778928976757282L, 34816312036295210L, 34854245086528042L, 34892178170315294L,
                34929286788153902L, 34967494716293674L, 35005427934298654L, 35042536518582830L,
                35080744681603626L, 35118677564064582L, 35175302412632902L, 35231927463052102L,
                35288552176354118L, 35345177294406470L, 35401527164142410L, 35458151737459526L,
                35458151877969434L, 35514776755897158L, 35571401706701574L, 35628026287883078L,
                35684651271979846L, 35741276424110918L, 35797900896240454L, 35797901541901846L,
                35854526016652102L, 35911150832976646L, 35967500537561930L, 36024125488104262L,
                36080750606156614L, 36137375112627014L, 36137375555913238L, 36193999862629190L,
                36250625048314630L, 36307249563435846L, 36363874750956358L, 36420499599524678L,
                36477124482171718L, 36533474251506506L, 36590099100599110L, 36646723847455558L,
                36703348764181318L, 36759973511824198L, 36816598353576774L, 36816598326314518L,
                36873223137133382L, 36929848356373254L, 36986473004663622L, 37043097955205958L,
                37099448128766794L, 37156072768668486L, 37156073145894426L, 37212697788416838L,
                37269322537632518L, 37325947086046022L, 37382572172378950L, 37439196920283974L,
                37495821762298694L, 37495821701482006L, 37552446780736326L, 37609071630877446L,
                37665421840352074L, 37722047696077638L, 37778672679650118L, 37835297186120518L,
                37835297529006378L, 37891922439439174L, 37948547490906886L, 38005171234276166L,
                38061796555490118L, 38118421739602758L, 38175046009357126L, 38175046453692710L,
                38231396486742858L, 38288021672166150L, 38344645549491014L, 38401270803858246L,
                38457895786382150L, 38514520191402822L, 38514520232036646L, 38571145377612614L,
                38627770328417030L, 38684394340221766L, 38741019694990150L, 38797369665389386L,
                38853993968959902L, 38853993876424218L, 38910619156480838L, 38967244612436742L,
                39023868454634310L, 39080493776372486L, 39137118051631942L, 39193743272706822L,
                39250367953765190L, 39306993107731206L, 39363342672593738L, 39419967622349574L,
                39476592101819206L, 39533216917357318L, 39589841732371270L, 39646466849899270L,
                39703091295814470L, 39759716279124806L, 39816341228356422L, 39872966278775622L,
                39929316048110410L, 39985941132084038L, 40042565476287302L, 40099190359458630L,
                40155815308428102L, 40212439982408518L, 40212439988700694L, 40269064933737286L,
                40325690018759430L, 40382314566386502L, 40438939516928838L, 40495289757598538L,
                40551914229728070L, 40551914674062874L, 40608539115258694L, 40665164267127558L,
                40721788849619782L, 40778413833716550L, 40835038851105606L, 40891663558902598L,
                40891663733753366L, 40948288610894662L, 41004913226154758L, 41061263064695626L,
                41117888151552838L, 41174512899457862L, 41231137782104902L, 41287762530009926L,
                41344387647537990L, 41401012260176710L, 41457637311120198L, 41514262025208646L,
                41570886665634630L, 41570886839698966L, 41627236772610890L, 41683861790524166L,
                41740486472368966L, 41797111389356870L, 41853736306606918L, 41910361013617478L,
                41910361088853526L, 41966985999811398L, 42023610816135942L, 42080235432182598L,
                42136860585100102L, 42193210320880458L, 42249835293969634L, 42249835297115362L,
                42249835102080058L
            };
        }//</editor-fold>

        public static long[] HarryPotter() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
            return new long[]{
                134664L, 45,
                457949967025462L, 549484311349202L, 686923265606302L, 732827875804470L,
                824362218293870L, 1007705784059190L, 1099240126549922L, 1374118032707490L,
                1648995939125202L, 1786434893382302L, 1832339503580470L, 1923873845545582L,
                2107217410262326L, 2198751751707150L, 2656973222577462L, 2748507566901202L,
                2885946521158302L, 2931851131356470L, 3023385473845870L, 3206729039611190L,
                3298263383411310L, 3481606947079478L, 3573141289831022L, 3756484852712758L,
                3848019196774354L, 3985458149982878L, 4031362760181046L, 4122897102146158L,
                4306240666338614L, 4397775008569870L, 4855996480226614L, 4947530824288878L,
                5130874387170614L, 5222408731232878L, 5405752294114614L, 5497286638439022L,
                5680630202107190L, 5772164544858734L, 5955508107740470L, 6047042451015634L,
                6184481405534878L, 6230386015733046L, 6321920355601006L, 6505263919793462L,
                6596798265956878L, 7055019735778614L, 7146554079840878L, 7329897642722614L,
                7421431986784878L, 7604775549666614L, 7696309894515310L, 7879653458183478L,
                7971187800935022L, 8154531363816758L, 8246065707878354L, 8383504661086878L,
                8429409271285046L, 8520943613250158L, 8704287177442614L, 8795821519673870L
            };
        }//</editor-fold>

        public static long[] DavyJones() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
            return new long[]{
                762432L,
                1663568218L, 1665403230L, 1666716342L, 329028875845634L,
                329305397395458L, 329305399757146L, 493680741580802L, 494232140253530L,
                494232142088542L, 494232144188086L, 823259352533346L, 823535877228894L,
                988462616938842L, 988462618773854L, 988462621921974L, 1317489829218658L,
                1318041233130666L, 1400229726782638L, 1482693093624154L, 1482693095459166L,
                1482693098609686L, 1976647050067970L, 1976923570309466L, 1976923572144482L,
                1976923575292602L, 2306225660496222L, 2306502185978202L, 2471154046470494L,
                2471154051453626L, 2471154052764346L, 2636080792474294L, 2800732663710894L,
                2883196034745514L, 2965659401587034L, 2965659404735158L, 2965659406570166L,
                3130311269683898L, 3294963138562398L, 3459889878272346L, 3459889881422870L,
                3459889883257878L, 3624541746369210L, 3954120356268378L, 3954120359416506L,
                3954120360202938L, 4118772224362846L, 4283698968004954L, 4283698971150682L,
                4448350831642970L, 4448350835577530L, 4448350836626106L, 4613277577646774L,
                4777929446000986L, 4942581308852574L, 4942581311214266L, 4942581312787130L,
                5107508053805402L, 5272159918491994L, 5272159923995822L, 5354623295816874L,
                5437086662920538L, 5437086666068662L, 5437086666855094L, 5601738531017402L,
                5766390398585182L, 5931317139081562L, 5931317141443254L, 5931317143278262L,
                6095969006391994L, 6260895752653146L, 6425547615766874L, 6425547618128570L,
                6425547618915002L, 6590199483077306L, 6755126230387034L, 6919778092976474L,
                6919778094816278L, 6919778096126998L, 6919778097962006L, 7084704837931702L,
                7414008569661790L, 7414008571501590L, 7414008572812310L, 7578935314617014L,
                7908514961295706L, 7908514963130718L, 7908514964443830L, 8237541133385730L,
                8237818695122946L, 8237818697484638L, 8402467877027842L, 8402745437981018L,
                8402745439816030L, 8402745441915574L, 8731771610073442L, 8732324052863322L,
                8896975914666330L, 8896975916501342L, 8896975919649466L, 9226276964665694L,
                9226554530858154L, 9308743024510126L, 9391206391351642L, 9391206393186658L,
                9391206396337174L, 9885159307608066L, 9885436868036954L, 9885436869871970L,
                9885436873020090L, 10214737918036318L, 10215015483705690L, 10379942222104922L,
                10379942227088054L, 10379942228398774L, 10544594090201782L, 10709245961438382L,
                10791709332473002L, 10874172699314522L, 10874172702462646L, 10874172704297654L,
                11038824567411386L, 11203751314196826L, 11368403175999834L, 11368403179150358L,
                11368403180985366L, 11533055044096698L, 11862633653995866L, 11862633657143994L,
                11862633657930426L, 12027560399997274L, 12192212265732442L, 12192212268878170L,
                12356864129370458L, 12356864133305018L, 12356864134353594L, 12521790875374262L,
                12686442743728474L, 12851369484487002L, 12851369486848694L, 12851369488421558L,
                13016021351532890L, 13180673216219482L, 13180673221723310L, 13263136593544362L,
                13345599960648026L, 13345599963796150L, 13345599964582582L, 13510251828744890L,
                13674903696312670L, 13839830436809050L, 13839830439170742L, 13839830441005750L,
                14004482304119482L, 14169409050380634L, 14334060913494362L, 14334060915856058L,
                14334060916642490L, 14498712780804794L, 14663639528114522L, 14828291390703962L,
                14828291392543766L, 14828291393854486L, 14828291395689494L, 14993218135659190L,
                15322521867389278L, 15322521869229078L, 15322521870539798L, 15487448612344502L,
                15817028289431898L, 15817028291266906L, 15817028292577626L, 15817028294411434L,
                15817028295722154L, 15899216790422702L, 15981680155691354L, 15981680157526362L,
                15981680158837082L, 15981680160670894L, 15981680161981614L, 16064143534589098L,
                16146332029027502L, 16228795400848558L, 16311258766117210L, 16311258767952218L,
                16311258769262938L, 16311258771096746L, 16311258772407466L, 16393722145014954L,
                16475910632376666L, 16475910634211674L, 16475910635522394L, 16475910637356206L,
                16475910638666926L, 16558374012585130L, 16640837384144042L, 16723025877533870L,
                16805489242802522L, 16805489244637530L, 16805489245945858L, 16805489247783262L,
                16805489249093982L, 16887952621700266L, 16969862476201990L, 16970141109061982L,
                16970141110896990L, 17052325850121394L, 17052325851432114L, 17052604487959726L,
                17134789220368386L, 17135067856898394L, 17135067858209114L, 17135067860042930L,
                17299441090297858L, 17299719719487834L, 17299719721322842L, 17299719722633562L,
                17299719723422394L, 17299719724468578L, 17299719725779298L, 17299719726568122L,
                17382183098385578L, 17464646463654234L, 17464646465489242L, 17464646466799962L,
                17546556326806706L, 17546556328117426L, 17546834964645038L, 17629298334370138L,
                17629298336990378L, 17629298337515866L, 17711761708811434L, 17793950196173150L,
                17793950198008158L, 17793950199318878L, 17793950201153890L, 17793950202464610L,
                17793950204302010L, 17876413575070894L, 17958876940339546L, 17958876942174554L,
                17958876943485274L, 18040786803492018L, 18040786804802738L, 18041340319237290L,
                18123528812364974L, 18123528813675694L, 18123528815510702L, 18205992183923882L,
                18205992185496746L, 18205992187069610L, 18288455550765402L, 18288455552600410L,
                18288455553911130L, 18288455555746142L, 18288455557056862L, 18288455558893070L,
                18370644051756206L, 18453107417024858L, 18453107418859866L, 18453107420170586L,
                18535017280179730L, 18535017281488054L, 18617480655407458L, 18617759290885294L,
                18699944025654450L, 18700222662182062L, 18782686027450714L, 18782686029285722L,
                18782686030596442L, 18782686032431454L, 18782686033742174L, 18782686035579574L,
                18865149406348458L, 18947337893710170L, 18947337895545178L, 18947337896855898L,
                19029522634769582L, 19029522636080302L, 19029801272607914L, 19112264643119450L,
                19112264644168026L, 19112264644954458L, 19112264646265178L, 19194453138867374L,
                19276916504136026L, 19276916505971034L, 19276916507281754L, 19276916509119162L,
                19276916509905594L, 19276916510427486L, 19359379883033770L, 19441568370395486L,
                19441568372230494L, 19441568373541214L, 19523753112765618L, 19524031749293230L,
                19606495120852138L, 19606495121638570L, 19606495123997866L, 19688683613979822L,
                19688683615552686L, 19688683617125550L, 19771146980821338L, 19771146982656346L,
                19771146983967066L, 19771146985802082L, 19771146987112802L, 19771146988950202L,
                19853610359719082L, 19936073724987738L, 19936073726822746L, 19936073728133466L,
                20017983588140210L, 20017983589450930L, 20018262225978542L, 20100725595703642L,
                20100725597538650L, 20100725598325082L, 20100725598849370L, 20183188970144938L,
                20265377457506654L, 20265377459341662L, 20265377460652382L, 20265377462487394L,
                20265377463798114L, 20265377465634318L, 20347840836404398L, 20430304201673050L,
                20430304203508058L, 20430304204818778L, 20512214064825522L, 20512214066136242L,
                20594677440053250L, 20594956075533486L, 20677419446830250L, 20759882812098906L,
                20759882813933914L, 20759882815244634L, 20759882817079646L, 20759882817344182L,
                20759882818390366L, 20842071313089710L, 20924534678358362L, 20924534680193370L,
                20924534681504090L, 21006444541510834L, 21006444542821554L, 21006998057256106L,
                21089186550384990L, 21089186551695710L, 21089186553530718L, 21171649923515566L,
                21254113288784218L, 21254113290619226L, 21254113291929946L, 21254113293764958L,
                21254113295075678L, 21254113296913078L, 21336301789775022L, 21418765155043674L,
                21418765156878682L, 21418765158189402L, 21500949896103086L, 21500949897413806L,
                21501228533941418L, 21583691903142234L, 21583691906287962L, 21665880400200878L,
                21748343765469530L, 21748343767304538L, 21748343768615258L, 21748343769928378L,
                21748343771760990L, 21748343773074106L, 21830807144367274L, 21912995631728990L,
                21912995633563998L, 21912995634874718L, 21912995636708526L, 21995180374099122L,
                21995459010626734L, 22077922381137066L, 22077922382972074L, 22077922384282794L,
                22160110875051182L, 22160110876886190L, 22160110878196910L, 22242574242154842L,
                22242574243989850L, 22242574245300570L, 22242574246089402L, 22242574247135586L,
                22242574248446306L, 22242574249235130L, 22325037621052586L, 22407500986321242L,
                22407500988156250L, 22407500989466970L, 22489410849473714L, 22489410850784434L,
                22489689487312046L, 22572152855726426L, 22572152858872154L, 22572152859658586L,
                22654616231478442L, 22736804718840154L, 22736804720675162L, 22736804721985882L,
                22736804722512570L, 22736804723820898L, 22736804725131618L, 22736804725654706L,
                22901177955910838L, 22901731463006554L, 22901731464841562L, 22901731466152282L,
                22983641326159026L, 22983641327469746L, 23066104700076034L, 23066383335033178L,
                23066383336343898L, 23148846708163754L, 23231310073432410L, 23231310075267418L,
                23231310076578138L, 23231310078415542L, 23231310079723870L, 23231310081561270L,
                23313498574423214L, 23395961939691866L, 23395961941526874L, 23395961942837594L,
                23477871804155058L, 23478425318589610L, 23560613812765874L, 23560613813029210L,
                23560613815912794L, 23724987043020802L, 23725540550117722L, 23725540551952730L,
                23725540553263450L, 23725540555098462L, 23725540556409182L, 23725540557198014L,
                23725540558248982L, 23807729051108526L, 23890192416377178L, 23890192418212186L,
                23890192419522906L, 23972377157438990L, 23972377158749710L, 23972655795274922L,
                24137029025793202L, 24137307661534382L, 24219771026803034L, 24219771028638042L,
                24219771029948762L, 24219771031783774L, 24219771033094494L, 24219771033883318L,
                24219771034930702L, 24302234405700778L, 24384422893062490L, 24384422894897498L,
                24384422896208218L, 24466607634121902L, 24466607635432622L, 24548796131442690L,
                24549349644829866L, 24631538138219694L, 24714001972463962L, 24714001974298970L,
                24714001975609690L, 24714001978757818L, 24714001980590434L, 24714001981901154L,
                24796465354507434L, 24878928716630362L, 24878928718465370L, 24878928719776090L,
                24960838113166514L, 24960838114477234L, 24961117220766894L, 25043580589705562L,
                25043580591016282L, 25043580592850098L, 25207953353342978L, 25208232449149274L,
                25208232450984282L, 25208232452295002L, 25208232456229562L, 25208232457275746L,
                25208232458586466L, 25208232459375290L, 25290695831192746L, 25373159193315674L,
                25373159195150682L, 25373159196461402L, 25455068589851826L, 25455068591162546L,
                25455347697452206L, 25537811067177306L, 25537811069797550L, 25537811070323034L,
                25620274441618602L, 25702737803741530L, 25702737805576538L, 25702737806887258L,
                25702737811867998L, 25702737813178718L, 25702737815016118L, 25784926307878062L,
                25867389670000986L, 25867389671835994L, 25867389673146714L, 25949299066537138L,
                25949299067847858L, 25949853052044458L, 26032041545172142L, 26032041546482862L,
                26032041548317870L, 26114504916731050L, 26114504918303914L, 26114504919876778L,
                26196968280426842L, 26196968282261850L, 26196968283572570L, 26196968288553310L,
                26196968289864030L, 26196968291700238L, 26279156784563374L, 26361620146686298L,
                26361620148521306L, 26361620149832026L, 26443804421131790L, 26443804422440114L,
                26525992918452578L, 26526272023692462L, 26608456288699570L, 26608735394989230L,
                26691198757112154L, 26691198758947162L, 26691198760257882L, 26691198765238622L,
                26691198766549342L, 26691198768386742L, 26773662139155626L, 26855850623371610L,
                26855850625206618L, 26855850626517338L, 26938034897814702L, 26938034899125422L,
                26938314005415082L, 27020777375926618L, 27020777376975194L, 27020777377761626L,
                27020777379072346L, 27102965871674542L, 27185429233797466L, 27185429235632474L,
                27185429236943194L, 27185429241926330L, 27185429242712762L, 27185429243234654L,
                27267892615840938L, 27350081100056926L, 27350081101891934L, 27350081103202654L,
                27432265375810738L, 27432544482100398L, 27515007853659306L, 27515007854445738L,
                27515007856805034L, 27597471224693930L, 27597471226266794L, 27597471227839658L,
                27679659710482778L, 27679659712317786L, 27679659713628506L, 27679659718609250L,
                27679659719919970L, 27679659721757370L, 27762123092526250L, 27844586454649178L,
                27844586456484186L, 27844586457794906L, 27926495851185330L, 27926495852496050L,
                27926774958785710L, 28009238328510810L, 28009238330345818L, 28009238331132250L,
                28009238331656538L, 28091701702952106L, 28173890187168094L, 28173890189003102L,
                28173890190313822L, 28173890195294562L, 28173890196605282L, 28173890198441490L,
                28256353569211566L, 28338816931334490L, 28338816933169498L, 28338816934480218L,
                28420726327870642L, 28420726329181362L, 28503189703098370L, 28503468808340654L,
                28585932179637418L, 28668395541760346L, 28668395543595354L, 28668395544906074L,
                28668395549886814L, 28668395550151350L, 28668395551197534L, 28750584045896878L,
                28833047408019802L, 28833047409854810L, 28833047411165530L, 28915231682462894L,
                28915231683773614L, 28915510790063274L, 28997699283192158L, 28997699284502878L,
                28997699286337886L, 29080162656322734L, 29162626018445658L, 29162626020280666L,
                29162626021591386L, 29162626026572126L, 29162626027882846L, 29162626029720246L,
                29245089400489130L, 29327277884705114L, 29327277886540122L, 29327277887850842L,
                29409462159148206L, 29409462160458926L, 29409741266748586L, 29492204635949402L,
                29492204639095130L, 29574393133008046L, 29656856495130970L, 29656856496965978L,
                29656856498276698L, 29656856502735546L, 29656856504568158L, 29656856505881274L,
                29739319877174442L, 29821508361390430L, 29821508363225438L, 29821508364536158L,
                29821508369515694L, 29903692637144242L, 29903971743433902L, 29986435113944234L,
                29986435115779242L, 29986435117089962L, 30068898485765290L, 30068898487600298L,
                30068898488911018L, 30151086971816282L, 30151086973651290L, 30151086974962010L,
                30151086978896570L, 30151086979942754L, 30151086981253474L, 30151086982042298L,
                30233550353859754L, 30316013715982682L, 30316013717817690L, 30316013719128410L,
                30397923112518834L, 30397923113829554L, 30398202220119214L, 30480665588533594L,
                30480665591679322L, 30480665592465754L, 30563128964285610L, 30645317448501598L,
                30645317450336606L, 30645317451647326L, 30645317455319738L, 30645317456628066L,
                30645317457938786L, 30645317458461874L, 30809965096862902L, 30810244192667994L,
                30810244194503002L, 30810244195813722L, 30892153589204146L, 30892153590514866L,
                30974616963121154L, 30974896067840346L, 30974896069151066L, 31057359440970922L,
                31139822803093850L, 31139822804928858L, 31139822806239578L, 31139822811222710L,
                31139822812531038L, 31139822814368438L, 31222011307230382L, 31304474669353306L,
                31304474671188314L, 31304474672499034L, 31386384067200178L, 31386938051396778L,
                31469126545573042L, 31469126545836382L, 31469126548719966L, 31633774183972866L,
                31634053279779162L, 31634053281614170L, 31634053282924890L, 31634053287905630L,
                31634053289216350L, 31634053290005182L, 31634053291056150L, 31716516661822634L,
                31798705146038618L, 31798705147873626L, 31798705149184346L, 31880889420484110L,
                31880889421794830L, 31881168528082090L, 32045541288838322L, 32045820394341550L,
                32128283756464474L, 32128283758299482L, 32128283759610202L, 32128283764590942L,
                32128283765901662L, 32128283766690490L, 32128283767737870L, 32210747138507946L,
                32292935622723934L, 32292935624558942L, 32292935625869662L, 32375119897167026L,
                32375119898477746L, 32457583272394754L, 32457862377637034L, 32540050871026862L,
                32622514265917786L, 32622514267752794L, 32622514269063514L, 32622514275357370L,
                32622514277189986L, 32622514278500706L, 32704977651106986L, 32787441010084186L,
                32787441011919194L, 32787441013229914L, 32869350376211634L, 32869350377522354L,
                32869629517366446L, 32952092886305114L, 32952092887615834L, 32952092889449650L,
                33116465616388098L, 33116744742603102L, 33116744744438110L, 33116744745748830L,
                33116744752829114L, 33116744753875298L, 33116744755186018L, 33116744755974842L,
                33199208127792302L, 33281671486769498L, 33281671488604506L, 33281671489915226L,
                33363580852896946L, 33363580854207666L, 33363859994051758L, 33446323363776858L,
                33446323366397102L, 33446323366922586L, 33528786738218154L, 33611250097195354L,
                33611250099030362L, 33611250100341082L, 33611250108467550L, 33611250109778270L,
                33611250111615670L, 33693438604477614L, 33775901963454810L, 33775901965289818L,
                33775901966600538L, 33857811329582258L, 33857811330892978L, 33858365348644010L,
                33940553841771694L, 33940553843082414L, 33940553844917422L, 34023017213330606L,
                34023017214903470L, 34023017216476334L, 34105480573880666L, 34105480575715674L,
                34105480577026394L, 34105480585152862L, 34105480586463582L, 34105480588299790L,
                34187669081162926L, 34270132440140122L, 34270132441975130L, 34270132443285850L,
                34352316684176910L, 34352316685485238L, 34434505181497698L, 34435059198198954L,
                34516968551744690L, 34517247691588782L, 34599711050565978L, 34599711052400986L,
                34599711053711706L, 34599711061838174L, 34599711063148894L, 34599711064986298L,
                34682174435755178L, 34764362916825438L, 34764362918660446L, 34764362919971166L,
                34846547160859826L, 34846547162170546L, 34846826302014638L, 34929289672526170L,
                34929289673574746L, 34929289674361178L, 34929289675671898L, 35011478168274094L,
                35093941527251290L, 35093941529086298L, 35093941530397018L, 35093941538525882L,
                35093941539312314L, 35093941539834210L, 35176404912440490L, 35258868271417690L,
                35258868273252698L, 35258868274563418L, 35340777638855858L, 35341056778699950L,
                35423520150258858L, 35423520151045290L, 35423520153404586L, 35505983521293482L,
                35505983522866346L, 35505983524439210L, 35588172003936606L, 35588172005771614L,
                35588172007082334L, 35588172015208802L, 35588172016519522L, 35588172018356922L,
                35670635389125806L, 35753098748103002L, 35753098749938010L, 35753098751248730L,
                35835008114230450L, 35835008115541170L, 35835287255385262L, 35917750625110362L,
                35917750626945370L, 35917750627731802L, 35917750628256090L, 36000213999551658L,
                36082677358528858L, 36082677360363866L, 36082677361674586L, 36082677369801054L,
                36082677371111774L, 36082677372947982L, 36164865865811118L, 36247329224788314L,
                36247329226623322L, 36247329227934042L, 36329238590915762L, 36329238592226482L,
                36411701966143490L, 36411981104940206L, 36494444476236970L, 36576907835214170L,
                36576907837049178L, 36576907838359898L, 36576907846486366L, 36576907846750902L,
                36576907847797086L, 36659096342496430L, 36741559701473626L, 36741559703308634L,
                36741559704619354L, 36823743945508014L, 36823743946818734L, 36824023086662826L,
                36906486457698650L, 36906486459009370L, 36906486460844378L, 36988674952922286L,
                37071138311899482L, 37071138313734490L, 37071138315045210L, 37071138323171678L,
                37071138324482398L, 37071138326319798L, 37153601697088682L, 37235790178158938L,
                37235790179993946L, 37235790181304666L, 37317974422193326L, 37317974423504046L,
                37318253563348138L, 37400716932548954L, 37400716935694682L, 37482905429607598L,
                37565368788584794L, 37565368790419802L, 37565368791730522L, 37565368799335098L,
                37565368801167714L, 37565368802480826L, 37647832173773994L, 37730295532751194L,
                37730295534586202L, 37730295535896922L, 37730295544022186L, 37812204900189362L,
                37812484040033454L, 37894947410543786L, 37894947412378794L, 37894947413689514L,
                37977410782364842L, 37977410784199850L, 37977410785510570L, 38059599265270106L,
                38059599267105114L, 38059599268415834L, 38059599275496122L, 38059599276542306L,
                38059599277853026L, 38059599278641850L, 38142062650459306L, 38224526009436506L,
                38224526011271514L, 38224526012582234L, 38306435375563954L, 38306435376874674L,
                38306714516718766L, 38389177885133146L, 38389177888278874L, 38389177889065306L,
                38471641260885162L, 38554104619862362L, 38554104621697370L, 38554104623008090L,
                38554104629826230L, 38554104631134558L, 38554104632445278L, 38554104632968366L,
                38718477359908022L, 38718756486121818L, 38718756487956826L, 38718756489267546L,
                38800665852249266L, 38800665853559986L, 38883129226166274L, 38883408364439898L,
                38883408365750618L, 38965871737570474L, 39048335096547674L, 39048335098382682L,
                39048335099693402L, 39048335107822262L, 39048335109130590L, 39048335110967990L,
                39130523603829934L, 39212986962807130L, 39212986964642138L, 39212986965952858L,
                39295171208152238L, 39295450347996330L, 39377638842172594L, 39377638842435934L,
                39377638845319518L, 39542286447017986L, 39542565573232986L, 39542565575067994L,
                39542565576378714L, 39542565584505182L, 39542565585815902L, 39542565586604734L,
                39542565587655702L, 39625028958422186L, 39707217439492442L, 39707217441327450L,
                39707217442638170L, 39789401683529230L, 39789401684839950L, 39789680824681642L,
                39954053551883442L, 39954332690941102L, 40036796047559002L, 40036796050704730L,
                40036796061216866L, 40036796062527586L, 40036796063314018L, 40036796064362594L,
                40201447913820858L, 40201447916966586L, 40531026524244314L, 40531026527390042L,
                40695953268413110L, 40695953271558838L, 41025257000929630L, 41025257004075358L,
                41190183745098422L, 41190183748244150L, 41519762355526678L, 41519762358672406L,
                42013992832207194L, 42013992835352922L, 42178644698469050L, 42178644701614778L,
                42508223308892506L, 42508223312038234L, 42672875175154362L, 42672875178300090L,
                43002453785577818L, 43002453788723546L, 43167380529746614L, 43167380532892342L,
                43496684262267926L, 43496684265413654L, 43991187509222422L, 43991187515509082L,
                43991187517344094L, 43991187518657206L, 44320214224470018L, 44320491249336322L,
                44320491251698014L, 44485140968112130L, 44485417992194394L, 44485417994029406L,
                44485417996128950L, 44814444701157730L, 44814996607076698L, 44979648468879706L,
                44979648470714718L, 44979648473862842L, 45308950055749982L, 45309227085071530L,
                45391690456630442L, 45473878945565018L, 45473878947400034L, 45473878950550550L,
                45967832398692354L, 45968109422250334L, 45968109424085346L, 45968109427233466L,
                46297411009120606L, 46297688037919066L, 46462614776318298L, 46462614781301430L,
                46462614782612150L, 46627266644415162L, 46791918515651758L, 46874381886686382L,
                46956845253527898L, 46956845256676022L, 46956845258511030L, 47121497121624762L,
                47286423868410202L, 47451075730213210L, 47451075733363734L, 47451075735198742L,
                47615727598310074L, 47945306208209242L, 47945306211357370L, 47945306212143802L,
                48110232954210650L, 48274884819945818L, 48274884823091546L, 48439536683583838L,
                48439536687518394L, 48439536688566970L, 48604463429587638L, 48769115297941850L,
                48934042038700378L, 48934042041062070L, 48934042042634934L, 49098693905746266L,
                49263345770432858L, 49263345775936686L, 49345809147757738L, 49428272514861402L,
                49428272518009526L, 49428272518795958L, 49592924382958266L, 49757851128432986L,
                49922502991022426L, 49922502993384118L, 49922502995219126L, 50087154858332858L,
                50252081604594010L, 50416733467707738L, 50416733470069434L, 50416733470855866L,
                50581660212925110L, 50746312082327898L, 50910963944917338L, 50910963946757142L,
                50910963948067862L, 50910963949902870L, 51075890689872566L, 51405469299509594L,
                51405469301356590L, 51405469302667310L, 51570121166565074L
            };
        }//</editor-fold>

        public static long[] DragonBallZ_Tapion_s_theme() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
            return new long[]{
                216768L,
                317L, 622602031727894L, 724856546002478L, 827936091670170L, 827936903273790L, 937337163875894L, 1040416447137314L, 1142121206908470L, 1245200624125494L, 1348279638951462L,
                1348280447403382L, 1450259409012266L, 1450260217464178L, 1552513922762286L, 1552514731214202L, 1655593470789270L, 1655594282394466L, 1764994543257142L, 1868073826256418L, 1969778586027574L,
                2072858003506738L, 2175662138328618L, 2277916785509930L, 2277917593961842L, 2380171298997806L, 2380172108760438L, 2482975901222554L, 2482976781771622L, 2592651918706226L, 2695456323798562L,
                2797435961476658L, 2900240501048886L, 3003319513777706L, 3105574160959014L, 3105574973080946L, 3207553796539954L, 3207554608924026L, 3310633211659930L, 3310634159317862L, 3420034350974518L,
                3523113701344802L, 3624818461115958L, 3727897878332982L, 3830976891323942L, 3933231538505254L, 3933231542961426L, 4035211106715182L, 4035211179329070L, 4138290724996762L, 4138291536600382L,
                4247691797202486L, 4350771080463906L, 4452475840235062L, 4555555257452086L, 4658634272278054L, 4658635080729974L, 4760614042338858L, 4760614850790770L, 4862868556088878L, 4862869364540794L,
                4965948104115866L, 4965948915721058L, 5075349176583734L, 5178428459583010L, 5280133219354166L, 5383212636833330L, 5486016771655210L, 5588271418836522L, 5588272227288434L, 5690525932324398L,
                5690526742087030L, 5793330534549146L, 5793331415093730L, 5903006552032822L, 6006085835032098L, 6107790594803250L, 6107791405090178L, 6210594995701302L, 6210595943351686L, 6313674077373994L,
                6313674957129082L, 6415928794023462L, 6415929605096818L, 6517908431701554L, 6517909240939898L, 6620987980514970L, 6620988456578818L, 6730663930627634L, 6833468335982114L, 6935173095753002L,
                7038252777477962L, 7038252779312970L, 7038253720147786L, 8070969481495926L, 8173223995770234L, 8276302736131738L, 8276303547729378L, 8385703808337462L, 8385704617837950L, 8488783091598882L,
                8488783899002226L, 8590487851370038L, 8590488658511238L, 8693567268587058L, 8693568076252550L, 8796646283413030L, 8796647091864950L, 8898626053473834L, 8898626861925746L, 9000880567223854L,
                9000881375675770L, 9103960115250838L, 9103960926848482L, 9213361187718710L, 9213361996957054L, 9316440470717986L, 9316441278383474L, 9418145230489138L, 9418146037630342L, 9521224647968306L,
                9521225455373226L, 9624028782790186L, 9726283429971498L, 9726284238423410L, 9828537943459374L, 9828538753222006L, 9931342545684122L, 9931343426225638L, 10041018563167794L, 10041019374765438L,
                10143822968260130L, 10143823778022774L, 10245802605938226L, 10245803415438722L, 10348607145510454L, 10348607954748806L, 10451686158239274L, 10451686968526202L, 10553940805420582L, 10553941617542514L,
                10655920441001522L, 10655921253385594L, 10758999856121498L, 10759000803771874L, 10868400995436086L, 10868401874142594L, 10971480345806370L, 10971481155569010L, 11073185105577526L, 11073185914815878L,
                11176264522794550L, 11176265332296618L, 11279343535785510L, 11381323305059882L, 11381324114822518L, 11483577751176750L, 11483578629096826L, 11586657369458330L, 11586658181055970L, 11696058441664054L,
                11696059251164542L, 11799137724925474L, 11799138532328818L, 11900842484696630L, 11900843291837830L, 12003921901913654L, 12003922709579142L, 12107000916739622L, 12107001725191542L, 12208980686800426L,
                12208981495252338L, 12311235200550446L, 12311236009002362L, 12414314748577434L, 12414315560175074L, 12523715821045302L, 12523716630283646L, 12626795104044578L, 12626795911710066L, 12728499863815734L,
                12728500670956934L, 12831579281294898L, 12831580088699818L, 12934383416116778L, 13036638063298090L, 13036638871750002L, 13138892576785966L, 13138893386548598L, 13241697179010714L, 13241698059555298L,
                13351373196494390L, 13454452479493666L, 13556157239264818L, 13556158049551746L, 13658961640162870L, 13658962587813254L, 13762040721835562L, 13762041601590650L, 13864295438485030L, 13864296249558386L,
                13966275076163122L, 13966275885401466L, 14069354624976538L, 14069355101040386L, 14179030575089202L, 14281834980443682L, 14383539740214570L, 14486619421938758L, 14486619423773766L, 14486620364608582L
            };
        }//</editor-fold>

        public static long[] ElfenLied_Lilium() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
            return new long[]{
                449820L,
                1101444679786L, 142113745668130L, 279003407845406L, 279003411781582L,
                421664909428698L, 559653686874026L, 697642330097618L, 835906047582114L,
                835906051510262L, 1116556326602714L, 1254544970614742L, 1392808686782494L,
                1392808690718670L, 1535470188365786L, 1673733843718058L, 1811722486941650L,
                1949161570701270L, 1949161575155738L, 2091548263319486L, 2228162242545798L,
                2228162649401290L, 2371098621773886L, 2509087399479358L, 2647076040345654L,
                2785340164939678L, 2928001666779098L, 3065990442125274L, 3203979083778002L,
                3342242399127682L, 3342242805721030L, 3484903900448830L, 3622892678154302L,
                3761156196927542L, 3899145443614626L, 4042081823098838L, 4180070598445014L,
                4318059240359890L, 4456048080197582L, 4456048084125726L, 4598984462043094L,
                4736973238966222L, 4874961879304146L, 5013225597837214L, 5155887102560218L,
                5293875879217114L, 5431864521918418L, 5570127834908802L, 5570128242810786L,
                5712789335705662L, 5850778113935422L, 5988766754277434L, 6127030877036450L,
                6127030882013174L, 6407956035274710L, 6545944679286738L, 6683933517547550L,
                6683933521483726L, 6826869897037782L, 6964858674483114L, 7102847317706706L,
                7241111035191198L, 7241111039119350L, 7521761314211802L, 7659749958223826L,
                7798013674391582L, 7798013678327758L, 7940675175974874L, 8078663953420202L,
                8216652596643794L, 8354366558310358L, 8354366562764822L, 8496753250928574L,
                8633367230154882L, 8633367637010374L, 8776303609382970L, 8914292387088442L,
                9052281027954742L, 9190270274641826L, 9333206654388182L, 9471195429734358L,
                9609184071387090L, 9747447386736770L, 9747447793330118L, 9890108888057918L,
                10028097665763390L, 10166086306629690L, 10304350431223714L, 10447011932800986L,
                10585000708147162L, 10722989350062038L, 10861253067804662L, 10861253071734814L,
                11003914573580250L, 11142178221854634L, 11142178227357654L, 11280166869272530L,
                11418155707797494L, 11418155712251934L, 11561092089382870L, 11699080864731050L,
                11699080865253334L, 11837069507954642L, 11975058348580770L, 11975058351720478L,
                12117994460678106L, 12117994931488730L, 12255983237597146L, 12255983708145626L,
                12393971880298450L, 12393972350846930L, 12532235867262966L, 12532235601971230L,
                12532236072519710L, 12674897099622362L, 12674897570695130L, 12812886138161114L,
                12812885876017114L, 12812886346827738L, 12950874781386706L, 12950874789251026L,
                13089138503061494L, 13089138510399518L, 13231800010672090L, 13369788780253102L,
                13369788785231834L, 13508052306364370L, 13646041145151478L, 13646041149343774L,
                13788977526212566L, 13926966297366442L, 13926966302344394L, 14018775421813974L,
                14111134397760710L, 14202943784361890L, 14202943786190878L, 14345879896459222L,
                14345880367269846L, 14483868673378266L, 14483869143926746L, 14621857316079570L,
                14621857786628050L, 14760121031462902L, 14760121504370678L, 14760121306974238L,
                14902782805149658L, 15040771577087962L, 15040771581282266L, 15178760217167826L,
                15178760225032146L, 15317023938842614L, 15317023946180638L, 15459685446453210L,
                15597673947598766L, 15597674420506542L, 15597674221012954L, 15735937742145490L,
                15873926579888034L, 15873926585387038L, 16016862961993686L, 16154851738126294L,
                16292840379779026L, 16430829218826270L, 16430829224073166L, 16573765599365078L,
                16711754373926826L, 16849743020558290L, 16988006468820894L, 16988006940680094L,
                16988006741184502L, 17268657016539098L, 17406645660551122L, 17544909376718878L,
                17544909380655054L, 17687570878302170L, 17825559655747502L, 17963548298971094L,
                18101812016455586L, 18101812020383734L, 18382737173383126L, 18520725817395154L,
                18658714655655966L, 18658714659592142L, 18801651035146198L, 18939639812591530L,
                19077628455815122L, 19215342417481682L, 19215342421936150L, 19357454232192958L,
                19494343089326210L, 19494343496181702L, 19637004590647358L, 19774993368352830L,
                19912982009219130L, 20051246133813154L, 20193907635652570L, 20331896410998746L,
                20469885052651478L, 20608148368001154L, 20608148774594502L, 20751084747229242L,
                20889073524934714L, 21027062165801014L, 21165051412488098L, 21307987791972310L,
                21445976567318486L, 21583965209233362L, 21722228926973978L, 21722228930906138L,
                21864890428295130L, 21864890430916570L, 22002879206789034L, 22002879207839698L,
                22279131566704670L, 22421793066977242L, 22421793071433690L, 22559781844160430L,
                22559781848090586L, 22697770490791894L, 22836033803782274L, 22836034211684258L,
                22978695304579134L, 23116958960715834L, 23254947601057846L, 23392936845909922L,
                23392936850886646L, 23673862004148182L, 23811850648160210L, 23949839486421022L,
                23949839490357202L, 24092775865911258L, 24230764643356586L, 24368753286580178L,
                24507017004064670L, 24507017007992822L, 24787667283085274L, 24925655927097298L,
                25063919643265054L, 25063919647201230L, 25206581144848346L, 25344569922293678L,
                25482833443424210L, 25620272527183830L, 25620272531638298L, 25762659219802046L,
                25899273199028354L, 25899273605883846L, 26042209578256446L, 26180198355961918L,
                26318186996828214L, 26456451121422238L, 26599112623261658L, 26737101398607834L,
                26875090040260562L, 27013353355610242L, 27013353762203590L, 27156014856931390L,
                27294003634636862L, 27431992275503162L, 27570256400097186L, 27712917901674458L,
                27851181554927574L, 27989170196842450L, 28127159036676126L, 28127159040608286L,
                28270095415904214L, 28270095418525654L, 28408084194398122L, 28408084195448782L,
                28684061676406814L, 28826998054586326L, 28826998059042774L, 28964986831769514L,
                28964986835699674L, 29102975478400978L, 29241238791391362L, 29241239199293342L,
                29383900292188222L, 29521889070417982L, 29659877710759994L, 29798141833519010L,
                29798141838495734L, 30078792113850330L, 30217055635769298L, 30355044474030110L,
                30355044477966286L, 30497980853520342L, 30635969630965674L, 30773958274189266L
            };
        }//</editor-fold>

        public static long[] Zelda_GreatFairyFountain() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
            return new long[]{
                192008L,
                2125993838L, 4282647278L, 51404100600558L, 102806699115250L,
                102806402368242L, 154484116554478L, 154483615859438L, 205886760682226L,
                257563000570610L, 309239777592046L, 360642113176302L, 412045157073650L,
                463721256714990L, 463721296560878L, 515123964019442L, 515123430556402L,
                566800741565170L, 566800644047602L, 618478158480110L, 618478566114030L,
                669880192074482L, 669879860986610L, 721556936065774L, 721556705116910L,
                772959002690286L, 772958973592302L, 824361069320054L, 824363125048050L,
                876038055789294L, 927440452977394L, 927440190046962L, 979117937525486L,
                979117436830446L, 1030520581653234L, 1082196653769454L, 1133598788027122L,
                1185275699266290L, 1236953755288302L, 1288355111240430L, 1288355251749614L,
                1339757583663858L, 1339757285343986L, 1391434596090610L, 1391434364355314L,
                1443112214856430L, 1443112051540718L, 1494513711055602L, 1494513413522162L,
                1546190689927918L, 1546190526350062L, 1597592823661294L, 1597592626791150L,
                1648994789627762L, 1648995603841778L, 1700671876760306L, 1752348950528750L,
                1752348922479342L, 1803751590724334L, 1803751056737006L, 1855154235114226L,
                1906830340522738L, 1958507252024046L, 2009909453390574L, 2061312564396786L,
                2112988696543982L, 2112988804285166L, 2164391538852594L, 2164390972097266L,
                2216068283106030L, 2216067883598574L, 2267470452490994L, 2267470994866930L,
                2319147498210034L, 2319147133829874L, 2370824409973486L, 2370824313766638L,
                2422226510414578L, 2422226414469874L, 2473903522060146L, 2473904336536302L,
                2525305496666862L, 2576707692528370L, 2576707798434546L, 2628385277739758L,
                2628385079034606L, 2679787888313074L, 2731464195310322L, 2783141005886190L,
                2834543274361586L, 2886221061948142L, 2937622416851694L, 2937622625518318L,
                2989025393640178L, 2989024524632818L, 3040701936304882L, 3040701704569586L,
                3092379084784366L, 3092379693744878L, 3143781152195314L, 3143780955063026L,
                3195458770961134L, 3195457899856622L, 3246860234392302L, 3246860134777582L,
                3298262198523762L, 3298264288068338L, 3349939386581742L, 3401341548888818L,
                3401341487022834L, 3453019100545778L, 3453018432078578L, 3504696589026030L,
                3556097783235314L, 3607774660920046L, 3659176895841006L, 3710580141064946L,
                3762256240706290L, 3762256280552178L, 3813933691699950L, 3813933158236910L,
                3865335524229874L, 3865335292494578L, 3917013041808110L, 3917013348778734L,
                3968414773412590L, 3968414677205742L, 4019816941486834L, 4019816676983538L,
                4071493986681582L, 4071493689148142L, 4122896086861282L, 4122896901866226L,
                4174572839240434L, 4226250583311086L, 4226250086286062L, 4277653157708526L,
                4277652186202862L, 4329055231148786L, 4380731537883886L, 4432133537923826L,
                4483810549301998L, 4535212982141682L, 4535213996638962L, 4586890061677298L,
                4586890001646322L, 4638568017298158L, 4638566846038766L, 4689969446912754L,
                4689968945955570L, 4741646830535406L, 4741646969471726L, 4793048428446446L,
                4793048297636590L, 4844450529411826L, 4844450532557554L, 4896127709348594L,
                4896127275500274L, 4947804483748590L, 4947805534683886L, 4999208129528558L,
                4999206727582446L, 5050610299175666L, 5050608828023538L, 5102287347778286L,
                5102285806633710L, 5153689153569522L, 5205365090681586L, 5257042169692910L,
                5308444270396142L, 5359847516406514L, 5411524989944562L, 5411523554444018L,
                5463202039595758L, 5463200633455342L, 5514604207932146L, 5514602834821874L,
                5566281255224046L, 5566280724120302L, 5617683423298286L, 5617682051760878L,
                5669085591110386L, 5669084085093106L, 5720762636305138L, 5720761298584306L,
                5772438305243886L, 5772439321838318L, 5823841850884850L, 5823840279593714L,
                5875518899225326L, 5875517425976046L, 5926921068610286L, 5926919627342574L,
                5978322840060658L, 6029998776910578L, 6081675856184046L, 6133078191768306L,
                6184756046988014L, 6236158711300846L, 6236157408445166L, 6287560882520818L,
                6287559609811698L, 6339237928239858L, 6339236554867442L, 6390914973958894L,
                6390914544042734L, 6442317142033134L, 6442315737989870L, 6493719311942386L,
                6493717939356402L, 6545396357661422L, 6545394850857710L, 6596797350287222L,
                6596799171396338L, 6648474035028722L, 6700151209460462L, 6700151114040046L,
                6751553748992750L, 6751553315406574L, 6802956728664818L, 6854632834335470L,
                6906034666341106L, 6957711946941170L, 7009389835191022L, 7060791124034286L,
                7060791163880174L, 7112193562903282L, 7112193331430130L, 7163870508221170L,
                7163870310040306L, 7215547958690542L, 7215548366324462L, 7266949891621618L,
                7266949526979314L, 7318626769830638L, 7318626438218478L, 7370028870009582L,
                7370028606030574L, 7421430835976054L, 7421432891704050L, 7473107923108594L,
                7524785063985902L, 7524785002382062L, 7576187804844786L, 7576187136377586L,
                7627865259770606L, 7679266386871022L, 7730668521128690L, 7782345566585586L,
                7834023555498734L, 7885424710124270L, 7885424817079022L, 7936827417428722L,
                7936826984891122L, 7988504228528878L, 7988503896130286L, 8039906902278898L,
                8039907275834098L, 8091583578374898L, 8091583247287026L, 8143260322366190L,
                8143260628550382L, 8194662556762862L, 8194662527664878L, 8246064623392626L,
                8246065538269938L, 8297741609861870L, 8349143772168946L, 8349144046109426L,
                8400821424489202L, 8400820924056306L, 8452498745459438L, 8503900207842030L,
                8555302207881970L, 8606979421373166L, 8658382230389490L, 8710058698081010L,
                8710058570941170L, 8761736284078830L, 8761735448888046L, 8813138083316462L,
                8813137616700142L, 8864540286255858L, 8864540660859634L, 8916217164202734L,
                8916216900485870L, 8967619063841522L, 8967619068297970L, 9019296277070574L,
                9019296214680302L, 9070698343700342L, 9070699426611954L, 9122375397540594L,
                9174052605526766L, 9174052342334190L, 9225454843069170L, 9225454510146290L,
                9277132633539310L, 9328533827748590L, 9379936062407410L, 9431613007463154L,
                9483290962821870L, 9534692149953266L, 9534692325065458L, 9586369669104366L,
                9586369471185646L, 9637771770069742L, 9637771370562286L, 9689174074196722L,
                9689174448276210L, 9740850885296878L, 9740850855936750L, 9792253559046898L,
                9792252620833522L, 9843930034602738L, 9843929901433586L, 9895606910195566L,
                9895608932631278L, 9947009186792174L, 9998411416208114L, 9998411052352242L,
                10050088833647342L, 10050088433615598L, 10101491343557362L, 10153167583445746L,
                10204844326912750L, 10256246729605870L, 10307649807057650L, 10359325873144558L,
                10359326181425902L, 10410728714666738L, 10410728114094834L, 10462405257331442L,
                10462405193368306L, 10514082741355246L, 10514083249652462L, 10565484439405298L,
                10565484309644018L, 10617161653158638L, 10617161388655342L, 10668563753337582L,
                10668563455804142L, 10719965853517282L, 10719966668522226L, 10771642874331890L,
                10823320316412654L, 10823319852942062L, 10874723092136690L, 10874721885750002L,
                10926399942820590L, 10977801170322158L, 11029203472351986L, 11080880215294706L,
                11132557526041326L, 11132558406320878L, 11183959828333298L, 11183959566975730L,
                11235637716845294L, 11235636746912494L, 11287039280677614L, 11287038679057134L,
                11338441618621170L, 11338441925329650L, 11390118362874610L, 11390118097847026L,
                11441795207529198L, 11441795143566062L, 11493197543113458L, 11493197109265138L,
                11544874283959022L, 11544875133567726L, 11596277896184558L, 11596276192248558L,
                11647680065831666L, 11647678594679538L, 11699357114434290L, 11699355741061874L,
                11751033831686894L, 11802434756674290L, 11854112070566638L, 11905514204824302L,
                11956917383725810L, 12008594756600562L, 12008593388208882L, 12060271806251758L,
                12060270467220206L, 12111673974588146L, 12111672769250034L, 12163351021880046L,
                12163350524330734L, 12214753189954286L, 12214751751308014L, 12266155357766386L,
                12266153952412402L, 12317832402961138L, 12317831065240306L, 12369508105454318L,
                12369509122048750L, 12420911617540850L, 12420910113358578L, 12472588665881326L,
                12472587360404206L, 12523990835266286L, 12523989461107438L, 12575392640271090L,
                12627068644229870L, 12678470677824242L, 12730147824206578L, 12781825947861742L,
                12833228477956846L, 12833227074437870L, 12884630649176818L, 12884629208695538L,
                12936307694895854L, 12936306287969006L, 12987709862707954L, 12987709432791794L,
                13039386908689138L, 13039385538200306L, 13091063956505326L, 13091062550364910L,
                13142466124317422L, 13142464785285870L
            };
        }//</editor-fold>

        public static long[] MoonlightSonata() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
            return new long[]{
                1388480L,
                3734261362L, 2932100722L, 4645193358L, 115176878900878L, 230352031319694L, 345525368915598L, 460698307266194L,
                576147330958990L, 691321171871374L, 806494311548558L, 921668155344530L, 1037117679470222L, 1152291121137294L, 1267464964933262L,
                1382640108981878L, 1382639709474422L, 1382638403192466L, 1498087326746294L, 1607488734496398L, 1728435313444494L, 1843609057101458L,
                1959057577477774L, 2074231418390158L, 2189405061383822L, 2304579811149458L, 2420028831958670L, 2535202072299150L, 2650376520074894L,
                2765550354966310L, 2765550559438630L, 2765550763902610L, 2880997875254926L, 2996172524357262L, 3111345862215310L, 3226520209589902L,
                3341693952722578L, 3457142161418022L, 3457142365890342L, 3457143074458822L, 3572317019440782L, 3687491366815374L, 3802664301495954L,
                3918112822396558L, 4033286968444558L, 4148461104539430L, 4148460503705382L, 4148461815465614L, 4263633847584402L, 4379083576706702L,
                4494258222401166L, 4609430456108686L, 4724604803221138L, 4840054119732094L, 4840053418234750L, 4840053924693646L, 4955226661717646L,
                5070402518517390L, 5185575654524562L, 5301024276350606L, 5416196811523726L, 5531370647735922L, 5531371454877298L, 5531370449555058L,
                5531371758945934L, 5646544697034386L, 5761994224567950L, 5877168166930062L, 5992340601964174L, 6107514345096846L, 6222690299938450L,
                6338137512216206L, 6453312563971726L, 6568487109527182L, 6568488018644670L, 6683659141908114L, 6799107662284430L, 6827697180247278L,
                6914282907258482L, 6914282104049266L, 6914281702444658L, 6914283214472846L, 6914284425591502L, 7029455851357838L, 7144629896480402L,
                7260078514112142L, 7375251754976910L, 7490425699436174L, 7605599539824274L, 7721048665228942L, 7836222710351502L, 7951396450076302L,
                7951398164500158L, 8066570294920850L, 8182019620603534L, 8210608332735726L, 8297193355355942L, 8297193056511782L, 8297195071604366L,
                8297195779401510L, 8412366399342222L, 8527540343801490L, 8642988357977742L, 8758162202297998L, 8873336952063630L, 8988510886831910L,
                8988510386661158L, 8988511397217978L, 8988513010984742L, 9103684033316498L, 9219133359523470L, 9334306596193934L, 9449480540915342L,
                9564654989215378L, 9680104104666918L, 9680102799189798L, 9680102902204046L, 9680105522603814L, 9795279363245710L, 9910452100269710L,
                10025624431232658L, 10141073052272270L, 10256247903225486L, 10365651223316574L, 10371420832671526L, 10371420735153958L, 10371422147053198L,
                10486595084617362L, 10602042699286158L, 10688356575084922L, 10717219564295038L, 10832391994869390L, 10947566442907282L, 11063014755159666L,
                11063013248355954L, 11063013652039310L, 11063016271383834L, 11178188502468238L, 11405783887511594L, 11408534879078034L, 11523983802107534L,
                11639158250407566L, 11754331588003470L, 11869505331136142L, 11984680383415954L, 12100128196265614L, 12215301939398286L, 12330475985045134L,
                12445650627087990L, 12445650328243830L, 12445650631001746L, 12561099252303502L, 12676272593307278L, 12791446836610702L, 12906619472709266L,
                13022068698252942L, 13137242740229774L, 13252416080971406L, 13367590025954962L, 13483040355124878L, 13483042069548734L, 13598213393876622L,
                13713388043503246L, 13742249821865194L, 13828560269102710L, 13828559668268662L, 13828560374204050L, 13828562591955662L, 13944010102802062L,
                14059184450700942L, 14174356680476302L, 14289530524534418L, 14404979750340238L, 14520153188075150L, 14635326830806670L, 14750501682022030L,
                14865675522410130L, 14865677639487170L, 14981124345038478L, 15096298894263950L, 15125162484303082L, 15211471723041662L, 15211472531493758L,
                15211472533325454L, 15211473845107406L, 15326646075655826L, 15442094696957582L, 15557269539001214L, 15557268938167166L, 15557268940261006L,
                15672442381665934L, 15787615521343122L, 15903065039709990L, 15903065143519014L, 15903066555156110L, 16018238990452366L, 16133412632921742L,
                16248587580606098L, 16248588892377986L, 16364035900704398L, 16479209039857294L, 16594382673946406L, 16594383281071910L, 16594382477592206L,
                16594383588042534L, 16709555818595986L, 16825004338972302L, 16940178683201166L, 17055353232164494L, 17170526673307282L, 17285976395092862L,
                17285976902338190L, 17285977912120190L, 17401150142416526L, 17516324489266830L, 17631498025567886L, 17631498329920382L, 17631499037709182L,
                17746671772108434L, 17862121600845454L, 17977293425616678L, 17977293932070542L, 17977295445174054L, 18092466971084430L, 18207641418860178L,
                18323089433039742L, 18438262975366798L, 18553437825795726L, 18668611358435110L, 18668611361580838L, 18668611062728338L, 18668612777158522L,
                18784059684030094L, 18899234232469134L, 19014407067010702L, 19129581414385298L, 19245029934761654L, 19360204978938394L, 19360204780757530L,
                19360203777246862L, 19475377017063054L, 19590551565764242L, 19706001996121742L, 19821174933948046L, 19936348878669454L, 20051523323823762L,
                20166972347778702L, 20282146191574670L, 20397320737392270L, 20397321747174270L, 20512492366857870L, 20627666814633618L, 20714254259456006L,
                20743119764994762L, 20858290585994894L, 20973462517188238L, 21088638265725826L, 21088638369534850L, 21088637264072554L, 21198313348925070L,
                21319258018154126L, 21434437190030206L, 21434437595829118L, 21434435180955278L, 21549607414662802L, 21665057545651854L, 21780229267657598L,
                21780230982079358L, 21780230581257870L, 21780231288787838L, 21895402814965390L, 22010576960751250L, 22126025572635946L, 22126025173128490L,
                22126024672937614L, 22126026689362634L, 22241199322302094L, 22356372964771470L, 22471546805946002L, 22586995024594574L, 22702169371707022L,
                22817342105585294L, 22932517459592850L, 23047966382622350L, 23163141029103246L, 23163142844191614L, 23278313866528734L, 23393487609660358L,
                23480074249177138L, 23508665782778574L, 23624109468419726L, 23739283513542286L, 23854459362743166L, 23854459164562302L, 23854458260424334L,
                23969631500764818L, 24085080725784206L, 24200257783731070L, 24200258390856574L, 24200257183942286L, 24315428411016846L, 24430602556802706L,
                24546050767328126L, 24546052079096702L, 24546052080928398L, 24546053191111550L, 24661223710656142L, 24776397252462222L, 24891574207653670L,
                24891571996206886L, 24891572200670866L, 24891573613111078L, 25007020318656142L, 25122194162452110L, 25237368104289934L, 25352542250337938L,
                25467991274030734L, 25583164906809126L, 25583165312608038L, 25583164511225486L, 25583165823002406L, 25698337751041678L, 25813512702133906L,
                25928961018824334L, 26044135063946894L, 26159309008406158L, 26274483546629926L, 26274483046459174L, 26274482749179534L, 26274484161619750L,
                26389656391386770L, 26505105416128142L, 26620278552135310L, 26735452798322318L, 26850626240513682L, 26966075253466918L, 26966076263245606L,
                26966075059209870L, 26966078484916006L, 27081248802604686L, 27196423250904718L, 27311597594871442L, 27427045008213646L, 27542220362483342L,
                27657394197374758L, 27657395509143334L, 27657395209242254L, 27657397124998950L, 27772567342024338L, 27888017171023502L, 28003191616177806L,
                28118364252276366L, 28233540310664850L, 28348986810181414L, 28348988121949990L, 28348986915554958L, 28348989435291430L, 28464160457361038L,
                28579336415872654L, 28694507337287314L, 28809955857663630L, 28925131010868878L, 29040304041764646L, 29040303944238734L, 29040304350045990L,
                29155476781926030L, 29270652437661330L, 29386100955154062L, 29501274296157838L, 29616449045923470L, 29731622783030146L, 29731621578213010L,
                29731623695291266L, 29847070300440206L, 29962244647290510L, 30077418384656014L, 30077417783821966L, 30077418894267262L, 30192592433186450L,
                30308042060859022L, 30423215796407922L, 30423214187630194L, 30423214490930802L, 30423215500691086L, 30538388237190798L, 30653563591198354L,
                30769013217035918L, 30884184846501518L, 30999359898781326L, 31114534445123218L, 31229981355411086L, 31345156306503310L, 31460332663998094L,
                31460333371788990L, 31575503287092882L, 31690951706805902L, 31719541526758638L, 31806125542493810L, 31806125343264370L, 31806126048956018L,
                31806126051034810L, 31806128772097830L, 31921299996542606L, 32036474041665170L, 32151922558633614L, 32267095497508494L, 32382269844620942L,
                32497443986998926L, 32612617630516882L, 32728065546913422L, 32843240192607886L, 32843242712338110L, 32958413936789134L, 33073588082574994L,
                33102451471287534L, 33189036493907750L, 33189035591083814L, 33189036498880142L, 33189039521933094L, 33304210645190286L, 33419385092966030L,
                33534559537861506L, 33650006850799246L, 33765180895921806L, 33880356945662846L, 33880356445492094L, 33880357655807630L, 33880358162273150L,
                33995528480491154L, 34110977906837134L, 34226152748094334L, 34226153959199614L, 34226154666985102L, 34226155878093694L, 34341325290079886L,
                34456499133875858L, 34571949255441098L, 34571948653558474L, 34571949258586826L, 34571950571128462L, 34571951983573706L, 34687121495688846L,
                34802295439885966L, 34917470892197522L, 35032916895991438L, 35148092853454478L, 35263266393163406L, 35378439230326414L, 35493613174523538L,
                35609064202310526L, 35609062191141758L, 35609064104792958L, 35609065417344654L, 35609065621820286L, 35724235737925262L, 35839409782785678L,
                35954582812370726L, 35954584626145062L, 35954584325465894L, 35954585638012562L, 35954587151121102L, 36070032346711694L, 36185206291695246L,
                36300379427702414L, 36415552768444050L, 36531002195314318L, 36646176127718270L, 36646175526884222L, 36646177344325262L, 36646178454770558L,
                36761351087457934L, 36876525132580498L, 36991972635579262L, 36991973846684542L, 36991973046093454L, 36991976371131262L, 37107148701828750L,
                37222322043094670L, 37337494567538294L, 37337493463387766L, 37337494879998850L, 37452941886490254L, 37568116636255886L, 37683292997161854L,
                37798464321488530L, 37913914452477582L, 38029090209665918L, 38138487889725070L, 38259434370893454L, 38374609422652290L, 38484284296660622L,
                38605231381808782L, 38720405418036854L, 38720404716539510L, 38835579567212178L, 38951027886261902L, 39066204448494462L, 39181376376800910L,
                39296551227229842L, 39412001761661822L, 39521401555650190L, 39642346325542542L, 39757520873984898L, 39872969391998606L, 39988141927171726L,
                40103316167872114L, 40103315969691250L, 40103317683046030L, 40218490119915154L, 40328165097211534L, 40449115102122878L, 40564285620881038L,
                40679459062285970L, 40794912113824638L, 40910081423836814L, 41025255670548110L, 41140431729464190L, 41250105696716430L, 41371052178146958L,
                41486227219697266L, 41486226820189810L, 41601400262624910L, 41716573704029842L, 41832025345495934L, 41947197676193422L, 42062372929537678L,
                42177547781280642L, 42292993378485902L, 42408167423870606L, 42523342073500542L, 42638514102208146L, 42753963126163086L, 42869136660909682L,
                42869136261402226L, 42869138276484750L, 42984310711781006L, 43099486365943442L, 43214935289759374L, 43330108427339406L, 43445283681207950L,
                43560457422767762L, 43675905440614030L, 43791079081510542L, 43906253731399310L, 44021426969642638L, 44136601518868114L, 44252048115388018L,
                44252047816543858L, 44252049328572046L, 44367221764654734L, 44482396210333326L, 44597571666052754L, 44713018674906766L, 44828194835007118L,
                44943367066355342L, 45058542623000210L, 45173989631329934L, 45289164583732878L, 45404335305393806L, 45519509851735698L, 45634959267876466L,
                45634957962399346L, 45634959778776718L, 45750134328002190L, 45865308270888590L, 45980482417460882L, 46095929023661710L, 46211104982173326L,
                46326277616436878L, 46441453675611794L, 46556899979822734L, 46672075938334350L, 46787247465301646L, 46902420605240974L, 47017594334538670L,
                47017594539010990L, 47017594041403026L, 47133043971851918L, 47248218216728206L, 47363392967280270L, 47478564695574162L, 47594014928012942L,
                47709188770236046L, 47824362111501966L, 47939536155051666L, 48054987192796814L, 48170158216447630L, 48285332866336398L, 48400507614529170L,
                48515953817290382L, 48631127258433166L, 48746303012472462L, 48861476050962066L, 48976924468315790L, 49092100224714382L, 49207271952221838L,
                49322445695354514L, 49437895521994382L, 49553067553851022L, 49668241898604174L, 49783417554339470L, 49898590389143186L, 50014037701559950L,
                50129213858252430L, 50244386192098958L, 50359561040168594L, 50475008453248654L, 50590186220555546L, 50705357749094030L, 50820533100743966L,
                50935979709040270L, 51051153049519758L, 51166326885994102L, 51166326587149942L, 51166327796148006L, 51281500734752402L, 51396950362162830L,
                51512126017373838L, 51627297444202126L, 51742472293320338L, 51857923328709502L, 51973093850613390L, 52088267895735950L, 52203444555223938L,
                52318890056222350L, 52434063497365134L, 52549237837155954L, 52549237336985202L, 52549239351289638L, 52664411383924366L, 52779588146693778L,
                52895038780475022L, 53010210005976718L, 53125383546472078L, 53240559301038978L, 53356005305091726L, 53471178242918030L, 53586354902406014L,
                53701526230140562L, 53816975153170062L, 53932148788307750L, 53932147986147110L, 53932150604441382L, 54047321227789966L, 54162497889896082L,
                54277946711737998L, 54393119749179022L, 54508293994317454L, 54623466623870758L, 54623466627016486L, 54623466527396738L, 54738913940473486L,
                54854089799108238L, 54969262431012494L, 55084436476135058L, 55199885501400718L, 55315058128332582L, 55315058332804902L, 55315059643778702L,
                55430233085707918L, 55545407634409102L, 55660581474797202L, 55770256251291278L, 55891202229405326L, 56006376870127398L, 56006376873273126L,
                56006378083059342L, 56121551927379602L, 56236999542048398L, 56352173382698638L, 56467347629147790L, 56582520970413714L, 56697969886645874L,
                56697970089807474L, 56697969789128306L, 56697970897192590L, 56813142929311374L, 56928316572305038L, 57043492427269778L, 57158939941537422L,
                57274113080690318L, 57389287324255886L, 57504461369902738L, 57619909588289166L, 57735083227874958L, 57735085143625322L, 57850257474848398L,
                57965431117317778L, 57994290580685978L, 58080879730249330L, 58080879128366706L, 58080879532068466L, 58080881748739726L, 58080882959858378L,
                58196054486288014L, 58311228330083982L, 58426401365165710L, 58541574807357074L, 58657024233703054L, 58772197570774670L, 58887370610312846L,
                59002546769364626L, 59117995487659662L, 59117996799430334L, 59233168527197838L, 59348342974973582L, 59377206263022826L, 59463514998449958L,
                59463515504912166L, 59463515708065426L, 59463518429128486L, 59578964732282510L, 59694139280721550L, 59809314027603598L, 59924485858657938L,
                60039936593626766L, 60155109320435494L, 60155108820264742L, 60155109730158222L, 60155111746578214L, 60270283372889742L, 60385457015883410L,
                60500905331787406L, 60616078974518926L, 60731253221492366L, 60846427459036966L, 60846427260856102L, 60846426860553874L, 60846429178963750L,
                60961876689553038L, 61077050735199886L, 61192223569479310L, 61307397815928466L, 61422846538155662L, 61538020071581478L, 61538018766104358L,
                61538021385963150L, 61538022696948606L, 61653193618884238L, 61768367261615758L, 61857703083116554L, 61883543723971458L, 61998989421840014L,
                62114165681817230L, 62229338612846198L, 62229337710022262L, 62229336503092878L, 62229338518457630L, 62344513568114322L, 62459961283708558L,
                62575136132040334L, 62690308265084558L, 62805482109142674L, 62920932538975886L, 63036104370030222L, 63151278214088334L, 63266454168667794L,
                63266455178448578L, 63381900978292366L, 63497075325666958L, 63525937204692202L, 63612248557112946L, 63612249264901746L, 63612249266980494L,
                63612250981415630L, 63727421803202194L, 63842869920925326L, 63958045875242638L, 64073217706821262L, 64188391953270418L, 64303841376208526L,
                64419014415746702L, 64534188964185742L, 64649364012533390L, 64649366431600322L, 64764536246765202L, 64879985471784590L, 64908849263150314L,
                64995160213169958L, 64995159612335910L, 64995159916152462L, 64995161630582566L, 65104560821110414L, 65225507302540946L, 65340957128394382L,
                65450357832025742L, 65571302803506830L, 65686479759479682L, 65686479661962114L, 65686480972940946L, 65686481479406466L, 65801925970888334L,
                65917101626361486L, 66032276065227646L, 66032276873679742L, 66032275266209466L, 66032278188594046L, 66147449411995282L, 66262898435950222L,
                66378071867926310L, 66378070762727206L, 66378072777041702L, 66378073284281998L, 66378074596058918L, 66493244812822158L, 66608418656355986L,
                66723868080604814L, 66839040917767822L, 66954215465944718L, 67069388495524734L, 67069389000676222L, 67069388297343870L, 67069390616528530L,
                67069392733611814L, 67184836821911182L, 67300010867558030L, 67415184708208270L, 67530357646296718L, 67645531893270162L, 67760980904912678L,
                67760979196782374L, 67760981215282830L, 67760982929712934L, 67876153146738318L, 67991327091197582L, 68106501939005074L, 68221951365613198L,
                68337124102112910L, 68452298036094758L, 68452298441893670L, 68452298647406222L, 68452300361836326L, 68567471787345554L, 68682921012102798L,
                68798095155005070L, 68913268294944398L, 69028442943784594L, 69143891153281562L, 69143890753774106L, 69143891562202766L, 69143894081944266L,
                69259064902682254L, 69374238847403662L, 69489412587914898L, 69604861712270990L, 69720035455665806L, 69835209296840334L, 69950382536918674L,
                70065832164591246L, 70181007113062030L, 70181009733456766L, 70296179245844110L, 70411354599589518L, 70497940635125766L, 70526530558114510L,
                70641976760338062L, 70757149798827662L, 70872325446701950L, 70872325349184382L, 70872325451679374L, 70987498591356562L, 71102945601783438L,
                71218124874322814L, 71218123971498878L, 71218122663921294L, 71333293589005966L, 71448468741424786L, 71563916448633726L, 71563916451779454L,
                71563917762233998L, 71563919375733630L, 71679090096604814L, 71794264544380558L, 71909437573718554L, 71909438281507354L, 71909438183966354L,
                71909439495748302L, 72024886301951630L, 72140060850390670L, 72255234288912014L, 72370407830980242L, 72485857357989518L, 72601030695847566L,
                72716204137252494L, 72831379088344722L, 72946829015385742L, 72946830629147518L, 73062001349494414L, 73177175495280270L, 73263487860869130L,
                73292345883769550L, 73407523281438354L, 73522970795181710L, 73638147047035774L, 73638146446201726L, 73638146548696718L, 73753318178424462L,
                73868493330843282L, 73983945669350270L, 73983944464536446L, 73983944364918414L, 74099115793319566L, 74214290744411790L, 74329463875703682L,
                74329462972879746L, 74329463578691218L, 74329465796170626L, 74444911797601934L, 74560085842724494L, 74675259878680358L, 74675258875193126L,
                74675259482310286L, 74675260995413798L, 74790433326368402L, 74905881645418126L, 75021056191235726L, 75136229229987470L, 75251404181079698L,
                75366851986073382L, 75366851787892518L, 75366850987558542L, 75366854916581158L, 75482025838511758L, 75597199782971022L, 75712373221230226L,
                75827822044120718L, 75942995988579982L, 76058170931034830L, 76058170028210894L, 76058170332284558L, 76058173154015950L, 76173343472486030L,
                76288517215618706L, 76403968047842958L, 76519139577431694L, 76634314528523918L, 76749488268248722L, 76864936085030542L, 76980111539439246L,
                77095284670206846L, 77095283868046206L, 77095285178500750L, 77095286993589118L, 77210459526137490L, 77325908449429134L, 77441081579672446L,
                77441081784144766L, 77441082994198158L, 77441083903316862L, 77556255027103374L, 77671428871161490L, 77786878188458878L, 77786878090941310L,
                77786878293837454L, 77786880008262526L, 77902052541073038L, 78017225982215822L, 78132399716701058L, 78132399317193602L, 78132399621277330L,
                78132402644325250L, 78247847941375630L, 78363022087161486L, 78478195821908862L, 78478195523064702L, 78478196028212878L, 78478197943964542L,
                78593369872533138L, 78708818694899342L, 78823991523157798L, 78823992029620006L, 78823993441257102L, 78823994249717542L, 78939165776152206L,
                79054339720349326L, 79169514768959122L, 79284962585740942L, 79400136328611470L, 79515310968804222L, 79515310569296766L, 79515311981725326L,
                79515313293497214L, 79630483812779666L, 79745932433557134L, 79861107475878782L, 79861107378361214L, 79861108590249614L, 79861110002684798L,
                79976280320378510L, 80091454566565522L, 80206903682017062L, 80206902477203238L, 80206903889626766L, 80206905503393574L, 80322076324660878L,
                80437250168456846L, 80552424110032530L, 80667872228279950L, 80783047078708878L, 80898220812674854L, 80898220312504102L, 80898218603841166L,
                80898221728076670L, 81013393354393234L, 81128843183392398L, 81244017930012302L, 81359190264645262L, 81474365719053970L, 81589813426540146L,
                81589812824390346L, 81589814034433678L, 81589814137457946L, 81704987375175310L, 81932582860881962L, 81935336067827342L, 82050508301534866L,
                82165958029870734L, 82281131669456526L, 82396305111123598L, 82511479558899346L, 82626930589830846L, 82626928781035150L, 82742102021375630L,
                82857275764508302L, 82886140456076522L, 82972451210808950L, 82972450608921294L, 82972451115370130L, 83087898529498766L, 83203072171968142L,
                83318247018989198L, 83433419051894418L, 83548867974923918L, 83664043224598158L, 83779216062809742L, 83894389503952530L, 84009841641655998L,
                84009840839493262L, 84125012469745294L, 84240186816857742L, 84269049897288938L, 84355361054936694L, 84355362264726222L, 84355361261225618L,
                84470810588219022L, 84585982618502798L, 84701159684572814L, 84816331211277966L, 84931506969249426L, 85046954883548814L, 85162130842584718L,
                85277302772205198L, 85392478016900802L, 85392478428989074L, 85507925034927758L, 85623099279804046L, 85651962056410346L, 85738273514732238L,
                85738273517877966L, 85738274129184398L, 85853446563694226L, 85968894679058062L, 86084070334793358L, 86199241760310926L, 86314415503443602L,
                86429866034726542L, 86545038670562958L, 86660213215856270L, 86775386753470146L, 86775388569601682L, 86890834168907406L, 87006010024658574L,
                87034871698949354L, 87121182655265486L, 87121183462406862L, 87121183363827342L, 87121184070829710L, 87236358216615570L, 87351805326132878L,
                87466980882253454L, 87582153818244750L, 87697329072899726L, 87812500398016146L, 87927952342255246L, 88043123567232654L, 88158298711264958L,
                88158299827996302L, 88273472663324306L, 88388920779474574L, 88417508879500526L, 88504094410422990L, 88504095118211790L, 88504095427528334L,
                88619267459384974L, 88734441099495058L, 88849890928494222L, 88965064266614414L, 89080238009747086L, 89195413159806610L, 89310860572886670L,
                89426035722159758L, 89541208957783742L, 89541209666619022L, 89656382401283730L, 89771830618359438L, 89800418320712942L, 89887004456951054L,
                89887004358092582L, 89887004662171278L, 89887005469838618L, 90002178103576206L, 90229772481986606L, 90232801072252558L, 90347973706516110L,
                90463146843571854L, 90578323100673830L, 90693494427879058L, 90808943552497294L, 90924119007430286L, 91039291943159438L, 91154465181140626L,
                91269914302616446L, 91385088146933390L, 91500261688739470L, 91615437143410322L, 91730884453992078L, 91846058195551886L, 91961231735260814L,
                92076405881570962L, 92191855003829902L, 92307029248444046L, 92422202589185678L, 92537376632473234L, 92652825553938214L, 93344142483269414L,
                93344142485104422L, 93344141882435366L, 93344142587864870L, 93344144300189478L, 93344144100173606L, 94035459311947382L, 94035460018425462L,
                94035459415756406L, 94035458913226358L, 94035460927540854L, 94035460425535094L
            };
        }//</editor-fold>

        public static long[] Nocturne() {//<editor-fold defaultstate="collapsed" desc="Codificación de la melodia »">
            return new long[]{
                936764L,
                1486098742L, 1493176630L, 1494225206L, 1495535926L, 387304393017206L, 387304463276174L, 387304465106806L, 387304465893238L, 516497044148534L, 516496980185398L,
                516496980971830L, 904074858071926L, 904074928330350L, 904074929112922L, 904074930161526L, 1033267439734522L, 1033267444715258L, 1033267445501690L, 1291378096083258L, 1291378066723130L,
                1291378067509562L, 1291378068820282L, 2066533120741686L, 2066533127819574L, 2066533128868150L, 2066533130178870L, 2453836195432310L, 2453836232136846L, 2453836233967478L, 2453836234753910L,
                2583028813009206L, 2583028782600502L, 2583028783386934L, 2970606660487030L, 2970606630082158L, 2970606630864730L, 2970606631913334L, 3099799275704058L, 3099799649783546L, 3099799650569978L,
                3357909663618070L, 3357909869138966L, 3357909869925398L, 3357909871236118L, 4133064859191158L, 4133066075282930L, 4262257544398710L, 4391175385515898L, 4520368068101878L, 4649560547002230L,
                4649561561235710L, 4671827074875642L, 4694092184813818L, 4716357295800570L, 4737522894110954L, 4758688493469930L, 4778753198917494L, 4779854091780334L, 4801019691139310L, 4821085777821934L,
                4841426743460074L, 4861492830142702L, 4881833795780842L, 4900800370835678L, 4907945950971766L, 4920041824846046L, 4939283277807838L, 4958524731818206L, 4978590818500846L, 4998656906232046L,
                5018997870821614L, 5037138499602162L, 5039063958552814L, 5060229556863214L, 5081395156222190L, 5102560754532590L, 5124001231798286L, 5125925376098658L, 5145991463829682L, 5166331012056950L,
                5166332429474918L, 5295523797927798L, 5424716584060790L, 5553634254522102L, 5682826867640186L, 5682827880569826L, 5812019754174326L, 5941212573861750L, 6070404988012274L, 6199597668239222L,
                6199599019862322L, 6328790487664502L, 6457983374722934L, 6586901011367670L, 6716093523822458L, 6845286141921142L, 6909883396654014L, 6974478827652982L, 6974479805973746L, 7060241578198258L,
                7103671107323634L, 7146003484640498L, 7232863721752438L, 7232865507220450L, 7362056338802550L, 7491249058088822L, 7620441404606194L, 7749359174682490L, 7878551758178170L, 8007744443910006L,
                8136936924645106L, 8266129302620022L, 8266130854518258L, 8395322021644150L, 8524514506311542L, 8653707121788658L, 8782624688441210L, 8782625970593270L, 8911817239693178L, 9041010194122614L,
                9170202809599730L, 9299395220866934L, 9299396872117746L, 9428588006737782L, 9557780625098614L, 9686973240575730L, 9816165886199670L, 9816167740346106L, 9945083793901434L, 10074276580558710L,
                10074277858774310L, 10203469127878386L, 10312596869874030L, 10332661775075190L, 10337610759930226L, 10362899527631114L, 10386264048795914L, 10409353759686922L, 10432443470053646L, 10455808058851594L,
                10461854527391606L, 10478897769218314L, 10501162846388474L, 10523427956588794L, 10545693100867834L, 10567683333161214L, 10589948477440254L, 10591047314048886L, 10611114076012782L, 10632279708664046L,
                10653445340791022L, 10674610939887854L, 10696051449921770L, 10717217049018602L, 10720239793473266L, 10737283169517806L, 10757624134893802L, 10777690255393006L, 10797756342862062L, 10818097341268206L,
                10838163428737262L, 10849432475010934L, 10858504393588970L, 10879669992685802L, 10900835624812782L, 10922001223909614L, 10943166856036590L, 10964332455133422L, 10978350416529274L, 10986597598888186L,
                11008862709612794L, 11030852975460606L, 11053118086185214L, 11075383229939962L, 11097648374218886L, 11107543236478842L, 11107544045717370L, 11236735583782642L, 11236736594347894L, 11365927995049846L,
                11365929345358818L, 11495120713811830L, 11624313365989238L, 11753505645659890L, 11882698225223542L, 12011890776213366L, 12140808483374970L, 12140809324334770L, 12270000964372210L, 12399193377474422L,
                12399194996219378L, 12528386029127542L, 12657578781706102L, 12786771330074354L, 12915963876083574L, 12915965360079114L, 12939055104786698L, 12962419726352650L, 12984409959432446L, 13006675102925050L,
                13028940213911802L, 13045156729325430L, 13050105845776622L, 13071271445135598L, 13092437077000430L, 13113602676359406L, 13133943640948970L, 13154009762234606L, 13174074637027194L, 13174075848917230L,
                13195516359737578L, 13216681958047978L, 13237847557406954L, 13259837789438206L, 13282102900424958L, 13303267252766454L, 13304368043917402L, 13311514902528722L, 13341751472816674L, 13371988043104626L,
                13402224613130434L, 13432459966547830L, 13432461182639602L, 13561652651755382L, 13690845538551670L, 13820038053365490L, 13949230767146870L, 13949231813627642L, 14078423687235446L, 14207341696124794L,
                14207342943145462L, 14336534177384182L, 14465726723393398L, 14465728044598514L, 14551490086044914L, 14594919576373110L, 14637251656680706L, 14724112295659382L, 14724113007641842L, 14809875048563954L,
                14853304374003442L, 14895636753679614L, 14982497087784822L, 14982498843100090L, 15047094647129018L, 15111689772992374L, 15111690753671786L, 15154021850153594L, 15197452458263162L, 15240882492278646L,
                15240883033080426L, 15283214129562234L, 15326644771488374L, 15369799759300342L, 15369800434319982L, 15412406476079734L, 15455562172727930L, 15498992340699002L, 15498992881510866L, 15628185024857974L,
                15757377945470838L, 15886570359097074L, 16015763108530038L, 16144955589789558L, 16274148240394102L, 16403065875990262L, 16532258423310202L, 16532258764103158L, 16661451276552054L, 16790643827541878L,
                16919836409464562L, 17049029022582646L, 17049029769172590L, 17178221775161206L, 17307414393259894L, 17436606908073714L, 17436607751915382L, 17565524643284858L, 17565525926215946L, 17588890548568330L,
                17611979923390730L, 17634245034115322L, 17656510177870074L, 17678775288594682L, 17694717530343290L, 17699940920721642L, 17721106519818474L, 17742272151945454L, 17763437751042286L, 17783503871541486L,
                17803844836917482L, 17823910114625398L, 17823910957416686L, 17845076556513518L, 17866242188640494L, 17887407787737326L, 17909672931492094L, 17931938042216698L, 17953102730102514L, 17953103640527322L,
                17954203152416842L, 17985539368026582L, 18017700083401174L, 18049860832592318L, 18082295309928310L, 18082296392322810L, 18211488129877878L, 18340680882718582L, 18340681792358262L, 18469873430824690L,
                18469874307434358L, 18598791065110394L, 18598791977371382L, 18727983750580090L, 18857176570529654L, 18857177109503474L, 18986368782829298L, 19115561295284086L, 19244753980491638L, 19373946666223478L,
                19373946903203578L, 19503138978924274L, 19632331593877366L, 19632332335225826L, 19761249266960250L, 19890441747957626L, 20019634330404594L, 20148826811926390L, 20278019462530934L, 20407211977344886L,
                20536404525975282L, 20665597141714806L, 20665597415132922L, 20794514915460986L, 20923707668301690L, 20923707904492478L, 20988304313811902L, 21052900149298930L, 21052900655760318L, 21117496997970878L,
                21182092896634742L, 21182093440845042L, 21267855314519282L, 21311285581842294L, 21353617187669250L, 21440478368499574L, 21440478773513714L, 21569670882526962L, 21698863495907190L, 21698864275785590L,
                21828056281778038L, 21828056690197434L, 21892378120160190L, 21956974223820666L, 21956974360659834L, 22086166604154610L, 22086166842181498L, 22215359116609398L, 22215359560156402L, 22301121366721778L,
                22344551801816950L, 22386883004990722L, 22473744588474230L, 22473744523726322L, 22602937102501618L, 22732129581664118L, 22732129757040302L, 22732129757564590L, 22861322333980534L, 22990240276809594L,
                22990239910333190L, 22990239910857478L, 23119432823867126L, 23184029136716734L, 23184029137241006L, 23248625101703030L, 23248625444589306L, 23248625445375666L, 23377817786910582L, 23507010775418742L,
                23507011047001438L, 23507011049360734L, 23636203289183986L, 23742031523217750L, 23742031525577046L, 23765395600312182L, 23765396245449226L, 23765396247808522L, 23894588319074166L, 23959185035363258L,
                23959185037460410L, 24023781106255734L, 24023781477976878L, 24023781480336174L, 24152698842515190L, 24217295390770110L, 24217295393129406L, 24281891053242230L, 24281891496795106L, 24281891498892258L,
                24411083704895350L, 24540276759725942L, 24669469307832050L, 24798660947085174L, 24798661556045686L, 24927853598738294L, 24927854474822586L, 24992450783478642L, 25057046183544694L, 25057047192536918L,
                25185963854006006L, 25185964998526842L, 25315156500678522L, 25315157581497586L, 25400919623206130L, 25444349118777206L, 25486681462539522L, 25573541838325622L, 25573542947982834L, 25702734385907442L,
                25831926865069942L, 25831928483809142L, 25961119550277494L, 25961120864666554L, 26025717105165242L, 26090312269825910L, 26090313480144758L, 26219230107272950L, 26219231015339898L, 26348422586435450L,
                26348423835026674L, 26434185541190898L, 26477615271642998L, 26519947346969858L, 26606807890003830L, 26606808664116722L, 26736000404817650L, 26865193052014454L, 26865193963753138L, 26865193964277426L,
                26994385804330870L, 27123578456508278L, 27123579196279554L, 27123579196803842L, 27252771071723250L, 27317093477647294L, 27317093478171566L, 27381688774690682L, 27381689718148862L, 27381689719197362L,
                27510881525958522L, 27640074379462518L, 27640075354377730L, 27640075356474882L, 27769266893752050L, 27886365724115122L, 27886365726212274L, 27898459439761270L, 27898460452162058L, 27898460454521354L,
                28027651990751094L, 28092249308922810L, 28092249311282106L, 28156844810700662L, 28156845718244146L, 28156845720603442L, 28286037425915634L, 28350634710270906L, 28350634712368058L, 28414954927556474L,
                28414956038790118L, 28414956041149414L, 28544147645269882L, 28673340163229558L, 28802532610410226L, 28931726398195574L, 28931727110177062L, 28957840511861034L, 28983129278775594L, 29008418046738726L,
                29032607302025498L, 29056796558360858L, 29060919049586550L, 29080161179926794L, 29103250924634378L, 29127440179921178L, 29152728947884326L, 29178017714798826L, 29190112004015990L, 29190112308889462L,
                29319304484488946L, 29319304925415286L, 29448496762324854L, 29448497576023662L, 29577414502516602L, 29706606819149690L, 29835798931048178L, 29835799909107442L, 29964991477319542L, 29964992253791026L,
                30094184128710518L, 30158781113697198L, 30223376982476662L, 30223377321166022L, 30352569496504050L, 30352569836766418L, 30481762009220982L, 30481762452768630L, 30610679782967162L, 30610680561013990L,
                30739872670025594L, 30869065218131698L, 30998257631496054L, 30998258407965938L, 31084020349011186L, 31127450214991734L, 31169782356116738L, 31256642899937142L, 31256643774449526L, 31385835515414258L,
                31385836289525594L, 31515028163921782L, 31515028939347566L, 31644220781496182L, 31773138520901498L, 31902331136378610L, 31902331439941362L, 32031523616851802L, 32031524156869058L, 32160716503385946L,
                32225313486537970L, 32289909254653786L, 32289909490584370L, 32419102072768346L, 32483698851709882L, 32548294684050670L, 32548295160104690L, 32634056894842094L, 32719818836673790L, 32742084356080570L,
                32806405546186354L, 32806405515777650L, 33193983226152822L, 33193983398381298L, 33323175839533314L, 33323176015182526L, 33581561442731246L, 33667323384300782L, 33753085561799934L, 33839946711436786L,
                34098057128707314L, 34183819071063282L, 34269581214221570L, 34356443338511982L, 34744020313835382L, 34873212791425282L, 35131322947863794L, 35217084922987762L, 35302846663492866L, 35389707980901874L,
                35389708320378546L, 35648093243311346L, 35648093586995902L, 35733855219221746L, 35819617093944574L, 35906479016908398L, 36293781416314742L, 36422973929033202L, 36681359398012146L, 36767121406690546L,
                36852883315754238L, 36939744633163250L, 37197854614226162L, 37283616724354290L, 37369653611201790L, 37456240186496626L, 37843817732245366L, 37973010209835266L, 38231120735372530L, 38317157420631278L,
                38402919396017406L, 38489505801965042L, 38489505936969394L, 38747890762384626L, 38747891472022206L, 38833652872512754L, 38919414747235582L, 39006276301100654L, 39393579036051322L, 39522771480086790L,
                39781156917085426L, 39866918690882802L, 39952680699823362L, 40039541983677938L, 40297927246087406L, 40383689221997806L, 40469451264492798L, 40556037403580018L, 40943615284872946L, 41072808098008562L,
                41331193065243886L, 41416955040367854L, 41502717082862846L, 41589303421701618L, 41847688848740018L, 41933450425140450L, 42019212535792882L, 42106073886229730L, 42191835827799266L, 42277597701997810L,
                42364459894703342L, 42450221632849134L, 42535983440200958L, 42622569713239282L, 42708606197433582L, 42794367870567678L, 42880954279149250L, 44043413880835834L, 44301798202410870L, 44301799787601394L,
                44430991055390582L, 44560183975741302L, 44689376591218418L, 44818294460647290L, 44818295105782014L, 44840560216768766L, 44862825393815802L, 44883991026729198L, 44905156625039598L, 44926322257953006L,
                44946663256097002L, 44947487179671418L, 44966729343828206L, 44987070341972202L, 45006036951630046L, 45025278404591838L, 45044519892156638L, 45063486467211490L, 45076679998834550L, 45083827466404078L,
                45103893553086702L, 45124234518724846L, 45145400150589678L, 45166565783503086L, 45187731381813322L, 45193778795905614L, 45205872480356082L, 45234185848750670L, 45274592901595578L, 45304829471621562L,
                45335064892147574L, 45335066041130482L, 45464257543800694L, 45593450497705846L, 45722643079628530L, 45851835390756726L, 45851836303019506L, 45980753198057338L, 46109945984190330L, 46109947264765618L,
                46239138499004146L, 46368331984537462L, 46368332768871666L, 46454094709654770L, 46497524938180470L, 46539856481617150L, 46626717590357878L, 46626717765469422L, 46712479705728242L, 46755909467375346L,
                46798241578616062L, 46885101979830134L, 46885103668036538L, 46949699304293306L, 47014019720021882L, 47014020633592430L, 47056626607981174L, 47099782338183802L, 47143212338644858L, 47143212946555502L,
                47185818988053110L, 47228974617854586L, 47272404416464626L, 47272405259256426L, 47314736456663674L, 47358167031218810L, 47401596726282102L, 47401597672889314L, 47530789411489654L, 47659982063404918L,
                47789174611773170L, 47918367560435574L, 47918368778624498L, 48047560312751990L, 48176478220978042L, 48305670903564018L, 48434863652472694L, 48434864264846834L, 48564056438605686L, 48693249057490806L,
                48822441203205874L, 48951633614210934L, 48951634023947762L, 49080826366789494L, 49209744241985402L, 49338936790353654L, 49468129671382902L, 49468129812676890L, 49492319102566682L, 49516508391407898L,
                49540972559204630L, 49564062302863626L, 49587152081125642L, 49597322255927158L, 49610516736246026L, 49632781880787194L, 49654772146372862L, 49677037290914042L, 49698202889224430L, 49719368522137838L,
                49726515243386742L, 49740534154002670L, 49761699786916078L, 49783964930408702L, 49806230041395450L, 49828495184888058L, 49851584963150090L, 49855707657537266L, 49874949651824906L, 49898039396532446L,
                49914257292919298L, 49949441665270278L, 49984900269606774L, 49984900815129054L, 50114093055215478L, 50243010997520250L, 50243010564458802L, 50372203309958902L, 50501395890046838L, 50501396971914482L,
                50587158912697586L, 50630588743026550L, 50672920718738690L, 50759781697455990L, 50759782237734130L, 50845544279180530L, 50888973909231346L, 50931306119300350L, 51018166589982582L, 51018167639081726L,
                51069569875313390L, 51122071522247406L, 51147359510071158L, 51173473691108078L, 51224875960632050L, 51276552330020726L, 51276553040953962L, 51318884205331066L, 51362314948444790L, 51405469731784438L,
                51405470712988270L, 51448076889490038L, 51491232754958970L, 51534662210422650L, 51534663262412278L, 51663854963263350L, 51793047984539510L, 51922240499353330L, 52051432709031798L, 52051433928527610L,
                52180625394501494L, 52309818516703094L, 52309818623659770L, 52438736287827702L, 52567928329996154L, 52567928843800050L, 52697121149421430L, 52826313868707702L, 52826313773551282L, 52955505980081906L,
                53084698460555126L, 53084698972262066L, 53213891145500534L, 53343083864786806L, 53343083733716654L, 53472276177225458L, 53601193779529594L, 53601194055044862L, 53730386530797434L, 53859579216529270L,
                53859579657193334L, 53988771495937778L, 53988772542416758L, 54117963941545846L, 54117964956831482L, 54247156760708982L, 54376349413148534L, 54376349751839698L, 54505542027577074L, 54609444035887118L,
                54609446150340974L, 54634459931084666L, 54634460073689358L, 54657824729071882L, 54680914507071754L, 54704279196008714L, 54727368974008586L, 54750733662945546L, 54763652683401082L, 54773823440945418L,
                54796913218421006L, 54819178362700030L, 54841443506454778L, 54863708684288250L, 54885973828043002L, 54892845436503926L, 54907964127969534L, 54930229238169850L, 54952494348894458L, 54973659947466990L,
                54994825546563822L, 55015991145136366L, 55022037681833714L, 55037156744233198L, 55058322342805742L, 55079487941902574L, 55100653540475118L, 55122094017478890L, 55142160104423662L, 55151230228367222L,
                55162226191892718L, 55182567123189998L, 55202633177104622L, 55222974141956330L, 55243040195870958L, 55263106249261294L, 55280422980683638L, 55283447181082862L, 55304612746100974L, 55325778311643374L,
                55346943876661486L, 55368109475758318L, 55389275040776430L, 55409615699969910L, 55410440606318830L, 55431881049243882L, 55453046614786282L, 55475036813525246L, 55497301890695422L, 55519566967341306L,
                55538808012670706L, 55541832044511482L, 55563822276804862L, 55586087387529470L, 55608352497729786L, 55612476068463402L, 55668000526960502L, 55668001405672418L, 55796918401369978L, 55926111153948538L,
                56055303433881330L, 56184495979890550L, 56184496624239006L, 56212809149579678L, 56241121608073642L, 56270258767397278L, 56298571292737962L, 56313688631019382L, 56327708384952734L, 56356020910555566L,
                56385432847122842L, 56413470292443566L, 56442881484523382L, 56442882261516702L, 56471194718962074L, 56499232063881646L, 56528643999400350L, 56556956322628010L, 56572074033153778L, 56586093313393054L,
                56614405703729578L, 56643542727786910L, 56671855017460110L, 56701266444945270L, 56701266986802526L, 56830184151582586L, 56959376971270010L, 57088569486083826L, 57217762032093046L, 57217762708422862L,
                57231781482201314L, 57247174746177742L, 57261193486401758L, 57276311737991390L, 57291430090506446L, 57305448897839330L, 57320842161553630L, 57335960077861070L, 57346954582558582L, 57349979254292702L,
                57365097573253326L, 57379116380324066L, 57394509577191646L, 57409627862597838L, 57423646703223006L, 57438765089292510L, 57453883408253134L, 57467902148477154L, 57476147570280310L, 57483295210078414L,
                57497313848590558L, 57512432099393758L, 57527550451122382L, 57541569257406690L, 57556962151235806L, 57572080603627726L, 57586099242139870L, 57601217492943054L, 57605340085356274L, 57615236567662818L,
                57630629461754078L, 57645747578339534L, 57659766317514974L, 57674884635689182L, 57690002819383506L, 57704296537129182L, 57719414720823518L, 57734532497147766L, 57734533005450210L, 57863725182355318L,
                57992643090581370L, 58121835672504050L, 58251028017186678L, 58251028257309350L, 58297482657661622L, 58345036569641634L, 58380220634761078L, 58391216226304694L, 58438770238685862L, 58485224672592562L,
                58509413656037238L, 58532503604953766L, 58578957803193014L, 58626511647015590L, 58638606204667634L, 58672965945655986L, 58720244810908342L, 58767798515795830L, 58767798554336226L, 58896991133894518L,
                59025909142783866L, 59155101758260982L, 59284294069389174L, 59284294275957310L, 59323601917837890L, 59363184404070986L, 59403316612563522L, 59413486787626870L, 59442899132088894L, 59482206807523918L,
                59522613457715642L, 59542679641130870L, 59561920830112186L, 59602327814799802L, 59641635321676218L, 59671872122652402L, 59680942794736058L, 59721349745869242L, 59760657151820218L, 59801064198899574L,
                59801064673669010L, 59930256951215990L, 60059174825887610L, 60188367206483702L, 60317559718938486L, 60446752370067318L, 60575945089353590L, 60705137503766258L, 60834330116884342L, 60963522835646326L,
                61092715386898294L, 61221632990250742L, 61350825603368826L, 61480018220943222L, 61609210940229494L, 61738403321087730L, 61867595900651382L, 61867596241180270L, 61996788485195638L, 62125981238036342L,
                62254898975344506L, 62254899280480122L, 62384091657406330L, 62384091897792378L, 62513284239329142L, 62513284514842486L, 62642476753880950L, 62642477132416886L, 62771669402388342L, 62771669883946870L,
                62900862016836530L, 62900862334555058L
            };
        }//</editor-fold>

    }//</editor-fold>

}
