package de.themorpheus.edu.taskservice.cli.commands;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameters;
import de.themorpheus.edu.taskservice.cli.Options;

@Parameters(commandDescription = "Shows the help/usage page")
public class HelpCommand {

	public static void execute(JCommander commander, Options options, HelpCommand command) {
		commander.usage();
	}
}
