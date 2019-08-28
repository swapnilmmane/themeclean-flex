package com.themecleanflex.models;

import com.peregrine.nodetypes.models.AbstractComponent;
import com.peregrine.nodetypes.models.IComponent;
import com.peregrine.nodetypes.models.Container;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

/*
    //GEN[:DATA
    {
  "definitions": {
    "Cardthreeimages": {
      "type": "object",
      "x-type": "component",
      "properties": {
        "firstimagetitle": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Image Title",
          "x-form-type": "text"
        },
        "firstimagetext": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Image Text",
          "x-form-type": "texteditor"
        },
        "firstimage": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Image",
          "x-form-type": "pathbrowser",
          "x-form-browserRoot": "/content/assets"
        },
        "secondimagetitle": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Image Title",
          "x-form-type": "text"
        },
        "secondimagetext": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Image Text",
          "x-form-type": "texteditor"
        },
        "secondimage": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Image",
          "x-form-type": "pathbrowser",
          "x-form-browserRoot": "/content/assets"
        },
        "thirdimagetitle": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Image Title",
          "x-form-type": "text"
        },
        "thirdimagetext": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Image Text",
          "x-form-type": "texteditor"
        },
        "thirdimage": {
          "type": "string",
          "x-source": "inject",
          "x-form-label": "Image",
          "x-form-type": "pathbrowser",
          "x-form-browserRoot": "/content/assets"
        }
      }
    }
  },
  "name": "Cardthreeimages",
  "componentPath": "themecleanflex/components/cardthreeimages",
  "package": "com.themecleanflex.models",
  "modelName": "Cardthreeimages",
  "classNameParent": "AbstractComponent"
}
//GEN]
*/

//GEN[:DEF
@Model(
        adaptables = Resource.class,
        resourceType = "themecleanflex/components/cardthreeimages",
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        adapters = IComponent.class
)
@Exporter(
        name = "jackson",
        extensions = "json"
)

//GEN]
public class CardthreeimagesModel extends AbstractComponent {

    public CardthreeimagesModel(Resource r) { super(r); }

    //GEN[:INJECT
    	/* {"type":"string","x-source":"inject","x-form-label":"Image Title","x-form-type":"text"} */
	@Inject
	private String firstimagetitle;

	/* {"type":"string","x-source":"inject","x-form-label":"Image Text","x-form-type":"texteditor"} */
	@Inject
	private String firstimagetext;

	/* {"type":"string","x-source":"inject","x-form-label":"Image","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"} */
	@Inject
	private String firstimage;

	/* {"type":"string","x-source":"inject","x-form-label":"Image Title","x-form-type":"text"} */
	@Inject
	private String secondimagetitle;

	/* {"type":"string","x-source":"inject","x-form-label":"Image Text","x-form-type":"texteditor"} */
	@Inject
	private String secondimagetext;

	/* {"type":"string","x-source":"inject","x-form-label":"Image","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"} */
	@Inject
	private String secondimage;

	/* {"type":"string","x-source":"inject","x-form-label":"Image Title","x-form-type":"text"} */
	@Inject
	private String thirdimagetitle;

	/* {"type":"string","x-source":"inject","x-form-label":"Image Text","x-form-type":"texteditor"} */
	@Inject
	private String thirdimagetext;

	/* {"type":"string","x-source":"inject","x-form-label":"Image","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"} */
	@Inject
	private String thirdimage;


//GEN]

    //GEN[:GETTERS
    	/* {"type":"string","x-source":"inject","x-form-label":"Image Title","x-form-type":"text"} */
	public String getFirstimagetitle() {
		return firstimagetitle;
	}

	/* {"type":"string","x-source":"inject","x-form-label":"Image Text","x-form-type":"texteditor"} */
	public String getFirstimagetext() {
		return firstimagetext;
	}

	/* {"type":"string","x-source":"inject","x-form-label":"Image","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"} */
	public String getFirstimage() {
		return firstimage;
	}

	/* {"type":"string","x-source":"inject","x-form-label":"Image Title","x-form-type":"text"} */
	public String getSecondimagetitle() {
		return secondimagetitle;
	}

	/* {"type":"string","x-source":"inject","x-form-label":"Image Text","x-form-type":"texteditor"} */
	public String getSecondimagetext() {
		return secondimagetext;
	}

	/* {"type":"string","x-source":"inject","x-form-label":"Image","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"} */
	public String getSecondimage() {
		return secondimage;
	}

	/* {"type":"string","x-source":"inject","x-form-label":"Image Title","x-form-type":"text"} */
	public String getThirdimagetitle() {
		return thirdimagetitle;
	}

	/* {"type":"string","x-source":"inject","x-form-label":"Image Text","x-form-type":"texteditor"} */
	public String getThirdimagetext() {
		return thirdimagetext;
	}

	/* {"type":"string","x-source":"inject","x-form-label":"Image","x-form-type":"pathbrowser","x-form-browserRoot":"/content/assets"} */
	public String getThirdimage() {
		return thirdimage;
	}


//GEN]

    //GEN[:CUSTOMGETTERS
    //GEN]

}
