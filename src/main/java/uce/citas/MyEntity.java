package uce.citas;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;


/**
 * Example JPA entity defined as a Panache Entity.
 * An ID field of Long type is provided, if you want to define your own ID field extends <code>PanacheEntityBase</code> instead.
 *
 * This uses the active record pattern, you can also use the repository pattern instead:
 * .
 *
 * Usage (more example on the documentation)
 *
 * {@code
 *     public void doSomething() {
 *         MyEntity entity1 = new MyEntity();
 *         entity1.field = "field-1";
 *         entity1.persist();
 *
 *         List<MyEntity> entities = MyEntity.listAll();
 *     }
 * }
 */
@Entity
public class MyEntity extends PanacheEntity {
    public String field;
}

/*
<template>
    <div class="login-view">
        <h1>Login</h1>
        <form @submit.prevent="login">
        <div class="form-group">
            <label for="username">Username:</label>
            <input type="text" id="username" v-model="username" required />
        </div>
        <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" id="password" v-model="password" required />
        </div>
        <button type="submit">Entrar</button>
        </form>
    </div>
</template>

<script>
import { getToken, setAuth } from '../clients/UsuarioClient';

export default {
    data() {
        return {
            username: '',
            password: ''
        }
    },
    methods: {
        async login() {
            try {
                const { token, expiresAt } = await getToken(this.username, this.password);
                if (token) {
                    setAuth(token, expiresAt);
                    this.$router.push({ name: 'home' });
                } else {
                    alert('Credenciales inválidas');
                }
            } catch (error) {
                alert('Credenciales inválidas');
            }
        }
    }
}
</script>
*/