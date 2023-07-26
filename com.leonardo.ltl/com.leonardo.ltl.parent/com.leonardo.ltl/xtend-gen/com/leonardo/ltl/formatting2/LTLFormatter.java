/**
 * generated by Xtext 2.31.0
 */
package com.leonardo.ltl.formatting2;

import com.google.inject.Inject;
import com.leonardo.ltl.ltl.Model;
import com.leonardo.ltl.ltl.PackagableElement;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class LTLFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private /* LTLGrammarAccess */Object _lTLGrammarAccess;

  protected void _format(final Model model, @Extension final IFormattableDocument document) {
    EList<com.leonardo.ltl.ltl.Package> _packages = model.getPackages();
    for (final com.leonardo.ltl.ltl.Package _package : _packages) {
      document.<com.leonardo.ltl.ltl.Package>format(_package);
    }
  }

  protected void _format(final com.leonardo.ltl.ltl.Package _package, @Extension final IFormattableDocument document) {
    EList<PackagableElement> _packagableElements = _package.getPackagableElements();
    for (final PackagableElement packagableElement : _packagableElements) {
      document.<PackagableElement>format(packagableElement);
    }
  }

  public void format(final Object model, final IFormattableDocument document) {
    if (model instanceof XtextResource) {
      _format((XtextResource)model, document);
      return;
    } else if (model instanceof Model) {
      _format((Model)model, document);
      return;
    } else if (model instanceof com.leonardo.ltl.ltl.Package) {
      _format((com.leonardo.ltl.ltl.Package)model, document);
      return;
    } else if (model instanceof EObject) {
      _format((EObject)model, document);
      return;
    } else if (model == null) {
      _format((Void)null, document);
      return;
    } else if (model != null) {
      _format(model, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(model, document).toString());
    }
  }
}
