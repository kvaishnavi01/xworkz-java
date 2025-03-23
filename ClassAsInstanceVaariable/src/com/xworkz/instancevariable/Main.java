package com.xworkz.instancevariable;

public class Main {
    public static void main(String[] args) {
        Clip[] clips = { new Clip(ClipColor.RED), new Clip(ClipColor.BLUE), new Clip(ClipColor.GREEN),
                new Clip(ClipColor.YELLOW), new Clip(ClipColor.BLACK) };

        Pushpa pushpa = new Pushpa();
        pushpa.useClip(clips);

        Ticket ticket = new Ticket(TicketType.VIP, 500);
        Cricket cricket = new Cricket(ticket);
        Brush brush = new Brush(BrushColor.WHITE);

        Virat virat = new Virat(brush, clips, ticket, cricket);

        System.out.println("\nVirat is playing:");
        virat.play();

        System.out.println("\nVirat is cleaning:");
        virat.clean();

        System.out.println("\nVirat is relaxing:");
        virat.relax();
    }
}
