package Interface;

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/*package Interface*/

import java.awt.Image;
import java.time.LocalDate;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;

import javax.swing.ImageIcon;

import javax.swing.ImageIcon;

import javax.swing.ImageIcon;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author GeovannaOliviera
 */
public class Signos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Signos.class.getName());
 Clip musica;
    /**
     * Creates new form Signos
     */
    public Signos() {
        initComponents();
      RedimensionarImagens();  
      PreencherPrevisao();
      PreencherMensagem();
      CorrigirAreaTexto();
    }
 

public void RedimensionarImagens() {

    
    // Áries
    ImageIcon aries = (ImageIcon) imgSignoAries.getIcon();
    Image imgAries = aries.getImage().getScaledInstance(
            300, 400, Image.SCALE_SMOOTH);
    imgSignoAries.setIcon(new ImageIcon(imgAries));

    // Touro
    ImageIcon touro = (ImageIcon) imgSignoTouro.getIcon();
    Image imgTouro = touro.getImage().getScaledInstance(
            400, 400, Image.SCALE_SMOOTH);
    imgSignoTouro.setIcon(new ImageIcon(imgTouro));

    // Gêmeos
    ImageIcon gemeos = (ImageIcon) imgSignoGemeos.getIcon();
    Image imgGemeos = gemeos.getImage().getScaledInstance(
            300, 400, Image.SCALE_SMOOTH);
    imgSignoGemeos.setIcon(new ImageIcon(imgGemeos));

    // Câncer
    ImageIcon cancer = (ImageIcon) imgSignoCancer.getIcon();
    Image imgCancer = cancer.getImage().getScaledInstance(
            300, 400, Image.SCALE_SMOOTH);
    imgSignoCancer.setIcon(new ImageIcon(imgCancer));

    // Leão
    ImageIcon leao = (ImageIcon) imgSignoLeao.getIcon();
    Image imgLeao = leao.getImage().getScaledInstance(
            300, 400, Image.SCALE_SMOOTH);
    imgSignoLeao.setIcon(new ImageIcon(imgLeao));

    // Virgem
    ImageIcon virgem = (ImageIcon) imgSignoVirgem.getIcon();
    Image imgVirgem = virgem.getImage().getScaledInstance(
            300, 400, Image.SCALE_SMOOTH);
    imgSignoVirgem.setIcon(new ImageIcon(imgVirgem));

    // Libra
    ImageIcon libra = (ImageIcon) imgSignoLibra.getIcon();
    Image imgLibra = libra.getImage().getScaledInstance(
           400, 400, Image.SCALE_SMOOTH);
    imgSignoLibra.setIcon(new ImageIcon(imgLibra));

    // Escorpião
    ImageIcon escorpiao = (ImageIcon) imgSignoEscorpiao.getIcon();
    Image imgEscorpiao = escorpiao.getImage().getScaledInstance(
            300, 400, Image.SCALE_SMOOTH);
    imgSignoEscorpiao.setIcon(new ImageIcon(imgEscorpiao));

    // Sagitário
    ImageIcon sagitario = (ImageIcon) imgSignoSagitario.getIcon();
    Image imgSagitario = sagitario.getImage().getScaledInstance(
            300, 400, Image.SCALE_SMOOTH);
    imgSignoSagitario.setIcon(new ImageIcon(imgSagitario));

    // Capricórnio
    ImageIcon capricornio = (ImageIcon) imgSignoCapricornio.getIcon();
    Image imgCapricornio = capricornio.getImage().getScaledInstance(
            300, 400, Image.SCALE_SMOOTH);
    imgSignoCapricornio.setIcon(new ImageIcon(imgCapricornio));

    // Aquário
    ImageIcon aquario = (ImageIcon) imgSignoAquario.getIcon();
    Image imgAquario = aquario.getImage().getScaledInstance(
            300, 400, Image.SCALE_SMOOTH);
    imgSignoAquario.setIcon(new ImageIcon(imgAquario));

    // Peixes
    ImageIcon peixes = (ImageIcon) imgSignoPeixes.getIcon();
    Image imgPeixes = peixes.getImage().getScaledInstance(
            400, 400, Image.SCALE_SMOOTH);
    imgSignoPeixes.setIcon(new ImageIcon(imgPeixes));
}
public void PreencherPrevisao(){
int diaSemana = LocalDate.now().getDayOfWeek().getValue();



switch (diaSemana) {

    case 1: // Segunda-feira

        txPrevisaoAries.setText("Hoje é um bom dia para começar novos projetos e confiar mais em suas decisões.");
        txPrevisaoTouro.setText("Mantenha a calma e organize suas tarefas. A paciência ajudará você a alcançar seus objetivos.");
        txPrevisaoGemeos.setText("Sua comunicação estará favorecida. Aproveite para conversar e trocar novas ideias.");
        txPrevisaoCancer.setText("Valorize as pessoas próximas e reserve um tempo para cuidar dos seus sentimentos.");
        txPrevisaoLeao.setText("Sua confiança estará em alta. Use sua criatividade para enfrentar os desafios do dia.");
        txPrevisaoVirgem.setText("Organização será sua aliada. Concentre-se nas tarefas mais importantes.");
        txPrevisaoLibra.setText("Procure manter o equilíbrio e evite discussões desnecessárias.");
        txPrevisaoEscorpiao.setText("Confie na sua intuição, mas pense bem antes de tomar decisões importantes.");
        txPrevisaoSagitario.setText("Um dia favorável para aprender algo novo e planejar seus próximos passos.");
        txPrevisaoCapricornio.setText("Sua dedicação poderá trazer bons resultados. Continue focado em seus objetivos.");
        txPrevisaoAquario.setText("Novas ideias podem surgir. Não tenha medo de pensar de maneira diferente.");
        txPrevisaoPeixes.setText("Ouça sua intuição e reserve um momento para cuidar de si mesmo.");

        break;


    case 2: // Terça-feira

        txPrevisaoAries.setText("Sua energia estará forte hoje. Aproveite para colocar seus planos em prática.");
        txPrevisaoTouro.setText("Tenha paciência e não tente resolver tudo de uma vez. Cada passo é importante.");
        txPrevisaoGemeos.setText("Boas conversas podem trazer novas oportunidades e ideias interessantes.");
        txPrevisaoCancer.setText("Um bom dia para fortalecer amizades e demonstrar carinho por quem você gosta.");
        txPrevisaoLeao.setText("Você poderá se destacar em alguma atividade. Confie no seu potencial.");
        txPrevisaoVirgem.setText("Preste atenção aos detalhes e organize melhor seu tempo.");
        txPrevisaoLibra.setText("Evite indecisões e escolha aquilo que realmente faz sentido para você.");
        txPrevisaoEscorpiao.setText("Mantenha o foco e não deixe pequenas dificuldades atrapalharem seus planos.");
        txPrevisaoSagitario.setText("Uma nova possibilidade poderá despertar sua curiosidade. Esteja aberto às novidades.");
        txPrevisaoCapricornio.setText("O esforço realizado hoje poderá contribuir para resultados futuros.");
        txPrevisaoAquario.setText("Sua criatividade estará em destaque. Aproveite para desenvolver novas ideias.");
        txPrevisaoPeixes.setText("Um momento de tranquilidade poderá ajudar você a organizar seus pensamentos.");

        break;


    case 3: // Quarta-feira

        txPrevisaoAries.setText("Não tenha medo de assumir novos desafios. Sua determinação fará diferença.");
        txPrevisaoTouro.setText("Um dia para manter os pés no chão e continuar trabalhando com tranquilidade.");
        txPrevisaoGemeos.setText("Sua curiosidade estará forte. Aproveite para descobrir algo interessante.");
        txPrevisaoCancer.setText("Procure ouvir seus sentimentos, mas também considere os conselhos de pessoas de confiança.");
        txPrevisaoLeao.setText("Sua presença poderá chamar atenção. Use essa energia de maneira positiva.");
        txPrevisaoVirgem.setText("Concentre-se no que realmente importa e evite preocupações desnecessárias.");
        txPrevisaoLibra.setText("O diálogo será importante para resolver possíveis diferenças.");
        txPrevisaoEscorpiao.setText("Você terá força para superar pequenos obstáculos. Continue determinado.");
        txPrevisaoSagitario.setText("Um bom dia para pensar em novas experiências e ampliar seus conhecimentos.");
        txPrevisaoCapricornio.setText("Mantenha a disciplina e não desista diante das primeiras dificuldades.");
        txPrevisaoAquario.setText("Uma ideia diferente pode ajudar a solucionar um problema antigo.");
        txPrevisaoPeixes.setText("Sua sensibilidade estará maior. Use-a para compreender melhor as pessoas ao seu redor.");

        break;


    case 4: // Quinta-feira

        txPrevisaoAries.setText("Antes de agir, pense nas consequências. Equilíbrio entre coragem e cautela será importante.");
        txPrevisaoTouro.setText("Tenha confiança no caminho que escolheu e continue avançando com paciência.");
        txPrevisaoGemeos.setText("Uma conversa inesperada pode trazer uma nova perspectiva para você.");
        txPrevisaoCancer.setText("Cuide da sua energia e procure ficar perto de pessoas que fazem você se sentir bem.");
        txPrevisaoLeao.setText("Sua criatividade pode abrir novas possibilidades. Acredite mais nas suas ideias.");
        txPrevisaoVirgem.setText("Organize suas prioridades e evite deixar pequenas tarefas acumularem.");
        txPrevisaoLibra.setText("Procure encontrar um ponto de equilíbrio entre suas necessidades e as dos outros.");
        txPrevisaoEscorpiao.setText("Mantenha seus objetivos em mente e não permita que distrações tirem seu foco.");
        txPrevisaoSagitario.setText("O dia favorece novos aprendizados e planos para o futuro.");
        txPrevisaoCapricornio.setText("Seu esforço e responsabilidade poderão fazer diferença em uma tarefa importante.");
        txPrevisaoAquario.setText("Não tenha medo de apresentar suas ideias. Sua criatividade pode surpreender.");
        txPrevisaoPeixes.setText("Reserve um tempo para descansar e fazer algo que traga tranquilidade.");

        break;


    case 5: // Sexta-feira

        txPrevisaoAries.setText("A semana está chegando ao fim. Aproveite para comemorar pequenas conquistas.");
        txPrevisaoTouro.setText("Um dia agradável para concluir pendências e aproveitar momentos de tranquilidade.");
        txPrevisaoGemeos.setText("Sua comunicação estará em destaque. Aproveite para conversar e se divertir.");
        txPrevisaoCancer.setText("Um bom momento para estar perto de amigos e familiares.");
        txPrevisaoLeao.setText("Aproveite sua energia e criatividade para terminar a semana de forma positiva.");
        txPrevisaoVirgem.setText("Finalize suas tarefas com calma e permita-se descansar depois.");
        txPrevisaoLibra.setText("O dia pode trazer momentos agradáveis e boas conversas.");
        txPrevisaoEscorpiao.setText("Deixe de lado algumas preocupações e aproveite melhor o momento presente.");
        txPrevisaoSagitario.setText("A sexta-feira favorece diversão, encontros e novas experiências.");
        txPrevisaoCapricornio.setText("Depois de uma semana de dedicação, permita-se relaxar um pouco.");
        txPrevisaoAquario.setText("Um dia interessante para socializar e compartilhar suas ideias.");
        txPrevisaoPeixes.setText("Aproveite o dia para se divertir e ficar perto de quem faz bem a você.");

        break;


    case 6: // Sábado

        txPrevisaoAries.setText("Aproveite o sábado para descansar e fazer algo que realmente gosta.");
        txPrevisaoTouro.setText("Um dia ideal para relaxar e aproveitar pequenos momentos de conforto.");
        txPrevisaoGemeos.setText("Procure variar a rotina e fazer algo diferente neste sábado.");
        txPrevisaoCancer.setText("Passe um tempo com pessoas queridas e aproveite momentos especiais.");
        txPrevisaoLeao.setText("Divirta-se e aproveite sua criatividade para tornar o dia mais interessante.");
        txPrevisaoVirgem.setText("Depois de organizar suas responsabilidades, reserve um tempo para descansar.");
        txPrevisaoLibra.setText("Busque atividades que tragam leveza e equilíbrio para o seu dia.");
        txPrevisaoEscorpiao.setText("Um sábado tranquilo pode ajudar você a recuperar suas energias.");
        txPrevisaoSagitario.setText("Aproveite para sair da rotina e experimentar algo novo.");
        txPrevisaoCapricornio.setText("Descanse e aproveite o tempo livre sem pensar demais nas obrigações.");
        txPrevisaoAquario.setText("Um ótimo momento para colocar em prática uma ideia diferente.");
        txPrevisaoPeixes.setText("Aproveite o sábado para relaxar, ouvir música ou fazer algo criativo.");

        break;


    case 7: // Domingo

        txPrevisaoAries.setText("Domingo é um bom momento para descansar e planejar uma nova semana.");
        txPrevisaoTouro.setText("Aproveite o dia com tranquilidade e valorize os pequenos momentos.");
        txPrevisaoGemeos.setText("Converse com pessoas queridas e compartilhe suas ideias para a próxima semana.");
        txPrevisaoCancer.setText("Um dia especial para estar com a família e fortalecer os laços afetivos.");
        txPrevisaoLeao.setText("Relaxe, divirta-se e prepare-se para começar a próxima semana com confiança.");
        txPrevisaoVirgem.setText("Organize mentalmente seus próximos objetivos, mas também reserve tempo para descansar.");
        txPrevisaoLibra.setText("Procure terminar a semana em paz e com pensamentos positivos.");
        txPrevisaoEscorpiao.setText("Use o domingo para recuperar suas energias e refletir sobre seus próximos passos.");
        txPrevisaoSagitario.setText("Planeje novas aventuras e mantenha sua curiosidade sempre ativa.");
        txPrevisaoCapricornio.setText("Um bom dia para descansar e organizar seus objetivos para a semana.");
        txPrevisaoAquario.setText("Use o domingo para pensar em novas ideias e possibilidades.");
        txPrevisaoPeixes.setText("Descanse, cuide de si e prepare-se emocionalmente para uma nova semana.");

        break;


    default:
        txPrevisaoAries.setText("");
        txPrevisaoTouro.setText("");
        txPrevisaoGemeos.setText("");
        txPrevisaoCancer.setText("");
        txPrevisaoLeao.setText("");
        txPrevisaoVirgem.setText("");
        txPrevisaoLibra.setText("");
        txPrevisaoEscorpiao.setText("");
        txPrevisaoSagitario.setText("");
        txPrevisaoCapricornio.setText("");
        txPrevisaoAquario.setText("");
        txPrevisaoPeixes.setText("");
         break; 
         

}
    }
public void PreencherMensagem(){
int diaSemana = LocalDate.now().getDayOfWeek().getValue();

switch (diaSemana) {

    case 1: // DOMINGO

        txMensagemAries.setText("Áries: Hoje é um ótimo dia para tomar iniciativas e colocar seus planos em prática.");
        txMensagemTouro.setText("Touro: Organize sua rotina e busque estabilidade nas suas decisões.");
        txMensagemGemeos.setText("Gêmeos: Sua comunicação estará favorecida. Aproveite para trocar ideias.");
        txMensagemCancer.setText("Câncer: Valorize suas emoções e aproveite momentos com pessoas queridas.");
        txMensagemLeao.setText("Leão: Mostre sua criatividade e confiança para enfrentar os desafios.");
        txMensagemVirgem.setText("Virgem: Organização e planejamento serão importantes para o seu dia.");
        txMensagemLibra.setText("Libra: Busque equilíbrio entre suas responsabilidades e seu descanso.");
        txMensagemEscorpiao.setText("Escorpião: Sua determinação estará forte. Use-a para avançar em seus objetivos.");
        txMensagemSagitario.setText("Sagitário: Um novo desafio pode despertar sua vontade de aprender.");
        txMensagemCapricornio.setText("Capricórnio: Mantenha o foco nos seus objetivos e avance com responsabilidade.");
        txMensagemAquario.setText("Aquário: Sua criatividade pode ajudar a encontrar novas soluções.");
        txMensagemPeixes.setText("Peixes: Confie na sua criatividade e aproveite sua sensibilidade.");

        break;


    case 2: // SEGUNDA-FEIRA

        txMensagemAries.setText("Áries: Comece a semana com energia e determinação para alcançar seus objetivos.");
        txMensagemTouro.setText("Touro: Tenha calma e confie no resultado do seu esforço.");
        txMensagemGemeos.setText("Gêmeos: Novas ideias podem surgir. Aproveite para colocá-las em prática.");
        txMensagemCancer.setText("Câncer: Dedique um pouco de tempo às pessoas que são importantes para você.");
        txMensagemLeao.setText("Leão: Sua confiança poderá ajudar você a superar os desafios.");
        txMensagemVirgem.setText("Virgem: Concentre-se nas tarefas mais importantes do dia.");
        txMensagemLibra.setText("Libra: Uma conversa tranquila pode ajudar a resolver uma situação.");
        txMensagemEscorpiao.setText("Escorpião: Observe bem as situações antes de tomar decisões.");
        txMensagemSagitario.setText("Sagitário: Mantenha o entusiasmo e planeje seus próximos passos.");
        txMensagemCapricornio.setText("Capricórnio: Seu esforço constante poderá trazer bons resultados.");
        txMensagemAquario.setText("Aquário: Compartilhe suas ideias e esteja aberto a novas opiniões.");
        txMensagemPeixes.setText("Peixes: Organize seus pensamentos e defina suas prioridades.");

        break;


    case 3: // TERÇA-FEIRA

        txMensagemAries.setText("Áries: Sua energia estará em alta. Aproveite para resolver pendências.");
        txMensagemTouro.setText("Touro: Uma oportunidade pode surgir. Observe os detalhes.");
        txMensagemGemeos.setText("Gêmeos: Evite fazer muitas tarefas ao mesmo tempo e priorize o essencial.");
        txMensagemCancer.setText("Câncer: Organize seus planos e cuide dos assuntos pessoais.");
        txMensagemLeao.setText("Leão: Sua determinação pode transformar uma ideia em realização.");
        txMensagemVirgem.setText("Virgem: Sua atenção aos detalhes ajudará na resolução de problemas.");
        txMensagemLibra.setText("Libra: Confie mais nas suas escolhas e não tenha medo de decidir.");
        txMensagemEscorpiao.setText("Escorpião: Deixe para trás aquilo que não contribui para seus objetivos.");
        txMensagemSagitario.setText("Sagitário: Uma nova ideia pode trazer uma oportunidade interessante.");
        txMensagemCapricornio.setText("Capricórnio: Organize suas prioridades antes de assumir novas tarefas.");
        txMensagemAquario.setText("Aquário: Um bom dia para aprender algo novo.");
        txMensagemPeixes.setText("Peixes: Sua imaginação pode ajudar a resolver problemas.");

        break;


    case 4: // QUARTA-FEIRA

        txMensagemAries.setText("Áries: Evite agir por impulso e pense bem antes de tomar decisões.");
        txMensagemTouro.setText("Touro: Valorize as pessoas que estão ao seu lado.");
        txMensagemGemeos.setText("Gêmeos: Uma boa conversa pode ajudar a resolver uma situação.");
        txMensagemCancer.setText("Câncer: Não guarde suas preocupações. Converse com alguém de confiança.");
        txMensagemLeao.setText("Leão: Evite conflitos desnecessários e escolha o diálogo.");
        txMensagemVirgem.setText("Virgem: Não tente controlar tudo. Algumas situações precisam de tempo.");
        txMensagemLibra.setText("Libra: Valorize a harmonia e evite discussões desnecessárias.");
        txMensagemEscorpiao.setText("Escorpião: Evite agir pela emoção e analise os fatos.");
        txMensagemSagitario.setText("Sagitário: Pense nas consequências antes de tomar decisões.");
        txMensagemCapricornio.setText("Capricórnio: Não tenha medo de fazer uma pausa quando precisar.");
        txMensagemAquario.setText("Aquário: Uma boa conversa pode fazer diferença hoje.");
        txMensagemPeixes.setText("Peixes: Evite absorver as preocupações de outras pessoas.");

        break;


    case 5: // QUINTA-FEIRA

        txMensagemAries.setText("Áries: Um dia favorável para fortalecer seus relacionamentos.");
        txMensagemTouro.setText("Touro: Seu esforço pode trazer bons resultados.");
        txMensagemGemeos.setText("Gêmeos: Use sua criatividade para encontrar novas soluções.");
        txMensagemCancer.setText("Câncer: Sua sensibilidade ajudará você a perceber detalhes importantes.");
        txMensagemLeao.setText("Leão: Um dia positivo para demonstrar seus talentos.");
        txMensagemVirgem.setText("Virgem: Um bom momento para concluir tarefas importantes.");
        txMensagemLibra.setText("Libra: Aproveite para fortalecer amizades e novas conexões.");
        txMensagemEscorpiao.setText("Escorpião: Sua concentração ajudará a finalizar uma tarefa importante.");
        txMensagemSagitario.setText("Sagitário: Aproveite sua criatividade e disposição.");
        txMensagemCapricornio.setText("Capricórnio: Reconheça o resultado do seu esforço.");
        txMensagemAquario.setText("Aquário: Use sua originalidade para realizar algo interessante.");
        txMensagemPeixes.setText("Peixes: Valorize suas pequenas conquistas.");

        break;


    case 6: // SEXTA-FEIRA

        txMensagemAries.setText("Áries: Organize suas tarefas e aproveite o dia para cuidar dos seus objetivos.");
        txMensagemTouro.setText("Touro: Reserve um tempo para descansar e fazer algo que você gosta.");
        txMensagemGemeos.setText("Gêmeos: Aproveite para sair da rotina e passar um tempo com amigos.");
        txMensagemCancer.setText("Câncer: Aproveite para descansar e fazer atividades tranquilas.");
        txMensagemLeao.setText("Leão: Faça algo divertido e desperte sua criatividade.");
        txMensagemVirgem.setText("Virgem: Diminua o ritmo e aproveite para descansar.");
        txMensagemLibra.setText("Libra: Faça algo que traga alegria e tranquilidade.");
        txMensagemEscorpiao.setText("Escorpião: Aproveite atividades que você gosta para relaxar.");
        txMensagemSagitario.setText("Sagitário: Aproveite o dia para conversar e viver novas experiências.");
        txMensagemCapricornio.setText("Capricórnio: Aproveite seu tempo livre para descansar.");
        txMensagemAquario.setText("Aquário: Faça algo diferente e aproveite sua liberdade.");
        txMensagemPeixes.setText("Peixes: Aproveite para descansar e realizar uma atividade agradável.");

        break;


    case 7: // SÁBADO

        txMensagemAries.setText("Áries: Descanse, recarregue suas energias e prepare-se para uma nova semana.");
        txMensagemTouro.setText("Touro: Organize seus pensamentos e planeje a próxima semana.");
        txMensagemGemeos.setText("Gêmeos: Descanse a mente antes de começar uma nova semana.");
        txMensagemCancer.setText("Câncer: Passe um tempo com pessoas queridas.");
        txMensagemLeao.setText("Leão: Relaxe e reconheça tudo o que conseguiu realizar.");
        txMensagemVirgem.setText("Virgem: Planeje os próximos dias com calma.");
        txMensagemLibra.setText("Libra: Recupere seu equilíbrio para a próxima semana.");
        txMensagemEscorpiao.setText("Escorpião: Reflita sobre a semana e pense nos próximos passos.");
        txMensagemSagitario.setText("Sagitário: Descanse e prepare-se para novos desafios.");
        txMensagemCapricornio.setText("Capricórnio: Planeje a próxima semana com tranquilidade.");
        txMensagemAquario.setText("Aquário: Relaxe e organize suas ideias.");
        txMensagemPeixes.setText("Peixes: Recupere suas energias para começar uma nova semana.");

        break;




    

 

}
 }
public void CorrigirAreaTexto(){
   // ÁRIES
txMensagemAries.setLineWrap(true);
txMensagemAries.setWrapStyleWord(true);
txPrevisaoAries.setLineWrap(true);
txPrevisaoAries.setWrapStyleWord(true);
txPFortesAries.setLineWrap(true);
txPMelhorarAries.setLineWrap(true);
txPMelhorarAries.setWrapStyleWord(true);

// TOURO
txMensagemTouro.setLineWrap(true);
txMensagemTouro.setWrapStyleWord(true);
txPrevisaoTouro.setLineWrap(true);
txPrevisaoTouro.setWrapStyleWord(true);
txPFortesTouro.setLineWrap(true);
txPMelhorarTouro.setLineWrap(true);
txPMelhorarTouro.setWrapStyleWord(true);

// GÊMEOS
txMensagemGemeos.setLineWrap(true);
txMensagemGemeos.setWrapStyleWord(true);
txPrevisaoGemeos.setLineWrap(true);
txPrevisaoGemeos.setWrapStyleWord(true);
txPFortesGemeos.setLineWrap(true);
txPMelhorarGemeos.setLineWrap(true);
txPMelhorarGemeos.setWrapStyleWord(true);

// CÂNCER
txMensagemCancer.setLineWrap(true);
txMensagemCancer.setWrapStyleWord(true);
txPrevisaoCancer.setLineWrap(true);
txPrevisaoCancer.setWrapStyleWord(true);
txPFortesCancer.setLineWrap(true);
txPMelhorarCancer.setLineWrap(true);
txPMelhorarCancer.setWrapStyleWord(true);

// LEÃO
txMensagemLeao.setLineWrap(true);
txMensagemLeao.setWrapStyleWord(true);
txPrevisaoLeao.setLineWrap(true);
txPrevisaoLeao.setWrapStyleWord(true);
txPFortesLeao.setLineWrap(true);
txPMelhorarLeao.setLineWrap(true);
txPMelhorarLeao.setWrapStyleWord(true);

// VIRGEM
txMensagemVirgem.setLineWrap(true);
txMensagemVirgem.setWrapStyleWord(true);
txPrevisaoVirgem.setLineWrap(true);
txPrevisaoVirgem.setWrapStyleWord(true);
txPFortesVirgem.setLineWrap(true);
txPMelhorarVirgem.setLineWrap(true);
txPMelhorarVirgem.setWrapStyleWord(true);

// LIBRA
txMensagemLibra.setLineWrap(true);
txMensagemLibra.setWrapStyleWord(true);
txPrevisaoLibra.setLineWrap(true);
txPrevisaoLibra.setWrapStyleWord(true);
txPFortesLibra.setLineWrap(true);
txPMelhorarLibra.setLineWrap(true);
txPMelhorarLibra.setWrapStyleWord(true);

// ESCORPIÃO
txMensagemEscorpiao.setLineWrap(true);
txMensagemEscorpiao.setWrapStyleWord(true);
txPrevisaoEscorpiao.setLineWrap(true);
txPrevisaoEscorpiao.setWrapStyleWord(true);
txPFortesEscorpiao.setLineWrap(true);
txPMelhorarEscorpiao.setLineWrap(true);
txPMelhorarEscorpiao.setWrapStyleWord(true);

// SAGITÁRIO
txMensagemSagitario.setLineWrap(true);
txMensagemSagitario.setWrapStyleWord(true);
txPrevisaoSagitario.setLineWrap(true);
txPrevisaoSagitario.setWrapStyleWord(true);
txPFortesSagitario.setLineWrap(true);
txPMelhorarSagitario.setLineWrap(true);
txPMelhorarSagitario.setWrapStyleWord(true);

// CAPRICÓRNIO
txMensagemCapricornio.setLineWrap(true);
txMensagemCapricornio.setWrapStyleWord(true);
txPrevisaoCapricornio.setLineWrap(true);
txPrevisaoCapricornio.setWrapStyleWord(true);
txPFortesCapricornio.setLineWrap(true);
txPMelhorarCapricornio.setLineWrap(true);
txPMelhorarCapricornio.setWrapStyleWord(true);

// AQUÁRIO
txMensagemAquario.setLineWrap(true);
txMensagemAquario.setWrapStyleWord(true);
txPrevisaoAquario.setLineWrap(true);
txPrevisaoAquario.setWrapStyleWord(true);
txPFortesAquario.setLineWrap(true);
txPMelhorarAquario.setLineWrap(true);
txPMelhorarAquario.setWrapStyleWord(true);

// PEIXES
txMensagemPeixes.setLineWrap(true);
txMensagemPeixes.setWrapStyleWord(true);
txPrevisaoPeixes.setLineWrap(true);
txPrevisaoPeixes.setWrapStyleWord(true);
txPFortesPeixes.setLineWrap(true);
txPMelhorarPeixes.setLineWrap(true);
txPMelhorarPeixes.setWrapStyleWord(true); 
    
 
   }  
public void CalcularSigno(){
int dia = Integer.parseInt(cbDia.getSelectedItem().toString());
String mes = cbMes.getSelectedItem().toString();
ImageIcon imagem= null;
// VERIFICAR DIA E MES DOS SIGNOS COM IF ELSE

   if ((mes.equalsIgnoreCase("Março") && dia >= 21) ||
    (mes.equalsIgnoreCase("Abril") && dia < 20)) {

    signo.setText("Áries");
    imagem = (ImageIcon) imgSignoAries.getIcon();

} else if ((mes.equalsIgnoreCase("Abril") && dia >= 20) ||
           (mes.equalsIgnoreCase("Maio") && dia < 21)) {

    signo.setText("Touro");
    imagem = (ImageIcon) imgSignoTouro.getIcon();

} else if ((mes.equalsIgnoreCase("Maio") && dia >= 21) ||
           (mes.equalsIgnoreCase("Junho") && dia < 21)) {

    signo.setText("Gêmeos");
    imagem = (ImageIcon) imgSignoGemeos.getIcon();

} else if ((mes.equalsIgnoreCase("Junho") && dia >= 21) ||
           (mes.equalsIgnoreCase("Julho") && dia < 23)) {

    signo.setText("Câncer");
    imagem = (ImageIcon) imgSignoCancer.getIcon();

} else if ((mes.equalsIgnoreCase("Julho") && dia >= 23) ||
           (mes.equalsIgnoreCase("Agosto") && dia < 23)) {

    signo.setText("Leão");
    imagem = (ImageIcon) imgSignoLeao.getIcon();

} else if ((mes.equalsIgnoreCase("Agosto") && dia >= 23) ||
           (mes.equalsIgnoreCase("Setembro") && dia < 23)) {

    signo.setText("Virgem");
    imagem = (ImageIcon) imgSignoVirgem.getIcon();

} else if ((mes.equalsIgnoreCase("Setembro") && dia >= 23) ||
           (mes.equalsIgnoreCase("Outubro") && dia < 23)) {

    signo.setText("Libra");
    imagem = (ImageIcon) imgSignoLibra.getIcon();

} else if ((mes.equalsIgnoreCase("Outubro") && dia >= 23) ||
           (mes.equalsIgnoreCase("Novembro") && dia < 22)) {

    signo.setText("Escorpião");
    imagem = (ImageIcon) imgSignoEscorpiao.getIcon();

} else if ((mes.equalsIgnoreCase("Novembro") && dia >= 22) ||
           (mes.equalsIgnoreCase("Dezembro") && dia < 22)) {

    signo.setText("Sagitário");
    imagem = (ImageIcon) imgSignoSagitario.getIcon();

} else if ((mes.equalsIgnoreCase("Dezembro") && dia >= 22) ||
           (mes.equalsIgnoreCase("Janeiro") && dia < 20)) {

    signo.setText("Capricórnio");
    imagem = (ImageIcon) imgSignoCapricornio.getIcon();

} else if ((mes.equalsIgnoreCase("Janeiro") && dia >= 20) ||
           (mes.equalsIgnoreCase("Fevereiro") && dia < 19)) {

    signo.setText("Aquário");
    imagem = (ImageIcon) imgSignoAquario.getIcon();

} else if ((mes.equalsIgnoreCase("Fevereiro") && dia >= 19) ||
           (mes.equalsIgnoreCase("Março") && dia < 21)) {

    signo.setText("Peixes");
    imagem = (ImageIcon) imgSignoPeixes.getIcon();

   
   
   }
  btnSigno.setIcon(imagem);
 }
public void CalcularCompatibilidade(){
 
String signo1 = cbSigno1.getSelectedItem().toString();
String signo2 = cbSigno2.getSelectedItem().toString();

if (signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Touro") ||
    signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Áries")) {

    tfCompatibilidade.setText("70% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Gêmeos") ||
           signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Áries")) {

    tfCompatibilidade.setText("50% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Câncer") ||
           signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Áries")) {

    tfCompatibilidade.setText("60% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Leão") ||
           signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Áries")) {

    tfCompatibilidade.setText("90% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Virgem") ||
           signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Áries")) {

    tfCompatibilidade.setText("55% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Libra") ||
           signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Áries")) {

    tfCompatibilidade.setText("75% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Escorpião") ||
           signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Áries")) {

    tfCompatibilidade.setText("65% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Sagitário") ||
           signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Áries")) {

    tfCompatibilidade.setText("95% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Capricórnio") ||
           signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Áries")) {

    tfCompatibilidade.setText("50% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Aquário") ||
           signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Áries")) {

    tfCompatibilidade.setText("80% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Áries") && signo2.equalsIgnoreCase("Peixes") ||
           signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Áries")) {

    tfCompatibilidade.setText("60% compatibilidade!");


/* ==================== TOURO ==================== */

} else if (signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Gêmeos") ||
           signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Touro")) {

    tfCompatibilidade.setText("55% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Câncer") ||
           signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Touro")) {

    tfCompatibilidade.setText("85% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Leão") ||
           signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Touro")) {

    tfCompatibilidade.setText("60% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Virgem") ||
           signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Touro")) {

    tfCompatibilidade.setText("95% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Libra") ||
           signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Touro")) {

    tfCompatibilidade.setText("70% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Escorpião") ||
           signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Touro")) {

    tfCompatibilidade.setText("80% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Sagitário") ||
           signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Touro")) {

    tfCompatibilidade.setText("50% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Capricórnio") ||
           signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Touro")) {

    tfCompatibilidade.setText("95% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Aquário") ||
           signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Touro")) {

    tfCompatibilidade.setText("55% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Touro") && signo2.equalsIgnoreCase("Peixes") ||
           signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Touro")) {

    tfCompatibilidade.setText("75% compatibilidade!");


/* ==================== GÊMEOS ==================== */

} else if (signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Câncer") ||
           signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Gêmeos")) {

    tfCompatibilidade.setText("65% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Leão") ||
           signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Gêmeos")) {

    tfCompatibilidade.setText("80% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Virgem") ||
           signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Gêmeos")) {

    tfCompatibilidade.setText("70% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Libra") ||
           signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Gêmeos")) {

    tfCompatibilidade.setText("90% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Escorpião") ||
           signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Gêmeos")) {

    tfCompatibilidade.setText("55% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Sagitário") ||
           signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Gêmeos")) {

    tfCompatibilidade.setText("85% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Capricórnio") ||
           signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Gêmeos")) {

    tfCompatibilidade.setText("50% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Aquário") ||
           signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Gêmeos")) {

    tfCompatibilidade.setText("95% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Gêmeos") && signo2.equalsIgnoreCase("Peixes") ||
           signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Gêmeos")) {

    tfCompatibilidade.setText("60% compatibilidade!");


/* ==================== CÂNCER ==================== */

} else if (signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Leão") ||
           signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Câncer")) {

    tfCompatibilidade.setText("70% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Virgem") ||
           signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Câncer")) {

    tfCompatibilidade.setText("85% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Libra") ||
           signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Câncer")) {

    tfCompatibilidade.setText("65% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Escorpião") ||
           signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Câncer")) {

    tfCompatibilidade.setText("95% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Sagitário") ||
           signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Câncer")) {

    tfCompatibilidade.setText("55% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Capricórnio") ||
           signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Câncer")) {

    tfCompatibilidade.setText("75% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Aquário") ||
           signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Câncer")) {

    tfCompatibilidade.setText("50% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Câncer") && signo2.equalsIgnoreCase("Peixes") ||
           signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Câncer")) {

    tfCompatibilidade.setText("95% compatibilidade!");


/* ==================== LEÃO ==================== */

} else if (signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Virgem") ||
           signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Leão")) {

    tfCompatibilidade.setText("60% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Libra") ||
           signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Leão")) {

    tfCompatibilidade.setText("85% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Escorpião") ||
           signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Leão")) {

    tfCompatibilidade.setText("65% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Sagitário") ||
           signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Leão")) {

    tfCompatibilidade.setText("95% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Capricórnio") ||
           signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Leão")) {

    tfCompatibilidade.setText("55% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Aquário") ||
           signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Leão")) {

    tfCompatibilidade.setText("80% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Leão") && signo2.equalsIgnoreCase("Peixes") ||
           signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Leão")) {

    tfCompatibilidade.setText("60% compatibilidade!");


/* ==================== VIRGEM ==================== */

} else if (signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Libra") ||
           signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Virgem")) {

    tfCompatibilidade.setText("75% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Escorpião") ||
           signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Virgem")) {

    tfCompatibilidade.setText("85% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Sagitário") ||
           signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Virgem")) {

    tfCompatibilidade.setText("55% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Capricórnio") ||
           signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Virgem")) {

    tfCompatibilidade.setText("95% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Aquário") ||
           signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Virgem")) {

    tfCompatibilidade.setText("60% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Virgem") && signo2.equalsIgnoreCase("Peixes") ||
           signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Virgem")) {

    tfCompatibilidade.setText("70% compatibilidade!");


/* ==================== LIBRA ==================== */

} else if (signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Escorpião") ||
           signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Libra")) {

    tfCompatibilidade.setText("70% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Sagitário") ||
           signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Libra")) {

    tfCompatibilidade.setText("85% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Capricórnio") ||
           signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Libra")) {

    tfCompatibilidade.setText("60% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Aquário") ||
           signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Libra")) {

    tfCompatibilidade.setText("95% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Libra") && signo2.equalsIgnoreCase("Peixes") ||
           signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Libra")) {

    tfCompatibilidade.setText("65% compatibilidade!");


/* ==================== ESCORPIÃO ==================== */

} else if (signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Sagitário") ||
           signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Escorpião")) {

    tfCompatibilidade.setText("65% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Capricórnio") ||
           signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Escorpião")) {

    tfCompatibilidade.setText("85% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Aquário") ||
           signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Escorpião")) {

    tfCompatibilidade.setText("60% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Escorpião") && signo2.equalsIgnoreCase("Peixes") ||
           signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Escorpião")) {

    tfCompatibilidade.setText("95% compatibilidade!");


/* ==================== SAGITÁRIO ==================== */

} else if (signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Capricórnio") ||
           signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Sagitário")) {

    tfCompatibilidade.setText("60% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Aquário") ||
           signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Sagitário")) {

    tfCompatibilidade.setText("90% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Sagitário") && signo2.equalsIgnoreCase("Peixes") ||
           signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Sagitário")) {

    tfCompatibilidade.setText("65% compatibilidade!");


/* ==================== CAPRICÓRNIO ==================== */

} else if (signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Aquário") ||
           signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Capricórnio")) {

    tfCompatibilidade.setText("65% compatibilidade!");

} else if (signo1.equalsIgnoreCase("Capricórnio") && signo2.equalsIgnoreCase("Peixes") ||
           signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Capricórnio")) {

    tfCompatibilidade.setText("85% compatibilidade!");


/* ==================== AQUÁRIO + PEIXES ==================== */

} else if (signo1.equalsIgnoreCase("Aquário") && signo2.equalsIgnoreCase("Peixes") ||
           signo1.equalsIgnoreCase("Peixes") && signo2.equalsIgnoreCase("Aquário")) {

    tfCompatibilidade.setText("75% compatibilidade!");


/* ==================== MESMO SIGNO ==================== */

} else if (signo1.equalsIgnoreCase(signo2)) {

    tfCompatibilidade.setText("90% compatibilidade!");

} else {

    tfCompatibilidade.setText("Selecione dois signos para verificar a compatibilidade.");
}        
 }
public void TocarMusica() {
    try {
        // Se a música já foi carregada, continuar a reprodução
        if (musica != null && musica.isOpen()) {
            musica.start();
            return;
        }

        // Localizar o arquivo dentro do projeto
        java.net.URL arquivo = getClass().getResource("/musica/bts.wav");

        if (arquivo == null) {
            JOptionPane.showMessageDialog(this, "Arquivo de música não encontrado!");
            return;
        }

        // Abrir o áudio e carregar a música
        try (AudioInputStream audio = AudioSystem.getAudioInputStream(arquivo)) {
            musica = AudioSystem.getClip();
            musica.open(audio);
        }

        // Iniciar a reprodução
        musica.start();

    } catch (Exception erro) {
        JOptionPane.showMessageDialog(
                this,
                "Erro ao tocar a música: " + erro.getMessage()
        );
    }
}// Fim do TocarMusica
public void PausarMusica() {
    if (musica != null && musica.isOpen()) {
        // Pausar na posição atual
        musica.stop();
    }
}// Fim do PausarMusica
public void PararMusica() {
    if (musica != null && musica.isOpen()) {
        // Parar e voltar ao início
        musica.stop();
        musica.setFramePosition(0);
    }
}// Fim do PararMusica



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaAbas = new javax.swing.JTabbedPane();
        iniciio = new javax.swing.JPanel();
        areaDescobrirSigno = new javax.swing.JPanel();
        descubraSeuSigno = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        diaNascimento = new javax.swing.JLabel();
        mesNascimento = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        cbDia = new javax.swing.JComboBox<>();
        cbMes = new javax.swing.JComboBox<>();
        btnDescobrirSigno = new javax.swing.JButton();
        areaCompatibilidade = new javax.swing.JPanel();
        compatibilidade = new javax.swing.JLabel();
        signo1 = new javax.swing.JLabel();
        signo2 = new javax.swing.JLabel();
        cbSigno1 = new javax.swing.JComboBox<>();
        cbSigno2 = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
        areaResultado = new javax.swing.JPanel();
        signo = new javax.swing.JLabel();
        jbCompatibilidade = new javax.swing.JLabel();
        btnSigno = new javax.swing.JButton();
        tfCompatibilidade = new javax.swing.JTextField();
        btnPlay = new javax.swing.JButton();
        btnPause = new javax.swing.JButton();
        imagemfundoinicio = new javax.swing.JLabel();
        aries = new javax.swing.JPanel();
        areaInformacoesAries = new javax.swing.JPanel();
        imgSignoAries = new javax.swing.JLabel();
        tituloAries = new javax.swing.JLabel();
        periodoAries = new javax.swing.JLabel();
        elementoAries = new javax.swing.JLabel();
        planetaAries = new javax.swing.JLabel();
        corAries = new javax.swing.JLabel();
        numeroAries = new javax.swing.JLabel();
        tfPeriodoAries = new javax.swing.JTextField();
        tfElementoAries = new javax.swing.JTextField();
        tfPlanetaAries = new javax.swing.JTextField();
        tfCorAries = new javax.swing.JTextField();
        tfNumeroAries = new javax.swing.JTextField();
        areaCaracteristicasAries = new javax.swing.JPanel();
        tituloCaracteristicasAries = new javax.swing.JLabel();
        pFortesAries = new javax.swing.JLabel();
        pMelhorarAries = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txPFortesAries = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txPMelhorarAries = new javax.swing.JTextArea();
        areaPrevisoesAries = new javax.swing.JPanel();
        previsaoAries = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txPrevisaoAries = new javax.swing.JTextArea();
        btnAtualizarPrevisoesAries = new javax.swing.JButton();
        areaEnergiaAries = new javax.swing.JPanel();
        tituloEnergiaAries = new javax.swing.JLabel();
        amorAries = new javax.swing.JLabel();
        trabalhoAries = new javax.swing.JLabel();
        saudeAries = new javax.swing.JLabel();
        sorteAries = new javax.swing.JLabel();
        tfAmorAries = new javax.swing.JTextField();
        tfTrabalhoAries = new javax.swing.JTextField();
        tfSaudeAries = new javax.swing.JTextField();
        tfSorteAries = new javax.swing.JTextField();
        areaMensagemAries = new javax.swing.JPanel();
        tituloMensagemAries = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txMensagemAries = new javax.swing.JTextArea();
        btnCopiarMensagemAries = new javax.swing.JButton();
        imagemfundoaries = new javax.swing.JLabel();
        touro = new javax.swing.JPanel();
        areaInformacoesTouro = new javax.swing.JPanel();
        imgSignoTouro = new javax.swing.JLabel();
        tituloAries12 = new javax.swing.JLabel();
        periodoTouro1 = new javax.swing.JLabel();
        elementoTouro1 = new javax.swing.JLabel();
        planetaTouro1 = new javax.swing.JLabel();
        corTouro1 = new javax.swing.JLabel();
        numeroTouro1 = new javax.swing.JLabel();
        tfPeriodoTouro1 = new javax.swing.JTextField();
        tfElementoTouro1 = new javax.swing.JTextField();
        tfPlanetaTouro1 = new javax.swing.JTextField();
        tfCorTouro1 = new javax.swing.JTextField();
        tfNumeroTouro1 = new javax.swing.JTextField();
        areaPrevisoesTouro = new javax.swing.JPanel();
        previsaoTouro1 = new javax.swing.JLabel();
        jScrollPane49 = new javax.swing.JScrollPane();
        txPrevisaoTouro = new javax.swing.JTextArea();
        btnAtualizarPrevisoesTouro1 = new javax.swing.JButton();
        areaCaracteristicasTouro = new javax.swing.JPanel();
        tituloCaracteristicasTouro1 = new javax.swing.JLabel();
        pForteTouro1 = new javax.swing.JLabel();
        pMelhorarTouro1 = new javax.swing.JLabel();
        jScrollPane50 = new javax.swing.JScrollPane();
        txPFortesTouro = new javax.swing.JTextArea();
        jScrollPane51 = new javax.swing.JScrollPane();
        txPMelhorarTouro = new javax.swing.JTextArea();
        areaEnergia12 = new javax.swing.JPanel();
        tituloEnergiaTouro1 = new javax.swing.JLabel();
        amorTouro1 = new javax.swing.JLabel();
        tabalhoTouro1 = new javax.swing.JLabel();
        saude1 = new javax.swing.JLabel();
        sorteTouro1 = new javax.swing.JLabel();
        tfTrabalhoTouro1 = new javax.swing.JTextField();
        tfSaudeTouro1 = new javax.swing.JTextField();
        tfSorteTouro1 = new javax.swing.JTextField();
        tfAmorTouro1 = new javax.swing.JTextField();
        areaMensagemTouro = new javax.swing.JPanel();
        tituloMensagemTouro1 = new javax.swing.JLabel();
        jScrollPane52 = new javax.swing.JScrollPane();
        txMensagemTouro = new javax.swing.JTextArea();
        btnCopiarMensagemTouro1 = new javax.swing.JButton();
        imagemfundotouro = new javax.swing.JLabel();
        gemeos = new javax.swing.JPanel();
        areaPrevisoesGemeos = new javax.swing.JPanel();
        previsaoGemeos = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txPrevisaoGemeos = new javax.swing.JTextArea();
        btnAtualizarPrevisoesGemeos = new javax.swing.JButton();
        areaInformacoesGemeos = new javax.swing.JPanel();
        imgSignoGemeos = new javax.swing.JLabel();
        tituloGemeos = new javax.swing.JLabel();
        periodoGemeos = new javax.swing.JLabel();
        elementoGemeos = new javax.swing.JLabel();
        planetaGemeos = new javax.swing.JLabel();
        corGemeos = new javax.swing.JLabel();
        numeroGemeos = new javax.swing.JLabel();
        tfPeriodoGemeos = new javax.swing.JTextField();
        tfElementoGemeos = new javax.swing.JTextField();
        tfPlanetaGemeos = new javax.swing.JTextField();
        tfCorGemeos = new javax.swing.JTextField();
        tfNumeroGemeos = new javax.swing.JTextField();
        areaCaracteristicasGemeos = new javax.swing.JPanel();
        tituloCaracteristicasGemeos = new javax.swing.JLabel();
        pForteGemeos = new javax.swing.JLabel();
        pMelhorarGemeos = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        txPFortesGemeos = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        txPMelhorarGemeos = new javax.swing.JTextArea();
        areaEnergiaGemeos = new javax.swing.JPanel();
        tituloEnergiaGemeos = new javax.swing.JLabel();
        amorGemeos = new javax.swing.JLabel();
        trabalhoGemeos = new javax.swing.JLabel();
        saudeGemeos = new javax.swing.JLabel();
        sorteGemeos = new javax.swing.JLabel();
        tfAmorGemeos = new javax.swing.JTextField();
        tfTrabalhoGemeos = new javax.swing.JTextField();
        tfSaudeGemeos = new javax.swing.JTextField();
        tfSorteGemeos = new javax.swing.JTextField();
        areaMensagemGemeos = new javax.swing.JPanel();
        tituloMensagemGemeos = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        txMensagemGemeos = new javax.swing.JTextArea();
        btnCopiarMensagemGemeos = new javax.swing.JButton();
        fundoimagemgemeos = new javax.swing.JLabel();
        cancer = new javax.swing.JPanel();
        areaPrevisoesCancer = new javax.swing.JPanel();
        previsaoCancer = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        txPrevisaoCancer = new javax.swing.JTextArea();
        btnAtualizarPrevisoesCancer = new javax.swing.JButton();
        areaInformacoesCancer = new javax.swing.JPanel();
        imgSignoCancer = new javax.swing.JLabel();
        tituloCancer = new javax.swing.JLabel();
        periodoCancer = new javax.swing.JLabel();
        elementoCancer = new javax.swing.JLabel();
        planetaCancer = new javax.swing.JLabel();
        corCancer = new javax.swing.JLabel();
        numeroCancer = new javax.swing.JLabel();
        tfPeriodoCancer = new javax.swing.JTextField();
        tfElementoCancer = new javax.swing.JTextField();
        tfPlanetaCancer = new javax.swing.JTextField();
        tfCorCancer = new javax.swing.JTextField();
        tfNumeroCancer = new javax.swing.JTextField();
        areaCaracteristicasCancer = new javax.swing.JPanel();
        tituloCaracteristicasCancer = new javax.swing.JLabel();
        pFortesCancer = new javax.swing.JLabel();
        pMelhorarCancer = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        txPFortesCancer = new javax.swing.JTextArea();
        jScrollPane19 = new javax.swing.JScrollPane();
        txPMelhorarCancer = new javax.swing.JTextArea();
        areaEnergiaCancer = new javax.swing.JPanel();
        tituloEnergiaCancer = new javax.swing.JLabel();
        amorCancer = new javax.swing.JLabel();
        trabalhoCancer = new javax.swing.JLabel();
        saudeCancer = new javax.swing.JLabel();
        sorteCancer = new javax.swing.JLabel();
        tfAmorCancer = new javax.swing.JTextField();
        tfTrabalhoCancer = new javax.swing.JTextField();
        tfSaudeCancer = new javax.swing.JTextField();
        tfSorteCancer = new javax.swing.JTextField();
        areaMensagemCancer = new javax.swing.JPanel();
        tituloMensagemCancer = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        txMensagemCancer = new javax.swing.JTextArea();
        btnCopiarMensagemCancer = new javax.swing.JButton();
        fundoimagemcancer = new javax.swing.JLabel();
        leao = new javax.swing.JPanel();
        areaPrevisoesLeao = new javax.swing.JPanel();
        previsaoLeao = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        txPrevisaoLeao = new javax.swing.JTextArea();
        btnAtualizarPrevisoesLeao = new javax.swing.JButton();
        areaInformacoesLeao = new javax.swing.JPanel();
        imgSignoLeao = new javax.swing.JLabel();
        tituloCompatibilidadeLeao = new javax.swing.JLabel();
        periodoLeao = new javax.swing.JLabel();
        elementoLeao = new javax.swing.JLabel();
        planetaLeao = new javax.swing.JLabel();
        corLeao = new javax.swing.JLabel();
        nSorteLeao = new javax.swing.JLabel();
        tfPeriodoLeao = new javax.swing.JTextField();
        tfElementoLeao = new javax.swing.JTextField();
        tfPlanetaLeao = new javax.swing.JTextField();
        tfCorLeao = new javax.swing.JTextField();
        tfNumeroLeao = new javax.swing.JTextField();
        areaCaracteristicasLeao = new javax.swing.JPanel();
        tituloCaracteristicasLeao = new javax.swing.JLabel();
        pFortesLeao = new javax.swing.JLabel();
        pMelhorarLeao = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        txPFortesLeao = new javax.swing.JTextArea();
        jScrollPane23 = new javax.swing.JScrollPane();
        txPMelhorarLeao = new javax.swing.JTextArea();
        areaEnergiaLeao = new javax.swing.JPanel();
        tituloEnergiaLeao = new javax.swing.JLabel();
        amorLeao = new javax.swing.JLabel();
        trabalhoLeao = new javax.swing.JLabel();
        saudeLeao = new javax.swing.JLabel();
        sorteLeao = new javax.swing.JLabel();
        tfAmorLeao = new javax.swing.JTextField();
        tfTrabalhoLeao = new javax.swing.JTextField();
        tfSaudeLeao = new javax.swing.JTextField();
        tfSorteLeao = new javax.swing.JTextField();
        areaMensagemLeao = new javax.swing.JPanel();
        tituloMensagemLeao = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        txMensagemLeao = new javax.swing.JTextArea();
        btnCopiarMensagemLeao = new javax.swing.JButton();
        fundoimagemleao = new javax.swing.JLabel();
        virgem = new javax.swing.JPanel();
        areaPrevisoesVirgem = new javax.swing.JPanel();
        previsaoVirgem = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        txPrevisaoVirgem = new javax.swing.JTextArea();
        btnAtualizarPrevisoesVirgem = new javax.swing.JButton();
        areaInformacoesVirgem = new javax.swing.JPanel();
        imgSignoVirgem = new javax.swing.JLabel();
        tituloCaracteristicaVirgem = new javax.swing.JLabel();
        periodoVirgem = new javax.swing.JLabel();
        elementoVirgem = new javax.swing.JLabel();
        planetaVirgem = new javax.swing.JLabel();
        corVirgem = new javax.swing.JLabel();
        numeroVirgem = new javax.swing.JLabel();
        tfPeriodoVirgem = new javax.swing.JTextField();
        tfElementoVirgem = new javax.swing.JTextField();
        tfPlanetaVirgem = new javax.swing.JTextField();
        tfCorVirgem = new javax.swing.JTextField();
        tfNumeroVirgem = new javax.swing.JTextField();
        areaCaracteristicasVirgem = new javax.swing.JPanel();
        tituloCaracteristicasVirgem = new javax.swing.JLabel();
        pFortesVirgem = new javax.swing.JLabel();
        pMelhorarVirgem = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        txPFortesVirgem = new javax.swing.JTextArea();
        jScrollPane27 = new javax.swing.JScrollPane();
        txPMelhorarVirgem = new javax.swing.JTextArea();
        areaEnergiaVirgem = new javax.swing.JPanel();
        tituloEnergiaVirgem = new javax.swing.JLabel();
        amorVirgem = new javax.swing.JLabel();
        trabalhoVirgem = new javax.swing.JLabel();
        saudeVirgem = new javax.swing.JLabel();
        sorteVirgem = new javax.swing.JLabel();
        tfAmorVirgem = new javax.swing.JTextField();
        tfTrabalhoVirgem = new javax.swing.JTextField();
        tfSaudeVirgem = new javax.swing.JTextField();
        tfSorteVirgem = new javax.swing.JTextField();
        areaMensagemVirgem = new javax.swing.JPanel();
        tituloMensagemVirgem = new javax.swing.JLabel();
        jScrollPane28 = new javax.swing.JScrollPane();
        txMensagemVirgem = new javax.swing.JTextArea();
        btnCopiarMensagemVirgem = new javax.swing.JButton();
        fundoimagemvirgem = new javax.swing.JLabel();
        libra = new javax.swing.JPanel();
        areaInformacoesLibra = new javax.swing.JPanel();
        imgSignoLibra = new javax.swing.JLabel();
        tituloLibra = new javax.swing.JLabel();
        periodoLibra = new javax.swing.JLabel();
        elementoLibra = new javax.swing.JLabel();
        planetaLibra = new javax.swing.JLabel();
        corLibra = new javax.swing.JLabel();
        numeroLibra = new javax.swing.JLabel();
        tfPeriodoLibra = new javax.swing.JTextField();
        tfElementoLibra = new javax.swing.JTextField();
        tfPlanetaLibra = new javax.swing.JTextField();
        tfCorLibra = new javax.swing.JTextField();
        tfNumeroLibra = new javax.swing.JTextField();
        areaPrevisoesLibra = new javax.swing.JPanel();
        previsaoLibra = new javax.swing.JLabel();
        jScrollPane29 = new javax.swing.JScrollPane();
        txPrevisaoLibra = new javax.swing.JTextArea();
        btnAtualizarPrevisoesLibra = new javax.swing.JButton();
        areaCaracteristicasLibra = new javax.swing.JPanel();
        tituloCaracteristicasLibra = new javax.swing.JLabel();
        pFortesLibra = new javax.swing.JLabel();
        pMelhorarLibra = new javax.swing.JLabel();
        jScrollPane30 = new javax.swing.JScrollPane();
        txPFortesLibra = new javax.swing.JTextArea();
        jScrollPane31 = new javax.swing.JScrollPane();
        txPMelhorarLibra = new javax.swing.JTextArea();
        areaEnergiaLibra = new javax.swing.JPanel();
        tituloEnergiaLibra = new javax.swing.JLabel();
        amorLibra = new javax.swing.JLabel();
        trabalhoLibra = new javax.swing.JLabel();
        saudeLibra = new javax.swing.JLabel();
        sorteLibra = new javax.swing.JLabel();
        tfAmorLibra = new javax.swing.JTextField();
        tfTrabalhoLibra = new javax.swing.JTextField();
        tfSaudeLibra = new javax.swing.JTextField();
        tfSorteLibra = new javax.swing.JTextField();
        areaMensagemLibra = new javax.swing.JPanel();
        tituloMensagemLibra = new javax.swing.JLabel();
        jScrollPane32 = new javax.swing.JScrollPane();
        txMensagemLibra = new javax.swing.JTextArea();
        btnCopiarMensagemLibra = new javax.swing.JButton();
        fundoimagemlibra = new javax.swing.JLabel();
        iscorpiao = new javax.swing.JPanel();
        areaInformacoesEscorpiao = new javax.swing.JPanel();
        imgSignoEscorpiao = new javax.swing.JLabel();
        tituloEscorpiao = new javax.swing.JLabel();
        periodoEscorpiao = new javax.swing.JLabel();
        elementoEscorpiao = new javax.swing.JLabel();
        planetaEscorpiao = new javax.swing.JLabel();
        corEscorpiao = new javax.swing.JLabel();
        numeroEscorpiao = new javax.swing.JLabel();
        tfPeriodoEscorpiao = new javax.swing.JTextField();
        tfElementoEscorpiao = new javax.swing.JTextField();
        tfPlanetaEscorpiao = new javax.swing.JTextField();
        tfCorEscorpiao = new javax.swing.JTextField();
        tfNumeroEscorpiao = new javax.swing.JTextField();
        areaCaracteristicasEscorpiao = new javax.swing.JPanel();
        tituloCaracteristicasEscorpiao = new javax.swing.JLabel();
        pFortesEscorpiao = new javax.swing.JLabel();
        pMelhorarEscorpiao = new javax.swing.JLabel();
        jScrollPane97 = new javax.swing.JScrollPane();
        txPFortesEscorpiao = new javax.swing.JTextArea();
        jScrollPane98 = new javax.swing.JScrollPane();
        txPMelhorarEscorpiao = new javax.swing.JTextArea();
        areaPrevisoesEscorpiao = new javax.swing.JPanel();
        previsaoEscorpiao = new javax.swing.JLabel();
        jScrollPane99 = new javax.swing.JScrollPane();
        txPrevisaoEscorpiao = new javax.swing.JTextArea();
        btnAtualizarPrevisoesEscorpiao = new javax.swing.JButton();
        areaEnergiaEscorpiao = new javax.swing.JPanel();
        tituloEnergiaEscorpiao = new javax.swing.JLabel();
        amorEscorpiao = new javax.swing.JLabel();
        trabalhoEscorpiao = new javax.swing.JLabel();
        saudeEscorpiao = new javax.swing.JLabel();
        sorteEscorpiao = new javax.swing.JLabel();
        tfAmorEscorpiao = new javax.swing.JTextField();
        tfTrabalhoEscorpiao = new javax.swing.JTextField();
        tfSaudeEscorpiao = new javax.swing.JTextField();
        tfSorteEscorpiao = new javax.swing.JTextField();
        areaMensagemEscoripiao = new javax.swing.JPanel();
        tituloMensagemEscorpiao = new javax.swing.JLabel();
        jScrollPane100 = new javax.swing.JScrollPane();
        txMensagemEscorpiao = new javax.swing.JTextArea();
        btnCopiarMensagemEscorpiao = new javax.swing.JButton();
        fundoImagemEscorpiao = new javax.swing.JLabel();
        sagitario = new javax.swing.JPanel();
        areaInformacoesSagitario = new javax.swing.JPanel();
        imgSignoSagitario = new javax.swing.JLabel();
        tituloSagitario = new javax.swing.JLabel();
        periodoSagitario = new javax.swing.JLabel();
        elementoSagitario = new javax.swing.JLabel();
        planetaSagitario = new javax.swing.JLabel();
        corSagitario = new javax.swing.JLabel();
        numeroSagitario = new javax.swing.JLabel();
        tfPeriodoSagitario = new javax.swing.JTextField();
        tfElementoSagitario = new javax.swing.JTextField();
        tfPlanetaSagitario = new javax.swing.JTextField();
        tfCorSagitario = new javax.swing.JTextField();
        tfNumeroSagitario = new javax.swing.JTextField();
        areaPrevisoesSagitario = new javax.swing.JPanel();
        previsaoSagitario = new javax.swing.JLabel();
        jScrollPane37 = new javax.swing.JScrollPane();
        txPrevisaoSagitario = new javax.swing.JTextArea();
        btnAtualizarPrevisoesSagitario = new javax.swing.JButton();
        areaCaracteristicasSagitario = new javax.swing.JPanel();
        tituloCaracteristicasSagitario = new javax.swing.JLabel();
        pFortesSagitario = new javax.swing.JLabel();
        pMelhorarSagitario = new javax.swing.JLabel();
        jScrollPane38 = new javax.swing.JScrollPane();
        txPFortesSagitario = new javax.swing.JTextArea();
        jScrollPane39 = new javax.swing.JScrollPane();
        txPMelhorarSagitario = new javax.swing.JTextArea();
        areaEnergiaSagitario = new javax.swing.JPanel();
        tituloEnergiaSagitario = new javax.swing.JLabel();
        amorSagitario = new javax.swing.JLabel();
        trabalhoSagitario = new javax.swing.JLabel();
        saudeSagitario = new javax.swing.JLabel();
        sorteSagitario = new javax.swing.JLabel();
        tfAmorSagitario = new javax.swing.JTextField();
        tfTrabalhoSagitario = new javax.swing.JTextField();
        tfSaudeSagitario = new javax.swing.JTextField();
        tfSorteSagitario = new javax.swing.JTextField();
        areaMensagemSagitario = new javax.swing.JPanel();
        tituloMensagemSagitario = new javax.swing.JLabel();
        jScrollPane40 = new javax.swing.JScrollPane();
        txMensagemSagitario = new javax.swing.JTextArea();
        btnCopiarMensagemSagitario = new javax.swing.JButton();
        fundoimagemsagitario = new javax.swing.JLabel();
        capricornio = new javax.swing.JPanel();
        areaPrevisoesCapricornio = new javax.swing.JPanel();
        previsaoCapricornio = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txPrevisaoCapricornio = new javax.swing.JTextArea();
        btnAtualizarPrevisoesCapricornio = new javax.swing.JButton();
        areaInformacoesCapricornio = new javax.swing.JPanel();
        imgSignoCapricornio = new javax.swing.JLabel();
        tituloCapricornio = new javax.swing.JLabel();
        periodoCapricornio = new javax.swing.JLabel();
        elementoCapricornio = new javax.swing.JLabel();
        planetaCapricornio = new javax.swing.JLabel();
        corCapricornio = new javax.swing.JLabel();
        numeroCapricornio = new javax.swing.JLabel();
        tfPeriodoCapricornio = new javax.swing.JTextField();
        tfElementoCapricornio = new javax.swing.JTextField();
        tfPlanetaCapricornio = new javax.swing.JTextField();
        tfCorCapricornio = new javax.swing.JTextField();
        tfNumeroCapricornio = new javax.swing.JTextField();
        areaCaracteristicaCapricornio = new javax.swing.JPanel();
        tituloCaracteristicasCapricornio = new javax.swing.JLabel();
        pFortesCapricornio = new javax.swing.JLabel();
        pMelhorarCapricornio = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txPFortesCapricornio = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txPMelhorarCapricornio = new javax.swing.JTextArea();
        areaEnergiaCapricornio = new javax.swing.JPanel();
        tituloEnergiaCapricornio = new javax.swing.JLabel();
        amorCapricornio = new javax.swing.JLabel();
        trabalhoCapricornio = new javax.swing.JLabel();
        saudeCapricornio = new javax.swing.JLabel();
        sorteCapricornio = new javax.swing.JLabel();
        tfAmorCapricornio = new javax.swing.JTextField();
        tfTrabalhoCapricornio = new javax.swing.JTextField();
        tfSaudeCapricornio = new javax.swing.JTextField();
        tfSorteCapricornio = new javax.swing.JTextField();
        areaMensagemCapricornio = new javax.swing.JPanel();
        tituloMensagemCapricornio = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txMensagemCapricornio = new javax.swing.JTextArea();
        btnCopiarMensagemCapricornio = new javax.swing.JButton();
        fundoimagemcapricornio = new javax.swing.JLabel();
        aquario = new javax.swing.JPanel();
        areaPrevisoesAquario = new javax.swing.JPanel();
        previsaoAquario = new javax.swing.JLabel();
        jScrollPane41 = new javax.swing.JScrollPane();
        txPrevisaoAquario = new javax.swing.JTextArea();
        btnAtualizarPrevisoesAquario = new javax.swing.JButton();
        areaInformacoesAquario = new javax.swing.JPanel();
        imgSignoAquario = new javax.swing.JLabel();
        tituloAquario = new javax.swing.JLabel();
        periodoAquario = new javax.swing.JLabel();
        elementoAquario = new javax.swing.JLabel();
        planetaAquario = new javax.swing.JLabel();
        corAquario = new javax.swing.JLabel();
        numeroAquario = new javax.swing.JLabel();
        tfPeriodoAquario = new javax.swing.JTextField();
        tfElementoAquario = new javax.swing.JTextField();
        tfPlanetaAquario = new javax.swing.JTextField();
        tfCorAquario = new javax.swing.JTextField();
        tfNumeroAquario = new javax.swing.JTextField();
        areaCaracteristicasAquario = new javax.swing.JPanel();
        tituloCaracteristicasAquario = new javax.swing.JLabel();
        pForesAquario = new javax.swing.JLabel();
        pMelhorarAquario = new javax.swing.JLabel();
        jScrollPane42 = new javax.swing.JScrollPane();
        txPFortesAquario = new javax.swing.JTextArea();
        jScrollPane43 = new javax.swing.JScrollPane();
        txPMelhorarAquario = new javax.swing.JTextArea();
        areaEnergiaAquario = new javax.swing.JPanel();
        tituloEnergiaAquario = new javax.swing.JLabel();
        amorAquario = new javax.swing.JLabel();
        trabalhoAquario = new javax.swing.JLabel();
        saudeAquario = new javax.swing.JLabel();
        sorteAquario = new javax.swing.JLabel();
        tfAmorAquario = new javax.swing.JTextField();
        tfTrabalhoAquario = new javax.swing.JTextField();
        tfSaudeAquario = new javax.swing.JTextField();
        tfSorteAquario = new javax.swing.JTextField();
        areaMensagemAquario = new javax.swing.JPanel();
        tituloMensagemAquario = new javax.swing.JLabel();
        jScrollPane44 = new javax.swing.JScrollPane();
        txMensagemAquario = new javax.swing.JTextArea();
        btnCopiarMensagemAquario = new javax.swing.JButton();
        fundoimagemaquario = new javax.swing.JLabel();
        peixes = new javax.swing.JPanel();
        areaPrevisoesPeixe = new javax.swing.JPanel();
        previsaoPeixe = new javax.swing.JLabel();
        jScrollPane45 = new javax.swing.JScrollPane();
        txPrevisaoPeixes = new javax.swing.JTextArea();
        btnAtualizarPrevisoesPeixe = new javax.swing.JButton();
        areaInformacoesPeixe = new javax.swing.JPanel();
        imgSignoPeixes = new javax.swing.JLabel();
        tituloPeixe = new javax.swing.JLabel();
        periodoPeixe = new javax.swing.JLabel();
        elementoPeixe = new javax.swing.JLabel();
        planetaPeixe = new javax.swing.JLabel();
        corPeixe = new javax.swing.JLabel();
        numeroPeixe = new javax.swing.JLabel();
        tfPeriodoPeixe = new javax.swing.JTextField();
        tfElementoPeixe = new javax.swing.JTextField();
        tfPlanetaPeixe = new javax.swing.JTextField();
        tfCorPeixe = new javax.swing.JTextField();
        tfNumeroPeixe = new javax.swing.JTextField();
        areaCaracteristicasPeixe = new javax.swing.JPanel();
        tituloCaracteristicasPeixe = new javax.swing.JLabel();
        pFortePeixe = new javax.swing.JLabel();
        pMelhorarPeixe = new javax.swing.JLabel();
        jScrollPane46 = new javax.swing.JScrollPane();
        txPFortesPeixes = new javax.swing.JTextArea();
        jScrollPane47 = new javax.swing.JScrollPane();
        txPMelhorarPeixes = new javax.swing.JTextArea();
        areaEnergiaPeixe = new javax.swing.JPanel();
        tituloEnergiaPeixe = new javax.swing.JLabel();
        amorPeixe = new javax.swing.JLabel();
        tabalhoPeixe = new javax.swing.JLabel();
        saudePeixe = new javax.swing.JLabel();
        sortePeixe = new javax.swing.JLabel();
        tfTrabalhoPeixe = new javax.swing.JTextField();
        tfSaudePeixe = new javax.swing.JTextField();
        tfSortePeixe = new javax.swing.JTextField();
        tfAmorPeixe = new javax.swing.JTextField();
        areaMensagemPeixe = new javax.swing.JPanel();
        tituloMensagemPeixe = new javax.swing.JLabel();
        jScrollPane48 = new javax.swing.JScrollPane();
        txMensagemPeixes = new javax.swing.JTextArea();
        btnCopiarMensagemPeixe = new javax.swing.JButton();
        fundoimagempeixes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaAbas.setBackground(new java.awt.Color(153, 153, 255));
        areaAbas.setForeground(new java.awt.Color(255, 255, 255));
        areaAbas.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N

        iniciio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaDescobrirSigno.setPreferredSize(new java.awt.Dimension(200, 200));

        descubraSeuSigno.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        descubraSeuSigno.setText("Descubra Seu Signo");

        nome.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        nome.setText("Nome:");

        diaNascimento.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        diaNascimento.setText("Dia de Nascimento:");

        mesNascimento.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        mesNascimento.setText("Mês de Nascimento:");

        tfNome.setText("digite seu nome:");

        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        btnDescobrirSigno.setBackground(new java.awt.Color(0, 0, 0));
        btnDescobrirSigno.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        btnDescobrirSigno.setForeground(new java.awt.Color(255, 255, 102));
        btnDescobrirSigno.setText("Descobrir Signo");
        btnDescobrirSigno.addActionListener(this::btnDescobrirSignoActionPerformed);

        javax.swing.GroupLayout areaDescobrirSignoLayout = new javax.swing.GroupLayout(areaDescobrirSigno);
        areaDescobrirSigno.setLayout(areaDescobrirSignoLayout);
        areaDescobrirSignoLayout.setHorizontalGroup(
            areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btnDescobrirSigno))
                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                .addComponent(mesNascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                        .addComponent(nome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                                        .addComponent(diaNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 2, Short.MAX_VALUE))))
                    .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(descubraSeuSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        areaDescobrirSignoLayout.setVerticalGroup(
            areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(descubraSeuSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaNascimento)
                    .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesNascimento)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnDescobrirSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        iniciio.add(areaDescobrirSigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 450, 300));

        compatibilidade.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        compatibilidade.setText("Compatibilidade");

        signo1.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        signo1.setText("Primeiro Signo:");

        signo2.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        signo2.setText("Segundo Signo:");

        cbSigno1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbSigno1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes" }));

        cbSigno2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbSigno2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes" }));

        btnCalcular.setBackground(new java.awt.Color(0, 0, 0));
        btnCalcular.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 102));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(this::btnCalcularActionPerformed);

        javax.swing.GroupLayout areaCompatibilidadeLayout = new javax.swing.GroupLayout(areaCompatibilidade);
        areaCompatibilidade.setLayout(areaCompatibilidadeLayout);
        areaCompatibilidadeLayout.setHorizontalGroup(
            areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(compatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                            .addComponent(signo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(cbSigno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                            .addComponent(signo2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cbSigno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(189, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaCompatibilidadeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaCompatibilidadeLayout.setVerticalGroup(
            areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(compatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signo1)
                    .addComponent(cbSigno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signo2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSigno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        iniciio.add(areaCompatibilidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 450, 250));

        signo.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        signo.setText("SIGNO");

        jbCompatibilidade.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jbCompatibilidade.setText("Compatibilidade");

        btnSigno.setBackground(new java.awt.Color(255, 255, 204));

        tfCompatibilidade.setBackground(new java.awt.Color(255, 255, 204));
        tfCompatibilidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnPlay.setText("Play music");
        btnPlay.addActionListener(this::btnPlayActionPerformed);

        btnPause.setText("Pause music");
        btnPause.addActionListener(this::btnPauseActionPerformed);

        javax.swing.GroupLayout areaResultadoLayout = new javax.swing.GroupLayout(areaResultado);
        areaResultado.setLayout(areaResultadoLayout);
        areaResultadoLayout.setHorizontalGroup(
            areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaResultadoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tfCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(areaResultadoLayout.createSequentialGroup()
                .addGroup(areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(areaResultadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(signo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPause))
                    .addGroup(areaResultadoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(areaResultadoLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jbCompatibilidade)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        areaResultadoLayout.setVerticalGroup(
            areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaResultadoLayout.createSequentialGroup()
                .addGroup(areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaResultadoLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(signo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaResultadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPlay)
                            .addComponent(btnPause))))
                .addGap(18, 18, 18)
                .addComponent(btnSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        iniciio.add(areaResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 320, 540));

        imagemfundoinicio.setBackground(new java.awt.Color(0, 0, 0));
        imagemfundoinicio.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        imagemfundoinicio.setForeground(new java.awt.Color(255, 255, 204));
        imagemfundoinicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagenfundo.png"))); // NOI18N
        iniciio.add(imagemfundoinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));

        areaAbas.addTab("Inicio", iniciio);

        aries.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgSignoAries.setIcon(new javax.swing.ImageIcon("C:\\Users\\GeovannaOliviera\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\aries.jpg")); // NOI18N

        tituloAries.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloAries.setText("Áries");

        periodoAries.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        periodoAries.setText("Periodo:");

        elementoAries.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        elementoAries.setText("Elemento:");

        planetaAries.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        planetaAries.setText("Planeta Regente:");

        corAries.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        corAries.setText("Cor:");

        numeroAries.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        numeroAries.setText("Numero Da Sorte:");

        tfPeriodoAries.setText("21/03 a 19/04");

        tfElementoAries.setText("Fogo");

        tfPlanetaAries.setText("Marte");

        tfCorAries.setText("Vermelho");

        tfNumeroAries.setText("9");

        javax.swing.GroupLayout areaInformacoesAriesLayout = new javax.swing.GroupLayout(areaInformacoesAries);
        areaInformacoesAries.setLayout(areaInformacoesAriesLayout);
        areaInformacoesAriesLayout.setHorizontalGroup(
            areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgSignoAries, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(tituloAries, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesAriesLayout.createSequentialGroup()
                                .addComponent(planetaAries, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfPlanetaAries, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesAriesLayout.createSequentialGroup()
                                .addComponent(corAries, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfCorAries, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesAriesLayout.createSequentialGroup()
                                .addComponent(numeroAries, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfNumeroAries, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                        .addComponent(elementoAries)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfElementoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                        .addComponent(periodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPeriodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        areaInformacoesAriesLayout.setVerticalGroup(
            areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                .addComponent(imgSignoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloAries, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(areaInformacoesAriesLayout.createSequentialGroup()
                        .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(periodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPeriodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(elementoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfElementoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(planetaAries, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfPlanetaAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corAries, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(tfCorAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroAries, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumeroAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        aries.add(areaInformacoesAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 290, 690));

        tituloCaracteristicasAries.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        tituloCaracteristicasAries.setText("Características");

        pFortesAries.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pFortesAries.setText("Pontos Fortes:");

        pMelhorarAries.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pMelhorarAries.setText("Pontos a Melhorar:");

        txPFortesAries.setColumns(20);
        txPFortesAries.setRows(5);
        txPFortesAries.setText("Coragem, determinação e iniciativa. Costumam ser energéticas, confiantes, independentes e sinceras, além de gostarem de desafios, novidades e de tomar a frente das situações.");
        jScrollPane2.setViewportView(txPFortesAries);

        txPMelhorarAries.setColumns(20);
        txPMelhorarAries.setRows(5);
        txPMelhorarAries.setText("Impaciência, impulsividade e teimosia.Também pode aprender a pensar antes de agir, controlar a irritação, ouvir mais os outros e ter mais paciência quando as coisas não acontecem como gostaria.");
        jScrollPane3.setViewportView(txPMelhorarAries);

        javax.swing.GroupLayout areaCaracteristicasAriesLayout = new javax.swing.GroupLayout(areaCaracteristicasAries);
        areaCaracteristicasAries.setLayout(areaCaracteristicasAriesLayout);
        areaCaracteristicasAriesLayout.setHorizontalGroup(
            areaCaracteristicasAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAriesLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasAriesLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(areaCaracteristicasAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pFortesAries, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pMelhorarAries, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicasAriesLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(tituloCaracteristicasAries, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        areaCaracteristicasAriesLayout.setVerticalGroup(
            areaCaracteristicasAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAriesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicasAries, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFortesAries, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aries.add(areaCaracteristicasAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 390, 320));

        areaPrevisoesAries.setForeground(new java.awt.Color(255, 255, 255));

        previsaoAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoAries.setText("PREVISÃO DO DIA:");

        txPrevisaoAries.setColumns(20);
        txPrevisaoAries.setRows(5);
        jScrollPane1.setViewportView(txPrevisaoAries);

        btnAtualizarPrevisoesAries.setBackground(new java.awt.Color(0, 0, 0));
        btnAtualizarPrevisoesAries.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnAtualizarPrevisoesAries.setForeground(new java.awt.Color(255, 255, 0));
        btnAtualizarPrevisoesAries.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoesAriesLayout = new javax.swing.GroupLayout(areaPrevisoesAries);
        areaPrevisoesAries.setLayout(areaPrevisoesAriesLayout);
        areaPrevisoesAriesLayout.setHorizontalGroup(
            areaPrevisoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesAriesLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnAtualizarPrevisoesAries)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(areaPrevisoesAriesLayout.createSequentialGroup()
                .addGroup(areaPrevisoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoesAriesLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(previsaoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisoesAriesLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        areaPrevisoesAriesLayout.setVerticalGroup(
            areaPrevisoesAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesAriesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisoesAries, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        aries.add(areaPrevisoesAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, 390, 260));

        tituloEnergiaAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaAries.setText("Energia Do Dia");

        amorAries.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amorAries.setText("Amor:");

        trabalhoAries.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        trabalhoAries.setText("Trabalho:");

        saudeAries.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saudeAries.setText("Saúde:");

        sorteAries.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sorteAries.setText("Sorte:");

        tfAmorAries.setText("85%");

        tfTrabalhoAries.setText("90%");
        tfTrabalhoAries.addActionListener(this::tfTrabalhoAriesActionPerformed);

        tfSaudeAries.setText("75%");
        tfSaudeAries.addActionListener(this::tfSaudeAriesActionPerformed);

        tfSorteAries.setText("80%");

        javax.swing.GroupLayout areaEnergiaAriesLayout = new javax.swing.GroupLayout(areaEnergiaAries);
        areaEnergiaAries.setLayout(areaEnergiaAriesLayout);
        areaEnergiaAriesLayout.setHorizontalGroup(
            areaEnergiaAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAriesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaEnergiaAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTrabalhoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saudeAries, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSaudeAries, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sorteAries)
                    .addComponent(tituloEnergiaAries, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amorAries)
                    .addComponent(tfAmorAries, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trabalhoAries)
                    .addComponent(tfSorteAries, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        areaEnergiaAriesLayout.setVerticalGroup(
            areaEnergiaAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAriesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amorAries)
                .addGap(8, 8, 8)
                .addComponent(tfAmorAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoAries)
                .addGap(12, 12, 12)
                .addComponent(tfTrabalhoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saudeAries)
                .addGap(8, 8, 8)
                .addComponent(tfSaudeAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteAries)
                .addGap(18, 18, 18)
                .addComponent(tfSorteAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        aries.add(areaEnergiaAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 100, 340, 290));

        tituloMensagemAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloMensagemAries.setText("Mensagem Do Dia");

        txMensagemAries.setColumns(20);
        txMensagemAries.setRows(5);
        jScrollPane4.setViewportView(txMensagemAries);

        btnCopiarMensagemAries.setBackground(new java.awt.Color(0, 0, 0));
        btnCopiarMensagemAries.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopiarMensagemAries.setForeground(new java.awt.Color(255, 255, 51));
        btnCopiarMensagemAries.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemAriesLayout = new javax.swing.GroupLayout(areaMensagemAries);
        areaMensagemAries.setLayout(areaMensagemAriesLayout);
        areaMensagemAriesLayout.setHorizontalGroup(
            areaMensagemAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAriesLayout.createSequentialGroup()
                .addGroup(areaMensagemAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemAriesLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnCopiarMensagemAries))
                    .addGroup(areaMensagemAriesLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(areaMensagemAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(areaMensagemAriesLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(tituloMensagemAries, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        areaMensagemAriesLayout.setVerticalGroup(
            areaMensagemAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAriesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(tituloMensagemAries, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnCopiarMensagemAries)
                .addGap(23, 23, 23))
        );

        aries.add(areaMensagemAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 460, 340, 260));

        imagemfundoaries.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagenfundo.png"))); // NOI18N
        aries.add(imagemfundoaries, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        areaAbas.addTab("Áries", aries);

        touro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgSignoTouro.setIcon(new javax.swing.ImageIcon("C:\\Users\\GeovannaOliviera\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\touro.jpg")); // NOI18N

        tituloAries12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloAries12.setText("Touro");

        periodoTouro1.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        periodoTouro1.setText("Periodo:");

        elementoTouro1.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        elementoTouro1.setText("Elemento:");

        planetaTouro1.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        planetaTouro1.setText("Planeta Regente:");

        corTouro1.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        corTouro1.setText("Cor:");

        numeroTouro1.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        numeroTouro1.setText("Numero Da Sorte:");

        tfPeriodoTouro1.setText("20/04 a 20/05");

        tfElementoTouro1.setText("Terra");

        tfPlanetaTouro1.setText("Vênus");

        tfCorTouro1.setText("Verde e Rosa");

        tfNumeroTouro1.setText("2");

        javax.swing.GroupLayout areaInformacoesTouroLayout = new javax.swing.GroupLayout(areaInformacoesTouro);
        areaInformacoesTouro.setLayout(areaInformacoesTouroLayout);
        areaInformacoesTouroLayout.setHorizontalGroup(
            areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgSignoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(planetaTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                            .addComponent(periodoTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(46, 46, 46)
                            .addComponent(tfPeriodoTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesTouroLayout.createSequentialGroup()
                                .addComponent(elementoTouro1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfElementoTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfPlanetaTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesTouroLayout.createSequentialGroup()
                                        .addComponent(numeroTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfNumeroTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesTouroLayout.createSequentialGroup()
                                        .addComponent(corTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65)
                                        .addComponent(tfCorTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(tituloAries12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesTouroLayout.setVerticalGroup(
            areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesTouroLayout.createSequentialGroup()
                .addComponent(imgSignoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(tituloAries12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPeriodoTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfElementoTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(planetaTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPlanetaTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 21, Short.MAX_VALUE)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCorTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corTouro1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumeroTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        touro.add(areaInformacoesTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 350, 680));

        areaPrevisoesTouro.setForeground(new java.awt.Color(255, 255, 255));

        previsaoTouro1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoTouro1.setText("PREVISÃO DO DIA:");

        txPrevisaoTouro.setColumns(20);
        txPrevisaoTouro.setRows(5);
        jScrollPane49.setViewportView(txPrevisaoTouro);

        btnAtualizarPrevisoesTouro1.setBackground(new java.awt.Color(102, 102, 255));
        btnAtualizarPrevisoesTouro1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnAtualizarPrevisoesTouro1.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisoesTouro1.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoesTouroLayout = new javax.swing.GroupLayout(areaPrevisoesTouro);
        areaPrevisoesTouro.setLayout(areaPrevisoesTouroLayout);
        areaPrevisoesTouroLayout.setHorizontalGroup(
            areaPrevisoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesTouroLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(areaPrevisoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisoesTouroLayout.createSequentialGroup()
                        .addComponent(btnAtualizarPrevisoesTouro1)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisoesTouroLayout.createSequentialGroup()
                        .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisoesTouroLayout.createSequentialGroup()
                        .addComponent(previsaoTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
        );
        areaPrevisoesTouroLayout.setVerticalGroup(
            areaPrevisoesTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesTouroLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(previsaoTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnAtualizarPrevisoesTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        touro.add(areaPrevisoesTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 390, 360));

        tituloCaracteristicasTouro1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        tituloCaracteristicasTouro1.setText("Características");

        pForteTouro1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pForteTouro1.setText("Pontos Fortes:");

        pMelhorarTouro1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pMelhorarTouro1.setText("Pontos a Melhorar:");

        txPFortesTouro.setColumns(20);
        txPFortesTouro.setRows(5);
        txPFortesTouro.setText("Leal, paciente e determinado. Também costuma ser confiável,responsável, persistente e prático, valorizando a estabilidade e as pessoas que ama.");
        jScrollPane50.setViewportView(txPFortesTouro);

        txPMelhorarTouro.setColumns(20);
        txPMelhorarTouro.setRows(5);
        txPMelhorarTouro.setText("Teimosia, possessividade e resistênciaa mudanças. Também pode desenvolver mais flexibilidade, paciência e aberturapara novas ideias.");
        jScrollPane51.setViewportView(txPMelhorarTouro);

        javax.swing.GroupLayout areaCaracteristicasTouroLayout = new javax.swing.GroupLayout(areaCaracteristicasTouro);
        areaCaracteristicasTouro.setLayout(areaCaracteristicasTouroLayout);
        areaCaracteristicasTouroLayout.setHorizontalGroup(
            areaCaracteristicasTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasTouroLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasTouroLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(areaCaracteristicasTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pMelhorarTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pForteTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicasTouroLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(tituloCaracteristicasTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        areaCaracteristicasTouroLayout.setVerticalGroup(
            areaCaracteristicasTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasTouroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicasTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pForteTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarTouro1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        touro.add(areaCaracteristicasTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 390, 310));

        tituloEnergiaTouro1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaTouro1.setText("Energia Do Dia");

        amorTouro1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amorTouro1.setText("Amor:");

        tabalhoTouro1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabalhoTouro1.setText("Trabalho:");

        saude1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saude1.setText("Saúde:");

        sorteTouro1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sorteTouro1.setText("Sorte:");

        tfTrabalhoTouro1.setText("95%");

        tfSaudeTouro1.setText("85%");
        tfSaudeTouro1.addActionListener(this::tfSaudeTouro1ActionPerformed);

        tfSorteTouro1.setText("80%");
        tfSorteTouro1.addActionListener(this::tfSorteTouro1ActionPerformed);

        tfAmorTouro1.setText("90%");
        tfAmorTouro1.addActionListener(this::tfAmorTouro1ActionPerformed);

        javax.swing.GroupLayout areaEnergia12Layout = new javax.swing.GroupLayout(areaEnergia12);
        areaEnergia12.setLayout(areaEnergia12Layout);
        areaEnergia12Layout.setHorizontalGroup(
            areaEnergia12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia12Layout.createSequentialGroup()
                .addComponent(tfTrabalhoTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(areaEnergia12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaEnergia12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergia12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfAmorTouro1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                        .addComponent(tituloEnergiaTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(saude1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tabalhoTouro1)
                        .addComponent(amorTouro1)
                        .addComponent(tfSorteTouro1)
                        .addComponent(sorteTouro1))
                    .addComponent(tfSaudeTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        areaEnergia12Layout.setVerticalGroup(
            areaEnergia12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergia12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaTouro1)
                .addGap(2, 2, 2)
                .addComponent(amorTouro1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(tfAmorTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabalhoTouro1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfTrabalhoTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saude1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sorteTouro1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        touro.add(areaEnergia12, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, 340, 310));

        tituloMensagemTouro1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloMensagemTouro1.setText("Mensagem Do Dia");

        txMensagemTouro.setColumns(20);
        txMensagemTouro.setRows(5);
        jScrollPane52.setViewportView(txMensagemTouro);

        btnCopiarMensagemTouro1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopiarMensagemTouro1.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemTouroLayout = new javax.swing.GroupLayout(areaMensagemTouro);
        areaMensagemTouro.setLayout(areaMensagemTouroLayout);
        areaMensagemTouroLayout.setHorizontalGroup(
            areaMensagemTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                .addGroup(areaMensagemTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(tituloMensagemTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane52, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnCopiarMensagemTouro1)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        areaMensagemTouroLayout.setVerticalGroup(
            areaMensagemTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(tituloMensagemTouro1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane52, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnCopiarMensagemTouro1)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        touro.add(areaMensagemTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 370, 340, 350));

        imagemfundotouro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagenfundo.png"))); // NOI18N
        touro.add(imagemfundotouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        areaAbas.addTab("Touro", touro);

        gemeos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaPrevisoesGemeos.setForeground(new java.awt.Color(255, 255, 255));

        previsaoGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoGemeos.setText("PREVISÃO DO DIA:");

        txPrevisaoGemeos.setColumns(20);
        txPrevisaoGemeos.setRows(5);
        jScrollPane13.setViewportView(txPrevisaoGemeos);

        btnAtualizarPrevisoesGemeos.setBackground(new java.awt.Color(102, 102, 255));
        btnAtualizarPrevisoesGemeos.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnAtualizarPrevisoesGemeos.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisoesGemeos.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoesGemeosLayout = new javax.swing.GroupLayout(areaPrevisoesGemeos);
        areaPrevisoesGemeos.setLayout(areaPrevisoesGemeosLayout);
        areaPrevisoesGemeosLayout.setHorizontalGroup(
            areaPrevisoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesGemeosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(areaPrevisoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAtualizarPrevisoesGemeos)
                        .addGroup(areaPrevisoesGemeosLayout.createSequentialGroup()
                            .addComponent(previsaoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)))
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        areaPrevisoesGemeosLayout.setVerticalGroup(
            areaPrevisoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesGemeosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisoesGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        gemeos.add(areaPrevisoesGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 390, 300));

        imgSignoGemeos.setIcon(new javax.swing.ImageIcon("C:\\Users\\GeovannaOliviera\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Gemeos.jpg")); // NOI18N

        tituloGemeos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloGemeos.setText("Gêmeos");

        periodoGemeos.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        periodoGemeos.setText("Periodo:");

        elementoGemeos.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        elementoGemeos.setText("Elemento:");

        planetaGemeos.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        planetaGemeos.setText("Planeta Regente:");

        corGemeos.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        corGemeos.setText("Cor:");

        numeroGemeos.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        numeroGemeos.setText("Numero Da Sorte:");

        tfPeriodoGemeos.setText("21/05 a 20/06");

        tfElementoGemeos.setText("Ar");

        tfPlanetaGemeos.setText("Mercúrio");

        tfCorGemeos.setText("Amarelo e verde-claro");

        tfNumeroGemeos.setText("5, 7 e 14");

        javax.swing.GroupLayout areaInformacoesGemeosLayout = new javax.swing.GroupLayout(areaInformacoesGemeos);
        areaInformacoesGemeos.setLayout(areaInformacoesGemeosLayout);
        areaInformacoesGemeosLayout.setHorizontalGroup(
            areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgSignoGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                        .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfElementoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                                    .addComponent(planetaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfPlanetaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                                .addComponent(periodoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfPeriodoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                        .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(elementoGemeos)
                            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                                .addComponent(corGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfCorGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                                .addComponent(numeroGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfNumeroGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tituloGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        areaInformacoesGemeosLayout.setVerticalGroup(
            areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                .addComponent(imgSignoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(tituloGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPeriodoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfElementoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPlanetaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(tfCorGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumeroGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        gemeos.add(areaInformacoesGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 290, 630));

        tituloCaracteristicasGemeos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        tituloCaracteristicasGemeos.setText("Características");

        pForteGemeos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pForteGemeos.setText("Pontos Fortes:");

        pMelhorarGemeos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pMelhorarGemeos.setText("Pontos a Melhorar:");

        txPFortesGemeos.setColumns(20);
        txPFortesGemeos.setRows(5);
        txPFortesGemeos.setText("Comunicação, inteligência e curiosidade.Também costuma ser descrito comocriativo, sociável, versátil e adaptável, com facilidade para aprender coisas novas e conversar sobre diferentes assuntos.");
        jScrollPane14.setViewportView(txPFortesGemeos);

        txPMelhorarGemeos.setColumns(20);
        txPMelhorarGemeos.setRows(5);
        txPMelhorarGemeos.setText("Inconstância, ansiedade e indecisão. Também pode desenvolver mais paciência foco e organização, evitando começar muitas coisas ao mesmo tempo e não terminá-las.");
        jScrollPane15.setViewportView(txPMelhorarGemeos);

        javax.swing.GroupLayout areaCaracteristicasGemeosLayout = new javax.swing.GroupLayout(areaCaracteristicasGemeos);
        areaCaracteristicasGemeos.setLayout(areaCaracteristicasGemeosLayout);
        areaCaracteristicasGemeosLayout.setHorizontalGroup(
            areaCaracteristicasGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasGemeosLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(areaCaracteristicasGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(areaCaracteristicasGemeosLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addGroup(areaCaracteristicasGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pForteGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pMelhorarGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(areaCaracteristicasGemeosLayout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(tituloCaracteristicasGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(areaCaracteristicasGemeosLayout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        areaCaracteristicasGemeosLayout.setVerticalGroup(
            areaCaracteristicasGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasGemeosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicasGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pForteGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gemeos.add(areaCaracteristicasGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 390, 320));

        tituloEnergiaGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaGemeos.setText("Energia Do Dia");

        amorGemeos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amorGemeos.setText("Amor:");

        trabalhoGemeos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        trabalhoGemeos.setText("Trabalho:");

        saudeGemeos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saudeGemeos.setText("Saúde:");

        sorteGemeos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sorteGemeos.setText("Sorte:");

        tfAmorGemeos.setText("80%");
        tfAmorGemeos.addActionListener(this::tfAmorGemeosActionPerformed);

        tfTrabalhoGemeos.setText("85%");

        tfSaudeGemeos.setText("80%");
        tfSaudeGemeos.addActionListener(this::tfSaudeGemeosActionPerformed);

        javax.swing.GroupLayout areaEnergiaGemeosLayout = new javax.swing.GroupLayout(areaEnergiaGemeos);
        areaEnergiaGemeos.setLayout(areaEnergiaGemeosLayout);
        areaEnergiaGemeosLayout.setHorizontalGroup(
            areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfSaudeGemeos, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                        .addComponent(tfTrabalhoGemeos)
                        .addComponent(tfAmorGemeos)
                        .addComponent(tituloEnergiaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(saudeGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(trabalhoGemeos)
                        .addComponent(amorGemeos)
                        .addComponent(tfSorteGemeos))
                    .addComponent(sorteGemeos))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        areaEnergiaGemeosLayout.setVerticalGroup(
            areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaGemeos)
                .addGap(8, 8, 8)
                .addComponent(amorGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trabalhoGemeos)
                .addGap(12, 12, 12)
                .addComponent(tfTrabalhoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saudeGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSaudeGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sorteGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSorteGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        gemeos.add(areaEnergiaGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, 340, 300));

        tituloMensagemGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloMensagemGemeos.setText("Mensagem Do Dia");

        txMensagemGemeos.setColumns(20);
        txMensagemGemeos.setRows(5);
        jScrollPane16.setViewportView(txMensagemGemeos);

        btnCopiarMensagemGemeos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopiarMensagemGemeos.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemGemeosLayout = new javax.swing.GroupLayout(areaMensagemGemeos);
        areaMensagemGemeos.setLayout(areaMensagemGemeosLayout);
        areaMensagemGemeosLayout.setHorizontalGroup(
            areaMensagemGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemGemeosLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(btnCopiarMensagemGemeos)
                .addGap(95, 95, 95))
            .addGroup(areaMensagemGemeosLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(areaMensagemGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloMensagemGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaMensagemGemeosLayout.setVerticalGroup(
            areaMensagemGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemGemeosLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(tituloMensagemGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagemGemeos)
                .addGap(25, 25, 25))
        );

        gemeos.add(areaMensagemGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 370, 340, 300));

        fundoimagemgemeos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagenfundo.png"))); // NOI18N
        gemeos.add(fundoimagemgemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));

        areaAbas.addTab("Gêmeos", gemeos);

        cancer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaPrevisoesCancer.setForeground(new java.awt.Color(255, 255, 255));

        previsaoCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoCancer.setText("PREVISÃO DO DIA:");

        txPrevisaoCancer.setColumns(20);
        txPrevisaoCancer.setRows(5);
        jScrollPane17.setViewportView(txPrevisaoCancer);

        btnAtualizarPrevisoesCancer.setBackground(new java.awt.Color(102, 102, 255));
        btnAtualizarPrevisoesCancer.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnAtualizarPrevisoesCancer.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisoesCancer.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoesCancerLayout = new javax.swing.GroupLayout(areaPrevisoesCancer);
        areaPrevisoesCancer.setLayout(areaPrevisoesCancerLayout);
        areaPrevisoesCancerLayout.setHorizontalGroup(
            areaPrevisoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesCancerLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(areaPrevisoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAtualizarPrevisoesCancer)
                        .addGroup(areaPrevisoesCancerLayout.createSequentialGroup()
                            .addComponent(previsaoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)))
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        areaPrevisoesCancerLayout.setVerticalGroup(
            areaPrevisoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesCancerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisoesCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        cancer.add(areaPrevisoesCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 390, 300));

        imgSignoCancer.setIcon(new javax.swing.ImageIcon("C:\\Users\\GeovannaOliviera\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\cancer.jpg")); // NOI18N

        tituloCancer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloCancer.setText("Câncer");

        periodoCancer.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        periodoCancer.setText("Periodo:");

        elementoCancer.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        elementoCancer.setText("Elemento:");

        planetaCancer.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        planetaCancer.setText("Planeta Regente:");

        corCancer.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        corCancer.setText("Cor:");

        numeroCancer.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        numeroCancer.setText("Numero Da Sorte:");

        tfPeriodoCancer.setText("21/06 a 22/07");

        tfElementoCancer.setText("Água");

        tfPlanetaCancer.setText("Lua");

        tfCorCancer.setText("Branco e prata ");
        tfCorCancer.addActionListener(this::tfCorCancerActionPerformed);

        tfNumeroCancer.setText("2");

        javax.swing.GroupLayout areaInformacoesCancerLayout = new javax.swing.GroupLayout(areaInformacoesCancer);
        areaInformacoesCancer.setLayout(areaInformacoesCancerLayout);
        areaInformacoesCancerLayout.setHorizontalGroup(
            areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgSignoCancer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesCancerLayout.createSequentialGroup()
                        .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(planetaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(numeroCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPlanetaCancer)
                            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tfNumeroCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                                .addComponent(periodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(tfPeriodoCancer))
                            .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                                    .addComponent(elementoCancer)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfElementoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                                    .addComponent(corCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(68, 68, 68)
                                    .addComponent(tfCorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tituloCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesCancerLayout.setVerticalGroup(
            areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                .addComponent(imgSignoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPeriodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfElementoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPlanetaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(tfCorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumeroCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        cancer.add(areaInformacoesCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 290, 620));

        tituloCaracteristicasCancer.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        tituloCaracteristicasCancer.setText("Características");

        pFortesCancer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pFortesCancer.setText("Pontos Fortes:");

        pMelhorarCancer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pMelhorarCancer.setText("Pontos a Melhorar:");

        txPFortesCancer.setColumns(20);
        txPFortesCancer.setRows(5);
        txPFortesCancer.setText("Carinhoso, sensível e protetor. Costuma valorizar muito a família e as amizades, sendo leal, acolhedor, intuitivo e atencioso com as pessoas que ama. Também pode ter uma forte empatia e facilidade para perceber os sentimentos dos outros.");
        jScrollPane18.setViewportView(txPFortesCancer);

        txPMelhorarCancer.setColumns(20);
        txPMelhorarCancer.setRows(5);
        txPMelhorarCancer.setText("Sensibilidade excessiva, insegurança e apego ao passado. Também pode aprende a lidar melhor com as emoções, evitar guardar mágoas, confiar mais em si mesmo e comunicar o que sente com clareza.");
        jScrollPane19.setViewportView(txPMelhorarCancer);

        javax.swing.GroupLayout areaCaracteristicasCancerLayout = new javax.swing.GroupLayout(areaCaracteristicasCancer);
        areaCaracteristicasCancer.setLayout(areaCaracteristicasCancerLayout);
        areaCaracteristicasCancerLayout.setHorizontalGroup(
            areaCaracteristicasCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCancerLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasCancerLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(areaCaracteristicasCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pFortesCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pMelhorarCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicasCancerLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(tituloCaracteristicasCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        areaCaracteristicasCancerLayout.setVerticalGroup(
            areaCaracteristicasCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCancerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicasCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFortesCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cancer.add(areaCaracteristicasCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 390, -1));

        tituloEnergiaCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaCancer.setText("Energia Do Dia");

        amorCancer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amorCancer.setText("Amor:");

        trabalhoCancer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        trabalhoCancer.setText("Trabalho:");

        saudeCancer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saudeCancer.setText("Saúde:");

        sorteCancer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sorteCancer.setText("Sorte:");

        tfAmorCancer.setText("95%");
        tfAmorCancer.addActionListener(this::tfAmorCancerActionPerformed);

        tfTrabalhoCancer.setText("85%");
        tfTrabalhoCancer.addActionListener(this::tfTrabalhoCancerActionPerformed);

        tfSaudeCancer.setText("80%");
        tfSaudeCancer.addActionListener(this::tfSaudeCancerActionPerformed);

        tfSorteCancer.setText("85%");

        javax.swing.GroupLayout areaEnergiaCancerLayout = new javax.swing.GroupLayout(areaEnergiaCancer);
        areaEnergiaCancer.setLayout(areaEnergiaCancerLayout);
        areaEnergiaCancerLayout.setHorizontalGroup(
            areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                .addComponent(tfTrabalhoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
            .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfSaudeCancer, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                        .addComponent(tfAmorCancer)
                        .addComponent(saudeCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(trabalhoCancer)
                        .addComponent(amorCancer)
                        .addComponent(tfSorteCancer)
                        .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(tituloEnergiaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(sorteCancer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaEnergiaCancerLayout.setVerticalGroup(
            areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(amorCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        cancer.add(areaEnergiaCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 340, 300));

        tituloMensagemCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloMensagemCancer.setText("Mensagem Do Dia");

        txMensagemCancer.setColumns(20);
        txMensagemCancer.setRows(5);
        jScrollPane20.setViewportView(txMensagemCancer);

        btnCopiarMensagemCancer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopiarMensagemCancer.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemCancerLayout = new javax.swing.GroupLayout(areaMensagemCancer);
        areaMensagemCancer.setLayout(areaMensagemCancerLayout);
        areaMensagemCancerLayout.setHorizontalGroup(
            areaMensagemCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemCancerLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(areaMensagemCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCopiarMensagemCancer)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        areaMensagemCancerLayout.setVerticalGroup(
            areaMensagemCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCancerLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(tituloMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagemCancer)
                .addGap(15, 15, 15))
        );

        cancer.add(areaMensagemCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 360, 340, 300));

        fundoimagemcancer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagenfundo.png"))); // NOI18N
        cancer.add(fundoimagemcancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));

        areaAbas.addTab("Câncer", cancer);

        leao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaPrevisoesLeao.setForeground(new java.awt.Color(255, 255, 255));

        previsaoLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoLeao.setText("PREVISÃO DO DIA:");

        txPrevisaoLeao.setColumns(20);
        txPrevisaoLeao.setRows(5);
        jScrollPane21.setViewportView(txPrevisaoLeao);

        btnAtualizarPrevisoesLeao.setBackground(new java.awt.Color(102, 102, 255));
        btnAtualizarPrevisoesLeao.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnAtualizarPrevisoesLeao.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisoesLeao.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoesLeaoLayout = new javax.swing.GroupLayout(areaPrevisoesLeao);
        areaPrevisoesLeao.setLayout(areaPrevisoesLeaoLayout);
        areaPrevisoesLeaoLayout.setHorizontalGroup(
            areaPrevisoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesLeaoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(areaPrevisoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAtualizarPrevisoesLeao)
                        .addGroup(areaPrevisoesLeaoLayout.createSequentialGroup()
                            .addComponent(previsaoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)))
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        areaPrevisoesLeaoLayout.setVerticalGroup(
            areaPrevisoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesLeaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisoesLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        leao.add(areaPrevisoesLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 390, 260));

        imgSignoLeao.setIcon(new javax.swing.ImageIcon("C:\\Users\\GeovannaOliviera\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\leao.jpg")); // NOI18N

        tituloCompatibilidadeLeao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloCompatibilidadeLeao.setText("Leão");

        periodoLeao.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        periodoLeao.setText("Periodo:");

        elementoLeao.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        elementoLeao.setText("Elemento:");

        planetaLeao.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        planetaLeao.setText("Planeta Regente:");

        corLeao.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        corLeao.setText("Cor:");

        nSorteLeao.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        nSorteLeao.setText("Numero Da Sorte:");

        tfPeriodoLeao.setText("23/07 a 22/08");

        tfElementoLeao.setText("Fogo");

        tfPlanetaLeao.setText("Sol");

        tfCorLeao.setText("Dourado");

        tfNumeroLeao.setText("1");

        javax.swing.GroupLayout areaInformacoesLeaoLayout = new javax.swing.GroupLayout(areaInformacoesLeao);
        areaInformacoesLeao.setLayout(areaInformacoesLeaoLayout);
        areaInformacoesLeaoLayout.setHorizontalGroup(
            areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgSignoLeao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(periodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(tfPeriodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                            .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(planetaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(nSorteLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaLeao)
                                .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(tfNumeroLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesLeaoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                                    .addComponent(elementoLeao)
                                    .addGap(32, 32, 32)
                                    .addComponent(tfElementoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                                    .addComponent(corLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfCorLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tituloCompatibilidadeLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesLeaoLayout.setVerticalGroup(
            areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                .addComponent(imgSignoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloCompatibilidadeLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPeriodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfElementoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPlanetaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(tfCorLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nSorteLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumeroLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        leao.add(areaInformacoesLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 290, 560));

        tituloCaracteristicasLeao.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        tituloCaracteristicasLeao.setText("Características");

        pFortesLeao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pFortesLeao.setText("Pontos Fortes:");

        pMelhorarLeao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pMelhorarLeao.setText("Pontos a Melhorar:");

        txPFortesLeao.setColumns(20);
        txPFortesLeao.setRows(5);
        txPFortesLeao.setText("Confiante, criativo, generoso e possui espírito de liderança. Gosta de motivar as pessoas e costuma demonstrar entusiasmo quando acredita em algo.");
        jScrollPane22.setViewportView(txPFortesLeao);

        txPMelhorarLeao.setColumns(20);
        txPMelhorarLeao.setRows(5);
        txPMelhorarLeao.setText("Pode ser orgulhoso e gostar muito de reconhecimento. Precisa aprender a ouvir críticas, dividir a atenção e aceitar que nem sempre estará no centro das situações.");
        jScrollPane23.setViewportView(txPMelhorarLeao);

        javax.swing.GroupLayout areaCaracteristicasLeaoLayout = new javax.swing.GroupLayout(areaCaracteristicasLeao);
        areaCaracteristicasLeao.setLayout(areaCaracteristicasLeaoLayout);
        areaCaracteristicasLeaoLayout.setHorizontalGroup(
            areaCaracteristicasLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLeaoLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasLeaoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(areaCaracteristicasLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pFortesLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pMelhorarLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicasLeaoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(tituloCaracteristicasLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        areaCaracteristicasLeaoLayout.setVerticalGroup(
            areaCaracteristicasLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLeaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicasLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFortesLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        leao.add(areaCaracteristicasLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 390, 290));

        tituloEnergiaLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaLeao.setText("Energia Do Dia");

        amorLeao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amorLeao.setText("Amor:");

        trabalhoLeao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        trabalhoLeao.setText("Trabalho:");

        saudeLeao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saudeLeao.setText("Saúde:");

        sorteLeao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sorteLeao.setText("Sorte:");

        tfAmorLeao.setText("90%");

        tfTrabalhoLeao.setText("95%");

        tfSaudeLeao.setText("85%");
        tfSaudeLeao.addActionListener(this::tfSaudeLeaoActionPerformed);

        tfSorteLeao.setText("90%");

        javax.swing.GroupLayout areaEnergiaLeaoLayout = new javax.swing.GroupLayout(areaEnergiaLeao);
        areaEnergiaLeao.setLayout(areaEnergiaLeaoLayout);
        areaEnergiaLeaoLayout.setHorizontalGroup(
            areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfSaudeLeao, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                        .addComponent(tfTrabalhoLeao)
                        .addComponent(tfAmorLeao)
                        .addComponent(tituloEnergiaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(saudeLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(trabalhoLeao)
                        .addComponent(amorLeao)
                        .addComponent(tfSorteLeao))
                    .addComponent(sorteLeao))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        areaEnergiaLeaoLayout.setVerticalGroup(
            areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaLeao)
                .addGap(8, 8, 8)
                .addComponent(amorLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfTrabalhoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteLeao)
                .addGap(4, 4, 4)
                .addComponent(tfSorteLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        leao.add(areaEnergiaLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, 340, 290));

        tituloMensagemLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloMensagemLeao.setText("Mensagem Do Dia");

        txMensagemLeao.setColumns(20);
        txMensagemLeao.setRows(5);
        jScrollPane24.setViewportView(txMensagemLeao);

        btnCopiarMensagemLeao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopiarMensagemLeao.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemLeaoLayout = new javax.swing.GroupLayout(areaMensagemLeao);
        areaMensagemLeao.setLayout(areaMensagemLeaoLayout);
        areaMensagemLeaoLayout.setHorizontalGroup(
            areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemLeaoLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemLeaoLayout.createSequentialGroup()
                        .addComponent(btnCopiarMensagemLeao)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemLeaoLayout.createSequentialGroup()
                        .addComponent(tituloMensagemLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        areaMensagemLeaoLayout.setVerticalGroup(
            areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(tituloMensagemLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCopiarMensagemLeao)
                .addGap(20, 20, 20))
        );

        leao.add(areaMensagemLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 350, 340, 260));

        fundoimagemleao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagenfundo.png"))); // NOI18N
        leao.add(fundoimagemleao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));

        areaAbas.addTab("Leão", leao);

        virgem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaPrevisoesVirgem.setForeground(new java.awt.Color(255, 255, 255));

        previsaoVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoVirgem.setText("PREVISÃO DO DIA:");

        txPrevisaoVirgem.setColumns(20);
        txPrevisaoVirgem.setRows(5);
        jScrollPane25.setViewportView(txPrevisaoVirgem);

        btnAtualizarPrevisoesVirgem.setBackground(new java.awt.Color(102, 102, 255));
        btnAtualizarPrevisoesVirgem.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnAtualizarPrevisoesVirgem.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisoesVirgem.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoesVirgemLayout = new javax.swing.GroupLayout(areaPrevisoesVirgem);
        areaPrevisoesVirgem.setLayout(areaPrevisoesVirgemLayout);
        areaPrevisoesVirgemLayout.setHorizontalGroup(
            areaPrevisoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesVirgemLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(areaPrevisoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAtualizarPrevisoesVirgem)
                        .addGroup(areaPrevisoesVirgemLayout.createSequentialGroup()
                            .addComponent(previsaoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)))
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        areaPrevisoesVirgemLayout.setVerticalGroup(
            areaPrevisoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesVirgemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisoesVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        virgem.add(areaPrevisoesVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 390, 260));

        imgSignoVirgem.setIcon(new javax.swing.ImageIcon("C:\\Users\\GeovannaOliviera\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\virgem.jpg")); // NOI18N

        tituloCaracteristicaVirgem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloCaracteristicaVirgem.setText("Virgem");

        periodoVirgem.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        periodoVirgem.setText("Periodo:");

        elementoVirgem.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        elementoVirgem.setText("Elemento:");

        planetaVirgem.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        planetaVirgem.setText("Planeta Regente:");

        corVirgem.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        corVirgem.setText("Cor:");

        numeroVirgem.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        numeroVirgem.setText("Numero Da Sorte:");

        tfPeriodoVirgem.setText("23/08 a 22/09");

        tfElementoVirgem.setText("Terra");

        tfPlanetaVirgem.setText("Mercúrio");

        tfCorVirgem.setText("Verde");

        tfNumeroVirgem.setText("5");

        javax.swing.GroupLayout areaInformacoesVirgemLayout = new javax.swing.GroupLayout(areaInformacoesVirgem);
        areaInformacoesVirgem.setLayout(areaInformacoesVirgemLayout);
        areaInformacoesVirgemLayout.setHorizontalGroup(
            areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgSignoVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(periodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(tfPeriodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                            .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(planetaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(numeroVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaVirgem)
                                .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(tfNumeroVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesVirgemLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                                    .addComponent(elementoVirgem)
                                    .addGap(32, 32, 32)
                                    .addComponent(tfElementoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                                    .addComponent(corVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfCorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tituloCaracteristicaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesVirgemLayout.setVerticalGroup(
            areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                .addComponent(imgSignoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloCaracteristicaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPeriodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfElementoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPlanetaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(tfCorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumeroVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        virgem.add(areaInformacoesVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 290, 560));

        tituloCaracteristicasVirgem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        tituloCaracteristicasVirgem.setText("Características");

        pFortesVirgem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pFortesVirgem.setText("Pontos Fortes:");

        pMelhorarVirgem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pMelhorarVirgem.setText("Pontos a Melhorar:");

        txPFortesVirgem.setColumns(20);
        txPFortesVirgem.setRows(5);
        txPFortesVirgem.setText("É organizado, responsável, inteligente e cuidadoso. Tem atenção aos detalhes e costuma se esforçar para realizar suas tarefas da melhor maneira possível.");
        jScrollPane26.setViewportView(txPFortesVirgem);

        txPMelhorarVirgem.setColumns(20);
        txPMelhorarVirgem.setRows(5);
        txPMelhorarVirgem.setText("Pode ser perfeccionista e exigir demais de si mesmo e dos outros. Precisa aprender a aceitar erros, relaxar e entender que nem tudo precisa ser perfeito.");
        jScrollPane27.setViewportView(txPMelhorarVirgem);

        javax.swing.GroupLayout areaCaracteristicasVirgemLayout = new javax.swing.GroupLayout(areaCaracteristicasVirgem);
        areaCaracteristicasVirgem.setLayout(areaCaracteristicasVirgemLayout);
        areaCaracteristicasVirgemLayout.setHorizontalGroup(
            areaCaracteristicasVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasVirgemLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasVirgemLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(areaCaracteristicasVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pFortesVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pMelhorarVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicasVirgemLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(tituloCaracteristicasVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        areaCaracteristicasVirgemLayout.setVerticalGroup(
            areaCaracteristicasVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasVirgemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicasVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFortesVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        virgem.add(areaCaracteristicasVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 390, 310));

        tituloEnergiaVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaVirgem.setText("Energia Do Dia");

        amorVirgem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amorVirgem.setText("Amor:");

        trabalhoVirgem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        trabalhoVirgem.setText("Trabalho:");

        saudeVirgem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saudeVirgem.setText("Saúde:");

        sorteVirgem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sorteVirgem.setText("Sorte:");

        tfAmorVirgem.setText("80%");

        tfTrabalhoVirgem.setText("95%");

        tfSaudeVirgem.setText("90%");
        tfSaudeVirgem.addActionListener(this::tfSaudeVirgemActionPerformed);

        javax.swing.GroupLayout areaEnergiaVirgemLayout = new javax.swing.GroupLayout(areaEnergiaVirgem);
        areaEnergiaVirgem.setLayout(areaEnergiaVirgemLayout);
        areaEnergiaVirgemLayout.setHorizontalGroup(
            areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfSaudeVirgem, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                        .addComponent(tfTrabalhoVirgem)
                        .addComponent(tfAmorVirgem)
                        .addComponent(tituloEnergiaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfSorteVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(saudeVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(trabalhoVirgem)
                        .addComponent(amorVirgem))
                    .addComponent(sorteVirgem))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        areaEnergiaVirgemLayout.setVerticalGroup(
            areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaVirgem)
                .addGap(8, 8, 8)
                .addComponent(amorVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfTrabalhoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteVirgem)
                .addGap(4, 4, 4)
                .addComponent(tfSorteVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        virgem.add(areaEnergiaVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, 340, 290));

        tituloMensagemVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloMensagemVirgem.setText("Mensagem Do Dia");

        txMensagemVirgem.setColumns(20);
        txMensagemVirgem.setRows(5);
        jScrollPane28.setViewportView(txMensagemVirgem);

        btnCopiarMensagemVirgem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopiarMensagemVirgem.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemVirgemLayout = new javax.swing.GroupLayout(areaMensagemVirgem);
        areaMensagemVirgem.setLayout(areaMensagemVirgemLayout);
        areaMensagemVirgemLayout.setHorizontalGroup(
            areaMensagemVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemVirgemLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(areaMensagemVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloMensagemVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(areaMensagemVirgemLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnCopiarMensagemVirgem)))
                .addGap(17, 17, 17))
        );
        areaMensagemVirgemLayout.setVerticalGroup(
            areaMensagemVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemVirgemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiarMensagemVirgem)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        virgem.add(areaMensagemVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 350, 340, 200));

        fundoimagemvirgem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagenfundo.png"))); // NOI18N
        virgem.add(fundoimagemvirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));

        areaAbas.addTab("Virgem", virgem);

        libra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgSignoLibra.setIcon(new javax.swing.ImageIcon("C:\\Users\\GeovannaOliviera\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\libra.jpg")); // NOI18N

        tituloLibra.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloLibra.setText("Áries");

        periodoLibra.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        periodoLibra.setText("Periodo:");

        elementoLibra.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        elementoLibra.setText("Elemento:");

        planetaLibra.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        planetaLibra.setText("Planeta Regente:");

        corLibra.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        corLibra.setText("Cor:");

        numeroLibra.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        numeroLibra.setText("Numero Da Sorte:");

        tfPeriodoLibra.setText("23/09 a 22/10");

        tfElementoLibra.setText("Ar");
        tfElementoLibra.addActionListener(this::tfElementoLibraActionPerformed);

        tfPlanetaLibra.setText("Vênus");

        tfCorLibra.setText("Rosa");

        tfNumeroLibra.setText("6");

        javax.swing.GroupLayout areaInformacoesLibraLayout = new javax.swing.GroupLayout(areaInformacoesLibra);
        areaInformacoesLibra.setLayout(areaInformacoesLibraLayout);
        areaInformacoesLibraLayout.setHorizontalGroup(
            areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgSignoLibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                        .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfElementoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                                    .addComponent(planetaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfPlanetaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                                .addComponent(periodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfPeriodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                        .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(elementoLibra)
                            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                                .addComponent(corLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfCorLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                                .addComponent(numeroLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfNumeroLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tituloLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        areaInformacoesLibraLayout.setVerticalGroup(
            areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                .addComponent(imgSignoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(tituloLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPeriodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfElementoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPlanetaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(tfCorLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumeroLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        libra.add(areaInformacoesLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 340, 780));

        areaPrevisoesLibra.setForeground(new java.awt.Color(255, 255, 255));

        previsaoLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoLibra.setText("PREVISÃO DO DIA:");

        txPrevisaoLibra.setColumns(20);
        txPrevisaoLibra.setRows(5);
        jScrollPane29.setViewportView(txPrevisaoLibra);

        btnAtualizarPrevisoesLibra.setBackground(new java.awt.Color(102, 102, 255));
        btnAtualizarPrevisoesLibra.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnAtualizarPrevisoesLibra.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisoesLibra.setText("Atualizar Previsão");
        btnAtualizarPrevisoesLibra.addActionListener(this::btnAtualizarPrevisoesLibraActionPerformed);

        javax.swing.GroupLayout areaPrevisoesLibraLayout = new javax.swing.GroupLayout(areaPrevisoesLibra);
        areaPrevisoesLibra.setLayout(areaPrevisoesLibraLayout);
        areaPrevisoesLibraLayout.setHorizontalGroup(
            areaPrevisoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesLibraLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(btnAtualizarPrevisoesLibra)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(areaPrevisoesLibraLayout.createSequentialGroup()
                .addGroup(areaPrevisoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoesLibraLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisoesLibraLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(previsaoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        areaPrevisoesLibraLayout.setVerticalGroup(
            areaPrevisoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesLibraLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(previsaoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisoesLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        libra.add(areaPrevisoesLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 390, 260));

        tituloCaracteristicasLibra.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        tituloCaracteristicasLibra.setText("Características");

        pFortesLibra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pFortesLibra.setText("Pontos Fortes:");

        pMelhorarLibra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pMelhorarLibra.setText("Pontos a Melhorar:");

        txPFortesLibra.setColumns(20);
        txPFortesLibra.setRows(5);
        txPFortesLibra.setText("É educado, diplomático, sociável e busca manter a harmonia. Tem facilidade para compreender diferentes pontos de vista e costuma valorizar relacionamentos equilibrados.");
        jScrollPane30.setViewportView(txPFortesLibra);

        txPMelhorarLibra.setColumns(20);
        txPMelhorarLibra.setRows(5);
        txPMelhorarLibra.setText("Pode ter dificuldade para tomar decisões e evitar conflitos mesmo quando precisa se posicionar. Deve desenvolver mais confiança para expressar suas próprias opiniões.");
        jScrollPane31.setViewportView(txPMelhorarLibra);

        javax.swing.GroupLayout areaCaracteristicasLibraLayout = new javax.swing.GroupLayout(areaCaracteristicasLibra);
        areaCaracteristicasLibra.setLayout(areaCaracteristicasLibraLayout);
        areaCaracteristicasLibraLayout.setHorizontalGroup(
            areaCaracteristicasLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLibraLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasLibraLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(areaCaracteristicasLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pFortesLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pMelhorarLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicasLibraLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(tituloCaracteristicasLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        areaCaracteristicasLibraLayout.setVerticalGroup(
            areaCaracteristicasLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicasLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFortesLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        libra.add(areaCaracteristicasLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 390, 300));

        tituloEnergiaLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaLibra.setText("Energia Do Dia");

        amorLibra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amorLibra.setText("Amor:");

        trabalhoLibra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        trabalhoLibra.setText("Trabalho:");

        saudeLibra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saudeLibra.setText("Saúde:");

        sorteLibra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sorteLibra.setText("Sorte:");

        tfAmorLibra.setText("95%");

        tfTrabalhoLibra.setText("85%");
        tfTrabalhoLibra.addActionListener(this::tfTrabalhoLibraActionPerformed);

        tfSaudeLibra.setText("85%");
        tfSaudeLibra.addActionListener(this::tfSaudeLibraActionPerformed);

        tfSorteLibra.setText("90%");

        javax.swing.GroupLayout areaEnergiaLibraLayout = new javax.swing.GroupLayout(areaEnergiaLibra);
        areaEnergiaLibra.setLayout(areaEnergiaLibraLayout);
        areaEnergiaLibraLayout.setHorizontalGroup(
            areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfSaudeLibra, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                        .addComponent(tfTrabalhoLibra)
                        .addComponent(tfAmorLibra)
                        .addComponent(tituloEnergiaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfSorteLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(saudeLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(trabalhoLibra)
                        .addComponent(amorLibra))
                    .addComponent(sorteLibra))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        areaEnergiaLibraLayout.setVerticalGroup(
            areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaLibra)
                .addGap(8, 8, 8)
                .addComponent(amorLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfTrabalhoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteLibra)
                .addGap(4, 4, 4)
                .addComponent(tfSorteLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        libra.add(areaEnergiaLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 100, 340, 290));

        tituloMensagemLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloMensagemLibra.setText("Mensagem Do Dia");

        txMensagemLibra.setColumns(20);
        txMensagemLibra.setRows(5);
        jScrollPane32.setViewportView(txMensagemLibra);

        btnCopiarMensagemLibra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopiarMensagemLibra.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemLibraLayout = new javax.swing.GroupLayout(areaMensagemLibra);
        areaMensagemLibra.setLayout(areaMensagemLibraLayout);
        areaMensagemLibraLayout.setHorizontalGroup(
            areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemLibraLayout.createSequentialGroup()
                        .addComponent(btnCopiarMensagemLibra)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemLibraLayout.createSequentialGroup()
                        .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemLibraLayout.createSequentialGroup()
                        .addComponent(tituloMensagemLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
        );
        areaMensagemLibraLayout.setVerticalGroup(
            areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(tituloMensagemLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiarMensagemLibra)
                .addGap(25, 25, 25))
        );

        libra.add(areaMensagemLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 490, 360, 260));

        fundoimagemlibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagenfundo.png"))); // NOI18N
        libra.add(fundoimagemlibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));

        areaAbas.addTab("Libra", libra);

        iscorpiao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgSignoEscorpiao.setIcon(new javax.swing.ImageIcon("C:\\Users\\GeovannaOliviera\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\escorpiao.jpg")); // NOI18N

        tituloEscorpiao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloEscorpiao.setText("Escorpião");

        periodoEscorpiao.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        periodoEscorpiao.setText("Periodo:");

        elementoEscorpiao.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        elementoEscorpiao.setText("Elemento:");

        planetaEscorpiao.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        planetaEscorpiao.setText("Planeta Regente:");

        corEscorpiao.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        corEscorpiao.setText("Cor:");

        numeroEscorpiao.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        numeroEscorpiao.setText("Numero Da Sorte:");

        tfPeriodoEscorpiao.setText("23/10");

        tfElementoEscorpiao.setText("Água");

        tfPlanetaEscorpiao.setText("Plutão");

        tfCorEscorpiao.setText("Vermelho escuro");

        tfNumeroEscorpiao.setText("8");

        javax.swing.GroupLayout areaInformacoesEscorpiaoLayout = new javax.swing.GroupLayout(areaInformacoesEscorpiao);
        areaInformacoesEscorpiao.setLayout(areaInformacoesEscorpiaoLayout);
        areaInformacoesEscorpiaoLayout.setHorizontalGroup(
            areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                        .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(planetaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(numeroEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPlanetaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNumeroEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                                .addComponent(corEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfCorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                                .addComponent(elementoEscorpiao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfElementoEscorpiao))
                            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                                .addComponent(periodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPeriodoEscorpiao)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(imgSignoEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tituloEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesEscorpiaoLayout.setVerticalGroup(
            areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addComponent(imgSignoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPeriodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfElementoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPlanetaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corEscorpiao, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(tfCorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumeroEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        iscorpiao.add(areaInformacoesEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 290, 560));

        tituloCaracteristicasEscorpiao.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        tituloCaracteristicasEscorpiao.setText("Características");

        pFortesEscorpiao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pFortesEscorpiao.setText("Pontos Fortes:");

        pMelhorarEscorpiao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pMelhorarEscorpiao.setText("Pontos a Melhorar:");

        txPFortesEscorpiao.setColumns(20);
        txPFortesEscorpiao.setRows(5);
        txPFortesEscorpiao.setText("É determinado, intenso, corajoso e leal. Quando estabelece um objetivo, costuma se dedicar profundamente e não desiste facilmente.");
        jScrollPane97.setViewportView(txPFortesEscorpiao);

        txPMelhorarEscorpiao.setColumns(20);
        txPMelhorarEscorpiao.setRows(5);
        txPMelhorarEscorpiao.setText("Pode ser desconfiado, ciumento e guardar ressentimentos. Precisa aprender a confiar mais, controlar emoções intensas e deixar algumas situações para trás.");
        jScrollPane98.setViewportView(txPMelhorarEscorpiao);

        javax.swing.GroupLayout areaCaracteristicasEscorpiaoLayout = new javax.swing.GroupLayout(areaCaracteristicasEscorpiao);
        areaCaracteristicasEscorpiao.setLayout(areaCaracteristicasEscorpiaoLayout);
        areaCaracteristicasEscorpiaoLayout.setHorizontalGroup(
            areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pFortesEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pMelhorarEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(tituloCaracteristicasEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        areaCaracteristicasEscorpiaoLayout.setVerticalGroup(
            areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicasEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFortesEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        iscorpiao.add(areaCaracteristicasEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 390, 290));

        areaPrevisoesEscorpiao.setForeground(new java.awt.Color(255, 255, 255));

        previsaoEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoEscorpiao.setText("PREVISÃO DO DIA:");

        txPrevisaoEscorpiao.setColumns(20);
        txPrevisaoEscorpiao.setRows(5);
        jScrollPane99.setViewportView(txPrevisaoEscorpiao);

        btnAtualizarPrevisoesEscorpiao.setBackground(new java.awt.Color(102, 102, 255));
        btnAtualizarPrevisoesEscorpiao.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnAtualizarPrevisoesEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisoesEscorpiao.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoesEscorpiaoLayout = new javax.swing.GroupLayout(areaPrevisoesEscorpiao);
        areaPrevisoesEscorpiao.setLayout(areaPrevisoesEscorpiaoLayout);
        areaPrevisoesEscorpiaoLayout.setHorizontalGroup(
            areaPrevisoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesEscorpiaoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(areaPrevisoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAtualizarPrevisoesEscorpiao)
                        .addGroup(areaPrevisoesEscorpiaoLayout.createSequentialGroup()
                            .addComponent(previsaoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)))
                    .addComponent(jScrollPane99, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        areaPrevisoesEscorpiaoLayout.setVerticalGroup(
            areaPrevisoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane99, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisoesEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        iscorpiao.add(areaPrevisoesEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 390, 260));

        tituloEnergiaEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaEscorpiao.setText("Energia Do Dia");

        amorEscorpiao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amorEscorpiao.setText("Amor:");

        trabalhoEscorpiao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        trabalhoEscorpiao.setText("Trabalho:");

        saudeEscorpiao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saudeEscorpiao.setText("Saúde:");

        sorteEscorpiao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sorteEscorpiao.setText("Sorte:");

        tfAmorEscorpiao.setText("90%");

        tfTrabalhoEscorpiao.setText("95%");
        tfTrabalhoEscorpiao.addActionListener(this::tfTrabalhoEscorpiaoActionPerformed);

        tfSaudeEscorpiao.setText("85%");
        tfSaudeEscorpiao.addActionListener(this::tfSaudeEscorpiaoActionPerformed);

        tfSorteEscorpiao.setText("90%");
        tfSorteEscorpiao.addActionListener(this::tfSorteEscorpiaoActionPerformed);

        javax.swing.GroupLayout areaEnergiaEscorpiaoLayout = new javax.swing.GroupLayout(areaEnergiaEscorpiao);
        areaEnergiaEscorpiao.setLayout(areaEnergiaEscorpiaoLayout);
        areaEnergiaEscorpiaoLayout.setHorizontalGroup(
            areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTrabalhoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saudeEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSaudeEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sorteEscorpiao)
                    .addComponent(tituloEnergiaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amorEscorpiao)
                    .addComponent(tfAmorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trabalhoEscorpiao)
                    .addComponent(tfSorteEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        areaEnergiaEscorpiaoLayout.setVerticalGroup(
            areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                        .addComponent(tituloEnergiaEscorpiao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amorEscorpiao)
                        .addGap(2, 2, 2)
                        .addComponent(tfAmorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trabalhoEscorpiao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfTrabalhoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saudeEscorpiao)
                        .addGap(28, 28, 28))
                    .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tfSaudeEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addComponent(sorteEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        iscorpiao.add(areaEnergiaEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, 340, 290));

        tituloMensagemEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloMensagemEscorpiao.setText("Mensagem Do Dia");

        txMensagemEscorpiao.setColumns(20);
        txMensagemEscorpiao.setRows(5);
        jScrollPane100.setViewportView(txMensagemEscorpiao);

        btnCopiarMensagemEscorpiao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopiarMensagemEscorpiao.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemEscoripiaoLayout = new javax.swing.GroupLayout(areaMensagemEscoripiao);
        areaMensagemEscoripiao.setLayout(areaMensagemEscoripiaoLayout);
        areaMensagemEscoripiaoLayout.setHorizontalGroup(
            areaMensagemEscoripiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemEscoripiaoLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(areaMensagemEscoripiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane100, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloMensagemEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(areaMensagemEscoripiaoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnCopiarMensagemEscorpiao)))
                .addGap(17, 17, 17))
        );
        areaMensagemEscoripiaoLayout.setVerticalGroup(
            areaMensagemEscoripiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemEscoripiaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane100, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiarMensagemEscorpiao)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        iscorpiao.add(areaMensagemEscoripiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 350, 340, 260));

        fundoImagemEscorpiao.setIcon(new javax.swing.ImageIcon("C:\\Users\\GeovannaOliviera\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\imagenfundo.png")); // NOI18N
        iscorpiao.add(fundoImagemEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 890));

        areaAbas.addTab("Escorpião", iscorpiao);

        sagitario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgSignoSagitario.setIcon(new javax.swing.ImageIcon("C:\\Users\\GeovannaOliviera\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\sagitario.jpg")); // NOI18N

        tituloSagitario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloSagitario.setText("Sagitário");

        periodoSagitario.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        periodoSagitario.setText("Periodo:");

        elementoSagitario.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        elementoSagitario.setText("Elemento:");

        planetaSagitario.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        planetaSagitario.setText("Planeta Regente:");

        corSagitario.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        corSagitario.setText("Cor:");

        numeroSagitario.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        numeroSagitario.setText("Numero Da Sorte:");

        tfPeriodoSagitario.setText("22/11 a 21/12");

        tfElementoSagitario.setText("Fogo");

        tfPlanetaSagitario.setText("Júpter");

        tfCorSagitario.setText("Roxo");

        tfNumeroSagitario.setText("3");

        javax.swing.GroupLayout areaInformacoesSagitarioLayout = new javax.swing.GroupLayout(areaInformacoesSagitario);
        areaInformacoesSagitario.setLayout(areaInformacoesSagitarioLayout);
        areaInformacoesSagitarioLayout.setHorizontalGroup(
            areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgSignoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesSagitarioLayout.createSequentialGroup()
                        .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(planetaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(numeroSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPlanetaSagitario)
                            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tfNumeroSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                                .addComponent(periodoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(tfPeriodoSagitario))
                            .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                                    .addComponent(elementoSagitario)
                                    .addGap(32, 32, 32)
                                    .addComponent(tfElementoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                                    .addComponent(corSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfCorSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tituloSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesSagitarioLayout.setVerticalGroup(
            areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                .addComponent(imgSignoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPeriodoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfElementoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPlanetaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(tfCorSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumeroSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        sagitario.add(areaInformacoesSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 290, 560));

        areaPrevisoesSagitario.setForeground(new java.awt.Color(255, 255, 255));

        previsaoSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoSagitario.setText("PREVISÃO DO DIA:");

        txPrevisaoSagitario.setColumns(20);
        txPrevisaoSagitario.setRows(5);
        jScrollPane37.setViewportView(txPrevisaoSagitario);

        btnAtualizarPrevisoesSagitario.setBackground(new java.awt.Color(102, 102, 255));
        btnAtualizarPrevisoesSagitario.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnAtualizarPrevisoesSagitario.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisoesSagitario.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoesSagitarioLayout = new javax.swing.GroupLayout(areaPrevisoesSagitario);
        areaPrevisoesSagitario.setLayout(areaPrevisoesSagitarioLayout);
        areaPrevisoesSagitarioLayout.setHorizontalGroup(
            areaPrevisoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesSagitarioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(areaPrevisoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAtualizarPrevisoesSagitario)
                        .addGroup(areaPrevisoesSagitarioLayout.createSequentialGroup()
                            .addComponent(previsaoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)))
                    .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        areaPrevisoesSagitarioLayout.setVerticalGroup(
            areaPrevisoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisoesSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        sagitario.add(areaPrevisoesSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 390, 260));

        tituloCaracteristicasSagitario.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        tituloCaracteristicasSagitario.setText("Características");

        pFortesSagitario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pFortesSagitario.setText("Pontos Fortes:");

        pMelhorarSagitario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pMelhorarSagitario.setText("Pontos a Melhorar:");

        txPFortesSagitario.setColumns(20);
        txPFortesSagitario.setRows(5);
        txPFortesSagitario.setText("É otimista, aventureiro, sincero e muito interessado em conhecer coisas novas. Gosta de liberdade, experiências diferentes e costuma enxergar possibilidades mesmo diante de dificuldades.");
        jScrollPane38.setViewportView(txPFortesSagitario);

        txPMelhorarSagitario.setColumns(20);
        txPMelhorarSagitario.setRows(5);
        txPMelhorarSagitario.setText("Pode agir sem pensar, exagerar nas palavras ou perder a paciência com limitações. Precisa desenvolver mais responsabilidade, planejamento e cuidado ao falar.");
        jScrollPane39.setViewportView(txPMelhorarSagitario);

        javax.swing.GroupLayout areaCaracteristicasSagitarioLayout = new javax.swing.GroupLayout(areaCaracteristicasSagitario);
        areaCaracteristicasSagitario.setLayout(areaCaracteristicasSagitarioLayout);
        areaCaracteristicasSagitarioLayout.setHorizontalGroup(
            areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasSagitarioLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasSagitarioLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pFortesSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pMelhorarSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicasSagitarioLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(tituloCaracteristicasSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        areaCaracteristicasSagitarioLayout.setVerticalGroup(
            areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicasSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFortesSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sagitario.add(areaCaracteristicasSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 390, 290));

        tituloEnergiaSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaSagitario.setText("Energia Do Dia");

        amorSagitario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amorSagitario.setText("Amor:");

        trabalhoSagitario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        trabalhoSagitario.setText("Trabalho:");

        saudeSagitario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saudeSagitario.setText("Saúde:");

        sorteSagitario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sorteSagitario.setText("Sorte:");

        tfAmorSagitario.setText("85%");

        tfTrabalhoSagitario.setText("90%");

        tfSaudeSagitario.setText("85%");
        tfSaudeSagitario.addActionListener(this::tfSaudeSagitarioActionPerformed);

        tfSorteSagitario.setText("95%");
        tfSorteSagitario.addActionListener(this::tfSorteSagitarioActionPerformed);

        javax.swing.GroupLayout areaEnergiaSagitarioLayout = new javax.swing.GroupLayout(areaEnergiaSagitario);
        areaEnergiaSagitario.setLayout(areaEnergiaSagitarioLayout);
        areaEnergiaSagitarioLayout.setHorizontalGroup(
            areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfTrabalhoSagitario, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                        .addComponent(tfAmorSagitario)
                        .addComponent(tituloEnergiaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfSorteSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(trabalhoSagitario)
                        .addComponent(amorSagitario))
                    .addComponent(saudeSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSaudeSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sorteSagitario))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        areaEnergiaSagitarioLayout.setVerticalGroup(
            areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaSagitario)
                .addGap(8, 8, 8)
                .addComponent(amorSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfTrabalhoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteSagitario)
                .addGap(10, 10, 10)
                .addComponent(tfSorteSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        sagitario.add(areaEnergiaSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, 340, 290));

        tituloMensagemSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloMensagemSagitario.setText("Mensagem Do Dia");

        txMensagemSagitario.setColumns(20);
        txMensagemSagitario.setRows(5);
        jScrollPane40.setViewportView(txMensagemSagitario);

        btnCopiarMensagemSagitario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopiarMensagemSagitario.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemSagitarioLayout = new javax.swing.GroupLayout(areaMensagemSagitario);
        areaMensagemSagitario.setLayout(areaMensagemSagitarioLayout);
        areaMensagemSagitarioLayout.setHorizontalGroup(
            areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemSagitarioLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloMensagemSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnCopiarMensagemSagitario)))
                .addGap(17, 17, 17))
        );
        areaMensagemSagitarioLayout.setVerticalGroup(
            areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiarMensagemSagitario)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        sagitario.add(areaMensagemSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 350, 340, 260));

        fundoimagemsagitario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagenfundo.png"))); // NOI18N
        sagitario.add(fundoimagemsagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));

        areaAbas.addTab("Sagitário", sagitario);

        capricornio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaPrevisoesCapricornio.setForeground(new java.awt.Color(255, 255, 255));

        previsaoCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoCapricornio.setText("PREVISÃO DO DIA:");

        txPrevisaoCapricornio.setColumns(20);
        txPrevisaoCapricornio.setRows(5);
        jScrollPane5.setViewportView(txPrevisaoCapricornio);

        btnAtualizarPrevisoesCapricornio.setBackground(new java.awt.Color(102, 102, 255));
        btnAtualizarPrevisoesCapricornio.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnAtualizarPrevisoesCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisoesCapricornio.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoesCapricornioLayout = new javax.swing.GroupLayout(areaPrevisoesCapricornio);
        areaPrevisoesCapricornio.setLayout(areaPrevisoesCapricornioLayout);
        areaPrevisoesCapricornioLayout.setHorizontalGroup(
            areaPrevisoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesCapricornioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(areaPrevisoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAtualizarPrevisoesCapricornio)
                        .addGroup(areaPrevisoesCapricornioLayout.createSequentialGroup()
                            .addComponent(previsaoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        areaPrevisoesCapricornioLayout.setVerticalGroup(
            areaPrevisoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisoesCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        capricornio.add(areaPrevisoesCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 390, 260));

        imgSignoCapricornio.setIcon(new javax.swing.ImageIcon("C:\\Users\\GeovannaOliviera\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\capricornio.jpg")); // NOI18N

        tituloCapricornio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloCapricornio.setText("Capricórnio");

        periodoCapricornio.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        periodoCapricornio.setText("Periodo:");

        elementoCapricornio.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        elementoCapricornio.setText("Elemento:");

        planetaCapricornio.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        planetaCapricornio.setText("Planeta Regente:");

        corCapricornio.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        corCapricornio.setText("Cor:");

        numeroCapricornio.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        numeroCapricornio.setText("Numero Da Sorte:");

        tfPeriodoCapricornio.setText("22/12 a 19/01");

        tfElementoCapricornio.setText("Terra");

        tfPlanetaCapricornio.setText("Saturno");

        tfCorCapricornio.setText("Marrom e preto");

        tfNumeroCapricornio.setText("3");
        tfNumeroCapricornio.addActionListener(this::tfNumeroCapricornioActionPerformed);

        javax.swing.GroupLayout areaInformacoesCapricornioLayout = new javax.swing.GroupLayout(areaInformacoesCapricornio);
        areaInformacoesCapricornio.setLayout(areaInformacoesCapricornioLayout);
        areaInformacoesCapricornioLayout.setHorizontalGroup(
            areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgSignoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(periodoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(tfPeriodoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                            .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(planetaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(numeroCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPlanetaCapricornio)
                                .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(tfNumeroCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaInformacoesCapricornioLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                                    .addComponent(elementoCapricornio)
                                    .addGap(32, 32, 32)
                                    .addComponent(tfElementoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                                    .addComponent(corCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfCorCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tituloCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesCapricornioLayout.setVerticalGroup(
            areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                .addComponent(imgSignoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPeriodoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfElementoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPlanetaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(tfCorCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumeroCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        capricornio.add(areaInformacoesCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 300, 580));

        tituloCaracteristicasCapricornio.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        tituloCaracteristicasCapricornio.setText("Características");

        pFortesCapricornio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pFortesCapricornio.setText("Pontos Fortes:");

        pMelhorarCapricornio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pMelhorarCapricornio.setText("Pontos a Melhorar:");

        txPFortesCapricornio.setColumns(20);
        txPFortesCapricornio.setRows(5);
        txPFortesCapricornio.setText("É disciplinado, responsável, trabalhador e persistente. Costuma estabelecer objetivos claros e trabalhar com dedicação para alcançar estabilidade e sucesso.");
        jScrollPane6.setViewportView(txPFortesCapricornio);

        txPMelhorarCapricornio.setColumns(20);
        txPMelhorarCapricornio.setRows(5);
        txPMelhorarCapricornio.setText("Pode ser muito rígido consigo mesmo e trabalhar além do necessário. Precisa aprender a descansar, aceitar imprevistos e demonstrar mais seus sentimentos.");
        jScrollPane7.setViewportView(txPMelhorarCapricornio);

        javax.swing.GroupLayout areaCaracteristicaCapricornioLayout = new javax.swing.GroupLayout(areaCaracteristicaCapricornio);
        areaCaracteristicaCapricornio.setLayout(areaCaracteristicaCapricornioLayout);
        areaCaracteristicaCapricornioLayout.setHorizontalGroup(
            areaCaracteristicaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaCapricornioLayout.createSequentialGroup()
                .addGroup(areaCaracteristicaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicaCapricornioLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(areaCaracteristicaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pFortesCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pMelhorarCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicaCapricornioLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(tituloCaracteristicasCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        areaCaracteristicaCapricornioLayout.setVerticalGroup(
            areaCaracteristicaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicaCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicasCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFortesCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        capricornio.add(areaCaracteristicaCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 390, 290));

        tituloEnergiaCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaCapricornio.setText("Energia Do Dia");

        amorCapricornio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amorCapricornio.setText("Amor:");

        trabalhoCapricornio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        trabalhoCapricornio.setText("Trabalho:");

        saudeCapricornio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saudeCapricornio.setText("Saúde:");

        sorteCapricornio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sorteCapricornio.setText("Sorte:");

        tfAmorCapricornio.setText("80%");

        tfTrabalhoCapricornio.setText("95%");

        tfSaudeCapricornio.setText("85%");
        tfSaudeCapricornio.addActionListener(this::tfSaudeCapricornioActionPerformed);

        tfSorteCapricornio.setText("85%");

        javax.swing.GroupLayout areaEnergiaCapricornioLayout = new javax.swing.GroupLayout(areaEnergiaCapricornio);
        areaEnergiaCapricornio.setLayout(areaEnergiaCapricornioLayout);
        areaEnergiaCapricornioLayout.setHorizontalGroup(
            areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfSaudeCapricornio, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                        .addComponent(tfTrabalhoCapricornio)
                        .addComponent(tfAmorCapricornio)
                        .addComponent(tituloEnergiaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfSorteCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(saudeCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(trabalhoCapricornio)
                        .addComponent(amorCapricornio))
                    .addComponent(sorteCapricornio))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        areaEnergiaCapricornioLayout.setVerticalGroup(
            areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaCapricornio)
                .addGap(8, 8, 8)
                .addComponent(amorCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfTrabalhoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteCapricornio)
                .addGap(4, 4, 4)
                .addComponent(tfSorteCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        capricornio.add(areaEnergiaCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, 340, 290));

        tituloMensagemCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloMensagemCapricornio.setText("Mensagem Do Dia");

        txMensagemCapricornio.setColumns(20);
        txMensagemCapricornio.setRows(5);
        jScrollPane8.setViewportView(txMensagemCapricornio);

        btnCopiarMensagemCapricornio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopiarMensagemCapricornio.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemCapricornioLayout = new javax.swing.GroupLayout(areaMensagemCapricornio);
        areaMensagemCapricornio.setLayout(areaMensagemCapricornioLayout);
        areaMensagemCapricornioLayout.setHorizontalGroup(
            areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemCapricornioLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloMensagemCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(areaMensagemCapricornioLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnCopiarMensagemCapricornio)))
                .addGap(17, 17, 17))
        );
        areaMensagemCapricornioLayout.setVerticalGroup(
            areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCapricornioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiarMensagemCapricornio)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        capricornio.add(areaMensagemCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 350, 340, 260));

        fundoimagemcapricornio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagenfundo.png"))); // NOI18N
        capricornio.add(fundoimagemcapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));

        areaAbas.addTab("Capricórnio", capricornio);

        aquario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaPrevisoesAquario.setForeground(new java.awt.Color(255, 255, 255));

        previsaoAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoAquario.setText("PREVISÃO DO DIA:");

        txPrevisaoAquario.setColumns(20);
        txPrevisaoAquario.setRows(5);
        jScrollPane41.setViewportView(txPrevisaoAquario);

        btnAtualizarPrevisoesAquario.setBackground(new java.awt.Color(102, 102, 255));
        btnAtualizarPrevisoesAquario.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnAtualizarPrevisoesAquario.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisoesAquario.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoesAquarioLayout = new javax.swing.GroupLayout(areaPrevisoesAquario);
        areaPrevisoesAquario.setLayout(areaPrevisoesAquarioLayout);
        areaPrevisoesAquarioLayout.setHorizontalGroup(
            areaPrevisoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesAquarioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(areaPrevisoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAtualizarPrevisoesAquario)
                        .addGroup(areaPrevisoesAquarioLayout.createSequentialGroup()
                            .addComponent(previsaoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)))
                    .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        areaPrevisoesAquarioLayout.setVerticalGroup(
            areaPrevisoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisoesAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        aquario.add(areaPrevisoesAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 390, 260));

        imgSignoAquario.setIcon(new javax.swing.ImageIcon("C:\\Users\\GeovannaOliviera\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\aquario.jpg")); // NOI18N

        tituloAquario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloAquario.setText("Aquário");

        periodoAquario.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        periodoAquario.setText("Periodo:");

        elementoAquario.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        elementoAquario.setText("Elemento:");

        planetaAquario.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        planetaAquario.setText("Planeta Regente:");

        corAquario.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        corAquario.setText("Cor:");

        numeroAquario.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        numeroAquario.setText("Numero Da Sorte:");

        tfPeriodoAquario.setText("20/01 a 18/02");
        tfPeriodoAquario.addActionListener(this::tfPeriodoAquarioActionPerformed);

        tfElementoAquario.setText("Ar");

        tfPlanetaAquario.setText("Urano");

        tfCorAquario.setText("Azul");

        tfNumeroAquario.setText("4");

        javax.swing.GroupLayout areaInformacoesAquarioLayout = new javax.swing.GroupLayout(areaInformacoesAquario);
        areaInformacoesAquario.setLayout(areaInformacoesAquarioLayout);
        areaInformacoesAquarioLayout.setHorizontalGroup(
            areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgSignoAquario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesAquarioLayout.createSequentialGroup()
                        .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(planetaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(numeroAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPlanetaAquario)
                            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tfNumeroAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                                .addComponent(periodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(tfPeriodoAquario))
                            .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                                    .addComponent(elementoAquario)
                                    .addGap(32, 32, 32)
                                    .addComponent(tfElementoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                                    .addComponent(corAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfCorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tituloAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesAquarioLayout.setVerticalGroup(
            areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                .addComponent(imgSignoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPeriodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfElementoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPlanetaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(tfCorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumeroAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        aquario.add(areaInformacoesAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 300, 620));

        tituloCaracteristicasAquario.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        tituloCaracteristicasAquario.setText("Características");

        pForesAquario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pForesAquario.setText("Pontos Fortes:");

        pMelhorarAquario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pMelhorarAquario.setText("Pontos a Melhorar:");

        txPFortesAquario.setColumns(20);
        txPFortesAquario.setRows(5);
        txPFortesAquario.setText("É criativo, independente, original e gosta de novas ideias. Costuma pensar de maneira diferente e valoriza a liberdade para desenvolver seus próprios projetos.");
        jScrollPane42.setViewportView(txPFortesAquario);

        txPMelhorarAquario.setColumns(20);
        txPMelhorarAquario.setRows(5);
        txPMelhorarAquario.setText("Pode parecer distante emocionalmente e ser bastante teimoso em suas opiniões. Precisa aprender a considerar melhor os sentimentos dos outros e ser mais flexível.");
        jScrollPane43.setViewportView(txPMelhorarAquario);

        javax.swing.GroupLayout areaCaracteristicasAquarioLayout = new javax.swing.GroupLayout(areaCaracteristicasAquario);
        areaCaracteristicasAquario.setLayout(areaCaracteristicasAquarioLayout);
        areaCaracteristicasAquarioLayout.setHorizontalGroup(
            areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pForesAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pMelhorarAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(tituloCaracteristicasAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        areaCaracteristicasAquarioLayout.setVerticalGroup(
            areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicasAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pForesAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aquario.add(areaCaracteristicasAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 390, 290));

        tituloEnergiaAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaAquario.setText("Energia Do Dia");

        amorAquario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amorAquario.setText("Amor:");

        trabalhoAquario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        trabalhoAquario.setText("Trabalho:");

        saudeAquario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saudeAquario.setText("Saúde:");

        sorteAquario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sorteAquario.setText("Sorte:");

        tfAmorAquario.setText("80%");

        tfTrabalhoAquario.setText("90%");

        tfSaudeAquario.setText("85%");
        tfSaudeAquario.addActionListener(this::tfSaudeAquarioActionPerformed);

        tfSorteAquario.setText("90%");

        javax.swing.GroupLayout areaEnergiaAquarioLayout = new javax.swing.GroupLayout(areaEnergiaAquario);
        areaEnergiaAquario.setLayout(areaEnergiaAquarioLayout);
        areaEnergiaAquarioLayout.setHorizontalGroup(
            areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfSaudeAquario, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                        .addComponent(tfTrabalhoAquario)
                        .addComponent(tfAmorAquario)
                        .addComponent(tituloEnergiaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(saudeAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(trabalhoAquario)
                        .addComponent(amorAquario)
                        .addComponent(tfSorteAquario))
                    .addComponent(sorteAquario))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        areaEnergiaAquarioLayout.setVerticalGroup(
            areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaAquario)
                .addGap(8, 8, 8)
                .addComponent(amorAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trabalhoAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfTrabalhoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudeAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteAquario)
                .addGap(4, 4, 4)
                .addComponent(tfSorteAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        aquario.add(areaEnergiaAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, 340, 290));

        tituloMensagemAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloMensagemAquario.setText("Mensagem Do Dia");

        txMensagemAquario.setColumns(20);
        txMensagemAquario.setRows(5);
        jScrollPane44.setViewportView(txMensagemAquario);

        btnCopiarMensagemAquario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopiarMensagemAquario.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemAquarioLayout = new javax.swing.GroupLayout(areaMensagemAquario);
        areaMensagemAquario.setLayout(areaMensagemAquarioLayout);
        areaMensagemAquarioLayout.setHorizontalGroup(
            areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemAquarioLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloMensagemAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnCopiarMensagemAquario)))
                .addGap(17, 17, 17))
        );
        areaMensagemAquarioLayout.setVerticalGroup(
            areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiarMensagemAquario)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        aquario.add(areaMensagemAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 350, 340, 260));

        fundoimagemaquario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagenfundo.png"))); // NOI18N
        aquario.add(fundoimagemaquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));

        areaAbas.addTab("Aquário", aquario);

        peixes.setBackground(new java.awt.Color(255, 255, 255));
        peixes.setForeground(new java.awt.Color(255, 255, 204));
        peixes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaPrevisoesPeixe.setForeground(new java.awt.Color(255, 255, 255));

        previsaoPeixe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        previsaoPeixe.setText("PREVISÃO DO DIA:");

        txPrevisaoPeixes.setColumns(20);
        txPrevisaoPeixes.setRows(5);
        jScrollPane45.setViewportView(txPrevisaoPeixes);

        btnAtualizarPrevisoesPeixe.setBackground(new java.awt.Color(102, 102, 255));
        btnAtualizarPrevisoesPeixe.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnAtualizarPrevisoesPeixe.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPrevisoesPeixe.setText("Atualizar Previsão");

        javax.swing.GroupLayout areaPrevisoesPeixeLayout = new javax.swing.GroupLayout(areaPrevisoesPeixe);
        areaPrevisoesPeixe.setLayout(areaPrevisoesPeixeLayout);
        areaPrevisoesPeixeLayout.setHorizontalGroup(
            areaPrevisoesPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesPeixeLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(areaPrevisoesPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisoesPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAtualizarPrevisoesPeixe)
                        .addGroup(areaPrevisoesPeixeLayout.createSequentialGroup()
                            .addComponent(previsaoPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)))
                    .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        areaPrevisoesPeixeLayout.setVerticalGroup(
            areaPrevisoesPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisoesPeixeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previsaoPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizarPrevisoesPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        peixes.add(areaPrevisoesPeixe, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 390, 260));

        imgSignoPeixes.setIcon(new javax.swing.ImageIcon("C:\\Users\\GeovannaOliviera\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Peixes.jpg")); // NOI18N

        tituloPeixe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloPeixe.setText("Peixes");

        periodoPeixe.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        periodoPeixe.setText("Periodo:");

        elementoPeixe.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        elementoPeixe.setText("Elemento:");

        planetaPeixe.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        planetaPeixe.setText("Planeta Regente:");

        corPeixe.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        corPeixe.setText("Cor:");

        numeroPeixe.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        numeroPeixe.setText("Numero Da Sorte:");

        tfPeriodoPeixe.setText("19/02 a 20/03");
        tfPeriodoPeixe.addActionListener(this::tfPeriodoPeixeActionPerformed);

        tfElementoPeixe.setText("Água");

        tfPlanetaPeixe.setText("Neturno");

        tfCorPeixe.setText("Azul-claro");

        tfNumeroPeixe.setText("7");

        javax.swing.GroupLayout areaInformacoesPeixeLayout = new javax.swing.GroupLayout(areaInformacoesPeixe);
        areaInformacoesPeixe.setLayout(areaInformacoesPeixeLayout);
        areaInformacoesPeixeLayout.setHorizontalGroup(
            areaInformacoesPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgSignoPeixes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(areaInformacoesPeixeLayout.createSequentialGroup()
                .addGroup(areaInformacoesPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaInformacoesPeixeLayout.createSequentialGroup()
                        .addGroup(areaInformacoesPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesPeixeLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(planetaPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(numeroPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(areaInformacoesPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPlanetaPeixe)
                            .addGroup(areaInformacoesPeixeLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tfNumeroPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(areaInformacoesPeixeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesPeixeLayout.createSequentialGroup()
                                .addComponent(periodoPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(tfPeriodoPeixe))
                            .addGroup(areaInformacoesPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(areaInformacoesPeixeLayout.createSequentialGroup()
                                    .addComponent(elementoPeixe)
                                    .addGap(32, 32, 32)
                                    .addComponent(tfElementoPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(areaInformacoesPeixeLayout.createSequentialGroup()
                                    .addComponent(corPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfCorPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(areaInformacoesPeixeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tituloPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaInformacoesPeixeLayout.setVerticalGroup(
            areaInformacoesPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesPeixeLayout.createSequentialGroup()
                .addComponent(imgSignoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPeriodoPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfElementoPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPlanetaPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(areaInformacoesPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corPeixe, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(tfCorPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacoesPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumeroPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        peixes.add(areaInformacoesPeixe, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 350, 640));

        tituloCaracteristicasPeixe.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        tituloCaracteristicasPeixe.setText("Características");

        pFortePeixe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pFortePeixe.setText("Pontos Fortes:");

        pMelhorarPeixe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pMelhorarPeixe.setText("Pontos a Melhorar:");

        txPFortesPeixes.setColumns(20);
        txPFortesPeixes.setRows(5);
        txPFortesPeixes.setText("É sensível, empático, criativo e imaginativo. Costuma perceber os sentimentos das pessoas e demonstra grande capacidade de compreensão e carinho.");
        jScrollPane46.setViewportView(txPFortesPeixes);

        txPMelhorarPeixes.setColumns(20);
        txPMelhorarPeixes.setRows(5);
        txPMelhorarPeixes.setText("Pode se deixar levar muito pelas emoções e ter dificuldade para estabelecer limites. Precisa desenvolver mais confiança, organização e capacidade de separar sonhos da realidade.");
        jScrollPane47.setViewportView(txPMelhorarPeixes);

        javax.swing.GroupLayout areaCaracteristicasPeixeLayout = new javax.swing.GroupLayout(areaCaracteristicasPeixe);
        areaCaracteristicasPeixe.setLayout(areaCaracteristicasPeixeLayout);
        areaCaracteristicasPeixeLayout.setHorizontalGroup(
            areaCaracteristicasPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasPeixeLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasPeixeLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(areaCaracteristicasPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pMelhorarPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pFortePeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicasPeixeLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(tituloCaracteristicasPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        areaCaracteristicasPeixeLayout.setVerticalGroup(
            areaCaracteristicasPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasPeixeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCaracteristicasPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFortePeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMelhorarPeixe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        peixes.add(areaCaracteristicasPeixe, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 390, 290));

        tituloEnergiaPeixe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloEnergiaPeixe.setText("Energia Do Dia");

        amorPeixe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amorPeixe.setText("Amor:");

        tabalhoPeixe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabalhoPeixe.setText("Trabalho:");

        saudePeixe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saudePeixe.setText("Saúde:");

        sortePeixe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sortePeixe.setText("Sorte:");

        tfTrabalhoPeixe.setText("80%");

        tfSaudePeixe.setText("80%");
        tfSaudePeixe.addActionListener(this::tfSaudePeixeActionPerformed);

        tfSortePeixe.setText("90%");
        tfSortePeixe.addActionListener(this::tfSortePeixeActionPerformed);

        tfAmorPeixe.setText("95%");
        tfAmorPeixe.addActionListener(this::tfAmorPeixeActionPerformed);

        javax.swing.GroupLayout areaEnergiaPeixeLayout = new javax.swing.GroupLayout(areaEnergiaPeixe);
        areaEnergiaPeixe.setLayout(areaEnergiaPeixeLayout);
        areaEnergiaPeixeLayout.setHorizontalGroup(
            areaEnergiaPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaPeixeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaEnergiaPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfAmorPeixe)
                    .addGroup(areaEnergiaPeixeLayout.createSequentialGroup()
                        .addGroup(areaEnergiaPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaEnergiaPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfSaudePeixe, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                                .addComponent(tfTrabalhoPeixe)
                                .addComponent(tituloEnergiaPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfSortePeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(saudePeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tabalhoPeixe)
                                .addComponent(amorPeixe))
                            .addComponent(sortePeixe))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaEnergiaPeixeLayout.setVerticalGroup(
            areaEnergiaPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaPeixeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloEnergiaPeixe)
                .addGap(2, 2, 2)
                .addComponent(amorPeixe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabalhoPeixe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfTrabalhoPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudePeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSaudePeixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(sortePeixe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSortePeixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );

        peixes.add(areaEnergiaPeixe, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, 340, 290));

        tituloMensagemPeixe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloMensagemPeixe.setText("Mensagem Do Dia");

        txMensagemPeixes.setColumns(20);
        txMensagemPeixes.setRows(5);
        jScrollPane48.setViewportView(txMensagemPeixes);

        btnCopiarMensagemPeixe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCopiarMensagemPeixe.setText("Copiar Mensagem");

        javax.swing.GroupLayout areaMensagemPeixeLayout = new javax.swing.GroupLayout(areaMensagemPeixe);
        areaMensagemPeixe.setLayout(areaMensagemPeixeLayout);
        areaMensagemPeixeLayout.setHorizontalGroup(
            areaMensagemPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaMensagemPeixeLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(areaMensagemPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloMensagemPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(areaMensagemPeixeLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnCopiarMensagemPeixe)))
                .addGap(17, 17, 17))
        );
        areaMensagemPeixeLayout.setVerticalGroup(
            areaMensagemPeixeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemPeixeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloMensagemPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiarMensagemPeixe)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        peixes.add(areaMensagemPeixe, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 380, 340, 200));

        fundoimagempeixes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagenfundo.png"))); // NOI18N
        peixes.add(fundoimagempeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));

        areaAbas.addTab("Peixes", peixes);

        getContentPane().add(areaAbas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfSaudeAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSaudeAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSaudeAriesActionPerformed

    private void tfSaudeGemeosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSaudeGemeosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSaudeGemeosActionPerformed

    private void tfSaudeCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSaudeCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSaudeCancerActionPerformed

    private void tfSaudeLeaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSaudeLeaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSaudeLeaoActionPerformed

    private void tfSaudeVirgemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSaudeVirgemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSaudeVirgemActionPerformed

    private void tfSaudeLibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSaudeLibraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSaudeLibraActionPerformed

    private void tfSaudeSagitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSaudeSagitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSaudeSagitarioActionPerformed

    private void tfSaudeCapricornioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSaudeCapricornioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSaudeCapricornioActionPerformed

    private void tfSaudeAquarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSaudeAquarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSaudeAquarioActionPerformed

    private void tfSaudePeixeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSaudePeixeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSaudePeixeActionPerformed

    private void tfAmorPeixeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAmorPeixeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmorPeixeActionPerformed

    private void tfSortePeixeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSortePeixeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSortePeixeActionPerformed

    private void tfSaudeTouro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSaudeTouro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSaudeTouro1ActionPerformed

    private void tfSorteTouro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSorteTouro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSorteTouro1ActionPerformed

    private void tfAmorTouro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAmorTouro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmorTouro1ActionPerformed

    private void tfTrabalhoAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTrabalhoAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTrabalhoAriesActionPerformed

    private void tfAmorGemeosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAmorGemeosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmorGemeosActionPerformed

    private void tfCorCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorCancerActionPerformed

    private void tfTrabalhoCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTrabalhoCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTrabalhoCancerActionPerformed

    private void tfAmorCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAmorCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmorCancerActionPerformed

    private void tfTrabalhoLibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTrabalhoLibraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTrabalhoLibraActionPerformed

    private void tfSorteSagitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSorteSagitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSorteSagitarioActionPerformed

    private void tfNumeroCapricornioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroCapricornioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroCapricornioActionPerformed

    private void tfPeriodoAquarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoAquarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoAquarioActionPerformed

    private void tfPeriodoPeixeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoPeixeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoPeixeActionPerformed

    private void tfTrabalhoEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTrabalhoEscorpiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTrabalhoEscorpiaoActionPerformed

    private void tfSaudeEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSaudeEscorpiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSaudeEscorpiaoActionPerformed

    private void tfSorteEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSorteEscorpiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSorteEscorpiaoActionPerformed

    private void tfElementoLibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoLibraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoLibraActionPerformed

    private void btnAtualizarPrevisoesLibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisoesLibraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisoesLibraActionPerformed

    private void btnDescobrirSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescobrirSignoActionPerformed
CalcularSigno();        // TODO add your handling code here:
    }//GEN-LAST:event_btnDescobrirSignoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
CalcularCompatibilidade();        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
TocarMusica();        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
PausarMusica();        // TODO add your handling code here:
    }//GEN-LAST:event_btnPauseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Signos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amorAquario;
    private javax.swing.JLabel amorAries;
    private javax.swing.JLabel amorCancer;
    private javax.swing.JLabel amorCapricornio;
    private javax.swing.JLabel amorEscorpiao;
    private javax.swing.JLabel amorGemeos;
    private javax.swing.JLabel amorLeao;
    private javax.swing.JLabel amorLibra;
    private javax.swing.JLabel amorPeixe;
    private javax.swing.JLabel amorSagitario;
    private javax.swing.JLabel amorTouro1;
    private javax.swing.JLabel amorVirgem;
    private javax.swing.JPanel aquario;
    private javax.swing.JTabbedPane areaAbas;
    private javax.swing.JPanel areaCaracteristicaCapricornio;
    private javax.swing.JPanel areaCaracteristicasAquario;
    private javax.swing.JPanel areaCaracteristicasAries;
    private javax.swing.JPanel areaCaracteristicasCancer;
    private javax.swing.JPanel areaCaracteristicasEscorpiao;
    private javax.swing.JPanel areaCaracteristicasGemeos;
    private javax.swing.JPanel areaCaracteristicasLeao;
    private javax.swing.JPanel areaCaracteristicasLibra;
    private javax.swing.JPanel areaCaracteristicasPeixe;
    private javax.swing.JPanel areaCaracteristicasSagitario;
    private javax.swing.JPanel areaCaracteristicasTouro;
    private javax.swing.JPanel areaCaracteristicasVirgem;
    private javax.swing.JPanel areaCompatibilidade;
    private javax.swing.JPanel areaDescobrirSigno;
    private javax.swing.JPanel areaEnergia12;
    private javax.swing.JPanel areaEnergiaAquario;
    private javax.swing.JPanel areaEnergiaAries;
    private javax.swing.JPanel areaEnergiaCancer;
    private javax.swing.JPanel areaEnergiaCapricornio;
    private javax.swing.JPanel areaEnergiaEscorpiao;
    private javax.swing.JPanel areaEnergiaGemeos;
    private javax.swing.JPanel areaEnergiaLeao;
    private javax.swing.JPanel areaEnergiaLibra;
    private javax.swing.JPanel areaEnergiaPeixe;
    private javax.swing.JPanel areaEnergiaSagitario;
    private javax.swing.JPanel areaEnergiaVirgem;
    private javax.swing.JPanel areaInformacoesAquario;
    private javax.swing.JPanel areaInformacoesAries;
    private javax.swing.JPanel areaInformacoesCancer;
    private javax.swing.JPanel areaInformacoesCapricornio;
    private javax.swing.JPanel areaInformacoesEscorpiao;
    private javax.swing.JPanel areaInformacoesGemeos;
    private javax.swing.JPanel areaInformacoesLeao;
    private javax.swing.JPanel areaInformacoesLibra;
    private javax.swing.JPanel areaInformacoesPeixe;
    private javax.swing.JPanel areaInformacoesSagitario;
    private javax.swing.JPanel areaInformacoesTouro;
    private javax.swing.JPanel areaInformacoesVirgem;
    private javax.swing.JPanel areaMensagemAquario;
    private javax.swing.JPanel areaMensagemAries;
    private javax.swing.JPanel areaMensagemCancer;
    private javax.swing.JPanel areaMensagemCapricornio;
    private javax.swing.JPanel areaMensagemEscoripiao;
    private javax.swing.JPanel areaMensagemGemeos;
    private javax.swing.JPanel areaMensagemLeao;
    private javax.swing.JPanel areaMensagemLibra;
    private javax.swing.JPanel areaMensagemPeixe;
    private javax.swing.JPanel areaMensagemSagitario;
    private javax.swing.JPanel areaMensagemTouro;
    private javax.swing.JPanel areaMensagemVirgem;
    private javax.swing.JPanel areaPrevisoesAquario;
    private javax.swing.JPanel areaPrevisoesAries;
    private javax.swing.JPanel areaPrevisoesCancer;
    private javax.swing.JPanel areaPrevisoesCapricornio;
    private javax.swing.JPanel areaPrevisoesEscorpiao;
    private javax.swing.JPanel areaPrevisoesGemeos;
    private javax.swing.JPanel areaPrevisoesLeao;
    private javax.swing.JPanel areaPrevisoesLibra;
    private javax.swing.JPanel areaPrevisoesPeixe;
    private javax.swing.JPanel areaPrevisoesSagitario;
    private javax.swing.JPanel areaPrevisoesTouro;
    private javax.swing.JPanel areaPrevisoesVirgem;
    private javax.swing.JPanel areaResultado;
    private javax.swing.JPanel aries;
    private javax.swing.JButton btnAtualizarPrevisoesAquario;
    private javax.swing.JButton btnAtualizarPrevisoesAries;
    private javax.swing.JButton btnAtualizarPrevisoesCancer;
    private javax.swing.JButton btnAtualizarPrevisoesCapricornio;
    private javax.swing.JButton btnAtualizarPrevisoesEscorpiao;
    private javax.swing.JButton btnAtualizarPrevisoesGemeos;
    private javax.swing.JButton btnAtualizarPrevisoesLeao;
    private javax.swing.JButton btnAtualizarPrevisoesLibra;
    private javax.swing.JButton btnAtualizarPrevisoesPeixe;
    private javax.swing.JButton btnAtualizarPrevisoesSagitario;
    private javax.swing.JButton btnAtualizarPrevisoesTouro1;
    private javax.swing.JButton btnAtualizarPrevisoesVirgem;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCopiarMensagemAquario;
    private javax.swing.JButton btnCopiarMensagemAries;
    private javax.swing.JButton btnCopiarMensagemCancer;
    private javax.swing.JButton btnCopiarMensagemCapricornio;
    private javax.swing.JButton btnCopiarMensagemEscorpiao;
    private javax.swing.JButton btnCopiarMensagemGemeos;
    private javax.swing.JButton btnCopiarMensagemLeao;
    private javax.swing.JButton btnCopiarMensagemLibra;
    private javax.swing.JButton btnCopiarMensagemPeixe;
    private javax.swing.JButton btnCopiarMensagemSagitario;
    private javax.swing.JButton btnCopiarMensagemTouro1;
    private javax.swing.JButton btnCopiarMensagemVirgem;
    private javax.swing.JButton btnDescobrirSigno;
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnSigno;
    private javax.swing.JPanel cancer;
    private javax.swing.JPanel capricornio;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JComboBox<String> cbSigno1;
    private javax.swing.JComboBox<String> cbSigno2;
    private javax.swing.JLabel compatibilidade;
    private javax.swing.JLabel corAquario;
    private javax.swing.JLabel corAries;
    private javax.swing.JLabel corCancer;
    private javax.swing.JLabel corCapricornio;
    private javax.swing.JLabel corEscorpiao;
    private javax.swing.JLabel corGemeos;
    private javax.swing.JLabel corLeao;
    private javax.swing.JLabel corLibra;
    private javax.swing.JLabel corPeixe;
    private javax.swing.JLabel corSagitario;
    private javax.swing.JLabel corTouro1;
    private javax.swing.JLabel corVirgem;
    private javax.swing.JLabel descubraSeuSigno;
    private javax.swing.JLabel diaNascimento;
    private javax.swing.JLabel elementoAquario;
    private javax.swing.JLabel elementoAries;
    private javax.swing.JLabel elementoCancer;
    private javax.swing.JLabel elementoCapricornio;
    private javax.swing.JLabel elementoEscorpiao;
    private javax.swing.JLabel elementoGemeos;
    private javax.swing.JLabel elementoLeao;
    private javax.swing.JLabel elementoLibra;
    private javax.swing.JLabel elementoPeixe;
    private javax.swing.JLabel elementoSagitario;
    private javax.swing.JLabel elementoTouro1;
    private javax.swing.JLabel elementoVirgem;
    private javax.swing.JLabel fundoImagemEscorpiao;
    private javax.swing.JLabel fundoimagemaquario;
    private javax.swing.JLabel fundoimagemcancer;
    private javax.swing.JLabel fundoimagemcapricornio;
    private javax.swing.JLabel fundoimagemgemeos;
    private javax.swing.JLabel fundoimagemleao;
    private javax.swing.JLabel fundoimagemlibra;
    private javax.swing.JLabel fundoimagempeixes;
    private javax.swing.JLabel fundoimagemsagitario;
    private javax.swing.JLabel fundoimagemvirgem;
    private javax.swing.JPanel gemeos;
    private javax.swing.JLabel imagemfundoaries;
    private javax.swing.JLabel imagemfundoinicio;
    private javax.swing.JLabel imagemfundotouro;
    private javax.swing.JLabel imgSignoAquario;
    private javax.swing.JLabel imgSignoAries;
    private javax.swing.JLabel imgSignoCancer;
    private javax.swing.JLabel imgSignoCapricornio;
    private javax.swing.JLabel imgSignoEscorpiao;
    private javax.swing.JLabel imgSignoGemeos;
    private javax.swing.JLabel imgSignoLeao;
    private javax.swing.JLabel imgSignoLibra;
    private javax.swing.JLabel imgSignoPeixes;
    private javax.swing.JLabel imgSignoSagitario;
    private javax.swing.JLabel imgSignoTouro;
    private javax.swing.JLabel imgSignoVirgem;
    private javax.swing.JPanel iniciio;
    private javax.swing.JPanel iscorpiao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane100;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane42;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane44;
    private javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JScrollPane jScrollPane46;
    private javax.swing.JScrollPane jScrollPane47;
    private javax.swing.JScrollPane jScrollPane48;
    private javax.swing.JScrollPane jScrollPane49;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane50;
    private javax.swing.JScrollPane jScrollPane51;
    private javax.swing.JScrollPane jScrollPane52;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane97;
    private javax.swing.JScrollPane jScrollPane98;
    private javax.swing.JScrollPane jScrollPane99;
    private javax.swing.JLabel jbCompatibilidade;
    private javax.swing.JPanel leao;
    private javax.swing.JPanel libra;
    private javax.swing.JLabel mesNascimento;
    private javax.swing.JLabel nSorteLeao;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel numeroAquario;
    private javax.swing.JLabel numeroAries;
    private javax.swing.JLabel numeroCancer;
    private javax.swing.JLabel numeroCapricornio;
    private javax.swing.JLabel numeroEscorpiao;
    private javax.swing.JLabel numeroGemeos;
    private javax.swing.JLabel numeroLibra;
    private javax.swing.JLabel numeroPeixe;
    private javax.swing.JLabel numeroSagitario;
    private javax.swing.JLabel numeroTouro1;
    private javax.swing.JLabel numeroVirgem;
    private javax.swing.JLabel pForesAquario;
    private javax.swing.JLabel pForteGemeos;
    private javax.swing.JLabel pFortePeixe;
    private javax.swing.JLabel pForteTouro1;
    private javax.swing.JLabel pFortesAries;
    private javax.swing.JLabel pFortesCancer;
    private javax.swing.JLabel pFortesCapricornio;
    private javax.swing.JLabel pFortesEscorpiao;
    private javax.swing.JLabel pFortesLeao;
    private javax.swing.JLabel pFortesLibra;
    private javax.swing.JLabel pFortesSagitario;
    private javax.swing.JLabel pFortesVirgem;
    private javax.swing.JLabel pMelhorarAquario;
    private javax.swing.JLabel pMelhorarAries;
    private javax.swing.JLabel pMelhorarCancer;
    private javax.swing.JLabel pMelhorarCapricornio;
    private javax.swing.JLabel pMelhorarEscorpiao;
    private javax.swing.JLabel pMelhorarGemeos;
    private javax.swing.JLabel pMelhorarLeao;
    private javax.swing.JLabel pMelhorarLibra;
    private javax.swing.JLabel pMelhorarPeixe;
    private javax.swing.JLabel pMelhorarSagitario;
    private javax.swing.JLabel pMelhorarTouro1;
    private javax.swing.JLabel pMelhorarVirgem;
    private javax.swing.JPanel peixes;
    private javax.swing.JLabel periodoAquario;
    private javax.swing.JLabel periodoAries;
    private javax.swing.JLabel periodoCancer;
    private javax.swing.JLabel periodoCapricornio;
    private javax.swing.JLabel periodoEscorpiao;
    private javax.swing.JLabel periodoGemeos;
    private javax.swing.JLabel periodoLeao;
    private javax.swing.JLabel periodoLibra;
    private javax.swing.JLabel periodoPeixe;
    private javax.swing.JLabel periodoSagitario;
    private javax.swing.JLabel periodoTouro1;
    private javax.swing.JLabel periodoVirgem;
    private javax.swing.JLabel planetaAquario;
    private javax.swing.JLabel planetaAries;
    private javax.swing.JLabel planetaCancer;
    private javax.swing.JLabel planetaCapricornio;
    private javax.swing.JLabel planetaEscorpiao;
    private javax.swing.JLabel planetaGemeos;
    private javax.swing.JLabel planetaLeao;
    private javax.swing.JLabel planetaLibra;
    private javax.swing.JLabel planetaPeixe;
    private javax.swing.JLabel planetaSagitario;
    private javax.swing.JLabel planetaTouro1;
    private javax.swing.JLabel planetaVirgem;
    private javax.swing.JLabel previsaoAquario;
    private javax.swing.JLabel previsaoAries;
    private javax.swing.JLabel previsaoCancer;
    private javax.swing.JLabel previsaoCapricornio;
    private javax.swing.JLabel previsaoEscorpiao;
    private javax.swing.JLabel previsaoGemeos;
    private javax.swing.JLabel previsaoLeao;
    private javax.swing.JLabel previsaoLibra;
    private javax.swing.JLabel previsaoPeixe;
    private javax.swing.JLabel previsaoSagitario;
    private javax.swing.JLabel previsaoTouro1;
    private javax.swing.JLabel previsaoVirgem;
    private javax.swing.JPanel sagitario;
    private javax.swing.JLabel saude1;
    private javax.swing.JLabel saudeAquario;
    private javax.swing.JLabel saudeAries;
    private javax.swing.JLabel saudeCancer;
    private javax.swing.JLabel saudeCapricornio;
    private javax.swing.JLabel saudeEscorpiao;
    private javax.swing.JLabel saudeGemeos;
    private javax.swing.JLabel saudeLeao;
    private javax.swing.JLabel saudeLibra;
    private javax.swing.JLabel saudePeixe;
    private javax.swing.JLabel saudeSagitario;
    private javax.swing.JLabel saudeVirgem;
    private javax.swing.JLabel signo;
    private javax.swing.JLabel signo1;
    private javax.swing.JLabel signo2;
    private javax.swing.JLabel sorteAquario;
    private javax.swing.JLabel sorteAries;
    private javax.swing.JLabel sorteCancer;
    private javax.swing.JLabel sorteCapricornio;
    private javax.swing.JLabel sorteEscorpiao;
    private javax.swing.JLabel sorteGemeos;
    private javax.swing.JLabel sorteLeao;
    private javax.swing.JLabel sorteLibra;
    private javax.swing.JLabel sortePeixe;
    private javax.swing.JLabel sorteSagitario;
    private javax.swing.JLabel sorteTouro1;
    private javax.swing.JLabel sorteVirgem;
    private javax.swing.JLabel tabalhoPeixe;
    private javax.swing.JLabel tabalhoTouro1;
    private javax.swing.JTextField tfAmorAquario;
    private javax.swing.JTextField tfAmorAries;
    private javax.swing.JTextField tfAmorCancer;
    private javax.swing.JTextField tfAmorCapricornio;
    private javax.swing.JTextField tfAmorEscorpiao;
    private javax.swing.JTextField tfAmorGemeos;
    private javax.swing.JTextField tfAmorLeao;
    private javax.swing.JTextField tfAmorLibra;
    private javax.swing.JTextField tfAmorPeixe;
    private javax.swing.JTextField tfAmorSagitario;
    private javax.swing.JTextField tfAmorTouro1;
    private javax.swing.JTextField tfAmorVirgem;
    private javax.swing.JTextField tfCompatibilidade;
    private javax.swing.JTextField tfCorAquario;
    private javax.swing.JTextField tfCorAries;
    private javax.swing.JTextField tfCorCancer;
    private javax.swing.JTextField tfCorCapricornio;
    private javax.swing.JTextField tfCorEscorpiao;
    private javax.swing.JTextField tfCorGemeos;
    private javax.swing.JTextField tfCorLeao;
    private javax.swing.JTextField tfCorLibra;
    private javax.swing.JTextField tfCorPeixe;
    private javax.swing.JTextField tfCorSagitario;
    private javax.swing.JTextField tfCorTouro1;
    private javax.swing.JTextField tfCorVirgem;
    private javax.swing.JTextField tfElementoAquario;
    private javax.swing.JTextField tfElementoAries;
    private javax.swing.JTextField tfElementoCancer;
    private javax.swing.JTextField tfElementoCapricornio;
    private javax.swing.JTextField tfElementoEscorpiao;
    private javax.swing.JTextField tfElementoGemeos;
    private javax.swing.JTextField tfElementoLeao;
    private javax.swing.JTextField tfElementoLibra;
    private javax.swing.JTextField tfElementoPeixe;
    private javax.swing.JTextField tfElementoSagitario;
    private javax.swing.JTextField tfElementoTouro1;
    private javax.swing.JTextField tfElementoVirgem;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumeroAquario;
    private javax.swing.JTextField tfNumeroAries;
    private javax.swing.JTextField tfNumeroCancer;
    private javax.swing.JTextField tfNumeroCapricornio;
    private javax.swing.JTextField tfNumeroEscorpiao;
    private javax.swing.JTextField tfNumeroGemeos;
    private javax.swing.JTextField tfNumeroLeao;
    private javax.swing.JTextField tfNumeroLibra;
    private javax.swing.JTextField tfNumeroPeixe;
    private javax.swing.JTextField tfNumeroSagitario;
    private javax.swing.JTextField tfNumeroTouro1;
    private javax.swing.JTextField tfNumeroVirgem;
    private javax.swing.JTextField tfPeriodoAquario;
    private javax.swing.JTextField tfPeriodoAries;
    private javax.swing.JTextField tfPeriodoCancer;
    private javax.swing.JTextField tfPeriodoCapricornio;
    private javax.swing.JTextField tfPeriodoEscorpiao;
    private javax.swing.JTextField tfPeriodoGemeos;
    private javax.swing.JTextField tfPeriodoLeao;
    private javax.swing.JTextField tfPeriodoLibra;
    private javax.swing.JTextField tfPeriodoPeixe;
    private javax.swing.JTextField tfPeriodoSagitario;
    private javax.swing.JTextField tfPeriodoTouro1;
    private javax.swing.JTextField tfPeriodoVirgem;
    private javax.swing.JTextField tfPlanetaAquario;
    private javax.swing.JTextField tfPlanetaAries;
    private javax.swing.JTextField tfPlanetaCancer;
    private javax.swing.JTextField tfPlanetaCapricornio;
    private javax.swing.JTextField tfPlanetaEscorpiao;
    private javax.swing.JTextField tfPlanetaGemeos;
    private javax.swing.JTextField tfPlanetaLeao;
    private javax.swing.JTextField tfPlanetaLibra;
    private javax.swing.JTextField tfPlanetaPeixe;
    private javax.swing.JTextField tfPlanetaSagitario;
    private javax.swing.JTextField tfPlanetaTouro1;
    private javax.swing.JTextField tfPlanetaVirgem;
    private javax.swing.JTextField tfSaudeAquario;
    private javax.swing.JTextField tfSaudeAries;
    private javax.swing.JTextField tfSaudeCancer;
    private javax.swing.JTextField tfSaudeCapricornio;
    private javax.swing.JTextField tfSaudeEscorpiao;
    private javax.swing.JTextField tfSaudeGemeos;
    private javax.swing.JTextField tfSaudeLeao;
    private javax.swing.JTextField tfSaudeLibra;
    private javax.swing.JTextField tfSaudePeixe;
    private javax.swing.JTextField tfSaudeSagitario;
    private javax.swing.JTextField tfSaudeTouro1;
    private javax.swing.JTextField tfSaudeVirgem;
    private javax.swing.JTextField tfSorteAquario;
    private javax.swing.JTextField tfSorteAries;
    private javax.swing.JTextField tfSorteCancer;
    private javax.swing.JTextField tfSorteCapricornio;
    private javax.swing.JTextField tfSorteEscorpiao;
    private javax.swing.JTextField tfSorteGemeos;
    private javax.swing.JTextField tfSorteLeao;
    private javax.swing.JTextField tfSorteLibra;
    private javax.swing.JTextField tfSortePeixe;
    private javax.swing.JTextField tfSorteSagitario;
    private javax.swing.JTextField tfSorteTouro1;
    private javax.swing.JTextField tfSorteVirgem;
    private javax.swing.JTextField tfTrabalhoAquario;
    private javax.swing.JTextField tfTrabalhoAries;
    private javax.swing.JTextField tfTrabalhoCancer;
    private javax.swing.JTextField tfTrabalhoCapricornio;
    private javax.swing.JTextField tfTrabalhoEscorpiao;
    private javax.swing.JTextField tfTrabalhoGemeos;
    private javax.swing.JTextField tfTrabalhoLeao;
    private javax.swing.JTextField tfTrabalhoLibra;
    private javax.swing.JTextField tfTrabalhoPeixe;
    private javax.swing.JTextField tfTrabalhoSagitario;
    private javax.swing.JTextField tfTrabalhoTouro1;
    private javax.swing.JTextField tfTrabalhoVirgem;
    private javax.swing.JLabel tituloAquario;
    private javax.swing.JLabel tituloAries;
    private javax.swing.JLabel tituloAries12;
    private javax.swing.JLabel tituloCancer;
    private javax.swing.JLabel tituloCapricornio;
    private javax.swing.JLabel tituloCaracteristicaVirgem;
    private javax.swing.JLabel tituloCaracteristicasAquario;
    private javax.swing.JLabel tituloCaracteristicasAries;
    private javax.swing.JLabel tituloCaracteristicasCancer;
    private javax.swing.JLabel tituloCaracteristicasCapricornio;
    private javax.swing.JLabel tituloCaracteristicasEscorpiao;
    private javax.swing.JLabel tituloCaracteristicasGemeos;
    private javax.swing.JLabel tituloCaracteristicasLeao;
    private javax.swing.JLabel tituloCaracteristicasLibra;
    private javax.swing.JLabel tituloCaracteristicasPeixe;
    private javax.swing.JLabel tituloCaracteristicasSagitario;
    private javax.swing.JLabel tituloCaracteristicasTouro1;
    private javax.swing.JLabel tituloCaracteristicasVirgem;
    private javax.swing.JLabel tituloCompatibilidadeLeao;
    private javax.swing.JLabel tituloEnergiaAquario;
    private javax.swing.JLabel tituloEnergiaAries;
    private javax.swing.JLabel tituloEnergiaCancer;
    private javax.swing.JLabel tituloEnergiaCapricornio;
    private javax.swing.JLabel tituloEnergiaEscorpiao;
    private javax.swing.JLabel tituloEnergiaGemeos;
    private javax.swing.JLabel tituloEnergiaLeao;
    private javax.swing.JLabel tituloEnergiaLibra;
    private javax.swing.JLabel tituloEnergiaPeixe;
    private javax.swing.JLabel tituloEnergiaSagitario;
    private javax.swing.JLabel tituloEnergiaTouro1;
    private javax.swing.JLabel tituloEnergiaVirgem;
    private javax.swing.JLabel tituloEscorpiao;
    private javax.swing.JLabel tituloGemeos;
    private javax.swing.JLabel tituloLibra;
    private javax.swing.JLabel tituloMensagemAquario;
    private javax.swing.JLabel tituloMensagemAries;
    private javax.swing.JLabel tituloMensagemCancer;
    private javax.swing.JLabel tituloMensagemCapricornio;
    private javax.swing.JLabel tituloMensagemEscorpiao;
    private javax.swing.JLabel tituloMensagemGemeos;
    private javax.swing.JLabel tituloMensagemLeao;
    private javax.swing.JLabel tituloMensagemLibra;
    private javax.swing.JLabel tituloMensagemPeixe;
    private javax.swing.JLabel tituloMensagemSagitario;
    private javax.swing.JLabel tituloMensagemTouro1;
    private javax.swing.JLabel tituloMensagemVirgem;
    private javax.swing.JLabel tituloPeixe;
    private javax.swing.JLabel tituloSagitario;
    private javax.swing.JPanel touro;
    private javax.swing.JLabel trabalhoAquario;
    private javax.swing.JLabel trabalhoAries;
    private javax.swing.JLabel trabalhoCancer;
    private javax.swing.JLabel trabalhoCapricornio;
    private javax.swing.JLabel trabalhoEscorpiao;
    private javax.swing.JLabel trabalhoGemeos;
    private javax.swing.JLabel trabalhoLeao;
    private javax.swing.JLabel trabalhoLibra;
    private javax.swing.JLabel trabalhoSagitario;
    private javax.swing.JLabel trabalhoVirgem;
    private javax.swing.JTextArea txMensagemAquario;
    private javax.swing.JTextArea txMensagemAries;
    private javax.swing.JTextArea txMensagemCancer;
    private javax.swing.JTextArea txMensagemCapricornio;
    private javax.swing.JTextArea txMensagemEscorpiao;
    private javax.swing.JTextArea txMensagemGemeos;
    private javax.swing.JTextArea txMensagemLeao;
    private javax.swing.JTextArea txMensagemLibra;
    private javax.swing.JTextArea txMensagemPeixes;
    private javax.swing.JTextArea txMensagemSagitario;
    private javax.swing.JTextArea txMensagemTouro;
    private javax.swing.JTextArea txMensagemVirgem;
    private javax.swing.JTextArea txPFortesAquario;
    private javax.swing.JTextArea txPFortesAries;
    private javax.swing.JTextArea txPFortesCancer;
    private javax.swing.JTextArea txPFortesCapricornio;
    private javax.swing.JTextArea txPFortesEscorpiao;
    private javax.swing.JTextArea txPFortesGemeos;
    private javax.swing.JTextArea txPFortesLeao;
    private javax.swing.JTextArea txPFortesLibra;
    private javax.swing.JTextArea txPFortesPeixes;
    private javax.swing.JTextArea txPFortesSagitario;
    private javax.swing.JTextArea txPFortesTouro;
    private javax.swing.JTextArea txPFortesVirgem;
    private javax.swing.JTextArea txPMelhorarAquario;
    private javax.swing.JTextArea txPMelhorarAries;
    private javax.swing.JTextArea txPMelhorarCancer;
    private javax.swing.JTextArea txPMelhorarCapricornio;
    private javax.swing.JTextArea txPMelhorarEscorpiao;
    private javax.swing.JTextArea txPMelhorarGemeos;
    private javax.swing.JTextArea txPMelhorarLeao;
    private javax.swing.JTextArea txPMelhorarLibra;
    private javax.swing.JTextArea txPMelhorarPeixes;
    private javax.swing.JTextArea txPMelhorarSagitario;
    private javax.swing.JTextArea txPMelhorarTouro;
    private javax.swing.JTextArea txPMelhorarVirgem;
    private javax.swing.JTextArea txPrevisaoAquario;
    private javax.swing.JTextArea txPrevisaoAries;
    private javax.swing.JTextArea txPrevisaoCancer;
    private javax.swing.JTextArea txPrevisaoCapricornio;
    private javax.swing.JTextArea txPrevisaoEscorpiao;
    private javax.swing.JTextArea txPrevisaoGemeos;
    private javax.swing.JTextArea txPrevisaoLeao;
    private javax.swing.JTextArea txPrevisaoLibra;
    private javax.swing.JTextArea txPrevisaoPeixes;
    private javax.swing.JTextArea txPrevisaoSagitario;
    private javax.swing.JTextArea txPrevisaoTouro;
    private javax.swing.JTextArea txPrevisaoVirgem;
    private javax.swing.JPanel virgem;
    // End of variables declaration//GEN-END:variables
}
