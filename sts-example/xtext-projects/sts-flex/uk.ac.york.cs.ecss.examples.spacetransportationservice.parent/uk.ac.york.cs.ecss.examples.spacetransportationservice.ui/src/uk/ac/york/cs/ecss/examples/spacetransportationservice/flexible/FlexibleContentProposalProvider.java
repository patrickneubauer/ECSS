package uk.ac.york.cs.ecss.examples.spacetransportationservice.flexible;

import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import uk.ac.york.cs.ecss.examples.spacetransportationservice.ui.contentassist.StsLanguageFlexProposalProvider;

public class FlexibleContentProposalProvider extends StsLanguageFlexProposalProvider {

	@Override
	public void completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
			ICompletionProposalAcceptor acceptor) {
		System.out.println("Keyword.value="+keyword.getValue());
		ICompletionProposal proposal = createCompletionProposal(keyword.getValue(), getKeywordDisplayString(keyword),
				getImage(keyword), contentAssistContext);
		getPriorityHelper().adjustKeywordPriority(proposal, contentAssistContext.getPrefix());
		acceptor.accept(proposal);
	}

}
