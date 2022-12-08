
package org.a4j.workshop.helidon.microstream;

/*-
 * #%L
 * microstream-examples-cdi-javase
 * %%
 * Copyright (C) 2019 - 2021 MicroStream Software
 * %%
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is
 * available at https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 * #L%
 */

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import java.time.Year;
import java.util.UUID;


public class App {
    public static void main(final String[] args) {

        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {

            Book book  = Book.builder().id(UUID.randomUUID().toString())
                    .title("Persistence Layer")
                    .author("Otavio Santana")
                    .release(Year.of(2023))
                    .build();

            Book cleanCode  = Book.builder().id(UUID.randomUUID().toString())
                    .title("Clean Code")
                    .author("Uncle Bob")
                    .release(Year.of(2015))
                    .build();

            BookService service = container.select(BookService.class).get();
//            service.add(cleanCode);
//            service.add(book);

            System.out.println("The result is " + service.getBooks());

        }
        System.exit(0);
    }
}
