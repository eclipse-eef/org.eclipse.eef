Copyright (c) 2016 Obeo.
All rights reserved. This program and the accompanying materials 
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.htm
Contributors: Obeo - initial API and implementation


This project is used to prepare the documentation for the website.


IT SHOULD NOT BE RELEASED TO THE END USER (IT'S USELESS FOR THEM)


The embedded documentation within Eclipse uses a very specific approach to display its content that is not directly compatible with the way the new EEF website is built. As a result, there are several small issues to use directly the HTML files produced by the textile generator in the website. Instead of fixing those small issues manually each time we want to update the documentation, this plugin will ensure that the documentation is properly exported for the website during the build. This export mechanism is coded in Java instead of relying on a more "fragile" bash script.


* Each HTML file contains the content of the whole page (html, head, body, etc). The website is being built using a single page application (SAP) approach, as a result the HTML files of the various pages can reuse some content (like the headers). By not having to repeat the header, footer, menu etc in all the pages, the website is easier to maintain but in order to make the HTML files generated compatible with this approach, the export mechanism will trim the HTML files generated to only keep the content of the body block.
* The website supports a responsive web design (RWD) approach, thus the HTML files generated need to be compatible with a mobile platform. This require a small change in the layout of the web page made possible by encapsulating the whole content of the body with a specific block (md-content in our case).
* With this single page application approach, the website has a different way of handling links than a regular website. It needs to separate three use cases, a "regular" router link, an anchor link and an external links. In order to support this behavior, non-external links needs to be absolute. The exporter is using java.net.URL to ensure a proper conversion from relative links to absolute ones. Anchor links need to have an absolute path too and finally external links to not need to be modified. Unit tests have been setup to verify this behavior.

The exporter is defined as an unit test since it is the easiest way to run code during the build using a proper OSGi runtime with all the necessary dependencies.

With this approach, the documentation can be integrated seamlessly in the website with a low cost of maintenance.