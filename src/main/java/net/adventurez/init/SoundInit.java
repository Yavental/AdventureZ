package net.adventurez.init;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SoundInit {
  // Stone Golem
  public static final Identifier GOLEM_IDLE = new Identifier("adventurez:golem_idle");
  public static final Identifier GOLEM_WALK = new Identifier("adventurez:golem_walk");
  public static final Identifier GOLEM_HIT = new Identifier("adventurez:golem_hit");
  public static final Identifier GOLEM_ROAR = new Identifier("adventurez:golem_roar");
  public static final Identifier GOLEM_DEATH = new Identifier("adventurez:golem_death");
  public static final Identifier GOLEM_SPAWN = new Identifier("adventurez:golem_spawn");
  public static SoundEvent GOLEM_IDLE_EVENT = new SoundEvent(GOLEM_IDLE);
  public static SoundEvent GOLEM_WALK_EVENT = new SoundEvent(GOLEM_WALK);
  public static SoundEvent GOLEM_HIT_EVENT = new SoundEvent(GOLEM_HIT);
  public static SoundEvent GOLEM_ROAR_EVENT = new SoundEvent(GOLEM_ROAR);
  public static SoundEvent GOLEM_DEATH_EVENT = new SoundEvent(GOLEM_DEATH);
  public static SoundEvent GOLEM_SPAWN_EVENT = new SoundEvent(GOLEM_SPAWN);
  // Item
  public static final Identifier ROCK_IMPACT = new Identifier("adventurez:rock_impact");
  public static final Identifier ROCK_THROW = new Identifier("adventurez:rock_throw");
  public static final Identifier HEART_BEAT = new Identifier("adventurez:heart_beat");
  public static SoundEvent ROCK_IMPACT_EVENT = new SoundEvent(ROCK_IMPACT);
  public static SoundEvent ROCK_THROW_EVENT = new SoundEvent(ROCK_THROW);
  public static SoundEvent HEART_BEAT_EVENT = new SoundEvent(HEART_BEAT);
  // Small Golem
  public static final Identifier SMALL_GOLEM_IDLE = new Identifier("adventurez:small_golem_idle");
  public static final Identifier SMALL_GOLEM_WALK = new Identifier("adventurez:small_golem_walk");
  public static final Identifier SMALL_GOLEM_HIT = new Identifier("adventurez:small_golem_hit");
  public static final Identifier SMALL_GOLEM_DEATH = new Identifier("adventurez:small_golem_death");
  public static SoundEvent SMALL_GOLEM_IDLE_EVENT = new SoundEvent(SMALL_GOLEM_IDLE);
  public static SoundEvent SMALL_GOLEM_WALK_EVENT = new SoundEvent(SMALL_GOLEM_WALK);
  public static SoundEvent SMALL_GOLEM_HIT_EVENT = new SoundEvent(SMALL_GOLEM_HIT);
  public static SoundEvent SMALL_GOLEM_DEATH_EVENT = new SoundEvent(SMALL_GOLEM_DEATH);
  // Piglin Beast
  public static final Identifier PIGLINBEAST_IDLE = new Identifier("adventurez:piglinbeast_idle");
  public static final Identifier PIGLINBEAST_DEATH = new Identifier("adventurez:piglinbeast_death");
  public static final Identifier PIGLINBEAST_HURT = new Identifier("adventurez:piglinbeast_hurt");
  public static final Identifier PIGLINBEAST_WALK = new Identifier("adventurez:piglinbeast_walk");
  public static final Identifier PIGLINBEAST_SHOUT = new Identifier("adventurez:piglinbeast_shout");
  public static final Identifier PIGLINBEAST_CLUBSWING = new Identifier("adventurez:piglinbeast_clubswing");
  public static SoundEvent PIGLINBEAST_IDLE_EVENT = new SoundEvent(PIGLINBEAST_IDLE);
  public static SoundEvent PIGLINBEAST_DEATH_EVENT = new SoundEvent(PIGLINBEAST_DEATH);
  public static SoundEvent PIGLINBEAST_HURT_EVENT = new SoundEvent(PIGLINBEAST_HURT);
  public static SoundEvent PIGLINBEAST_WALK_EVENT = new SoundEvent(PIGLINBEAST_WALK);
  public static SoundEvent PIGLINBEAST_SHOUT_EVENT = new SoundEvent(PIGLINBEAST_SHOUT);
  public static SoundEvent PIGLINBEAST_CLUBSWING_EVENT = new SoundEvent(PIGLINBEAST_CLUBSWING);
  // Nightmare
  public static final Identifier NIGHTMARE_IDLE = new Identifier("adventurez:nightmare_idle");
  public static final Identifier NIGHTMARE_DEATH = new Identifier("adventurez:nightmare_death");
  public static final Identifier NIGHTMARE_HURT = new Identifier("adventurez:nightmare_hurt");
  public static final Identifier NIGHTMARE_ANGRY = new Identifier("adventurez:nightmare_angry");
  public static SoundEvent NIGHTMARE_IDLE_EVENT = new SoundEvent(NIGHTMARE_IDLE);
  public static SoundEvent NIGHTMARE_DEATH_EVENT = new SoundEvent(NIGHTMARE_DEATH);
  public static SoundEvent NIGHTMARE_HURT_EVENT = new SoundEvent(NIGHTMARE_HURT);
  public static SoundEvent NIGHTMARE_ANGRY_EVENT = new SoundEvent(NIGHTMARE_ANGRY);
  // Soul Reaper
  public static final Identifier SOULREAPER_IDLE = new Identifier("adventurez:soulreaper_idle");
  public static final Identifier SOULREAPER_HURT = new Identifier("adventurez:soulreaper_hurt");
  public static final Identifier SOULREAPER_DEATH = new Identifier("adventurez:soulreaper_death");
  public static SoundEvent SOULREAPER_IDLE_EVENT = new SoundEvent(SOULREAPER_IDLE);
  public static SoundEvent SOULREAPER_HURT_EVENT = new SoundEvent(SOULREAPER_HURT);
  public static SoundEvent SOULREAPER_DEATH_EVENT = new SoundEvent(SOULREAPER_DEATH);
  // Magic
  public static final Identifier SPELL_CAST_SHIELD = new Identifier("adventurez:spellcast_shield");
  public static final Identifier MAGIC_SHIELD_HIT = new Identifier("adventurez:magic_shield_hit");
  public static SoundEvent SPELL_CAST_SHIELD_EVENT = new SoundEvent(SPELL_CAST_SHIELD);
  public static SoundEvent MAGIC_SHIELD_HIT_EVENT = new SoundEvent(MAGIC_SHIELD_HIT);
  // The Eye
  public static final Identifier EYE_DEATH = new Identifier("adventurez:eye_death");
  public static final Identifier EYE_HURT = new Identifier("adventurez:eye_hurt");
  public static final Identifier EYE_IDLE = new Identifier("adventurez:eye_idle");
  public static final Identifier EYE_DEATH_PLATFORM = new Identifier("adventurez:eye_death_platform");
  public static SoundEvent EYE_DEATH_EVENT = new SoundEvent(EYE_DEATH);
  public static SoundEvent EYE_HURT_EVENT = new SoundEvent(EYE_HURT);
  public static SoundEvent EYE_IDLE_EVENT = new SoundEvent(EYE_IDLE);
  public static SoundEvent EYE_DEATH_PLATFORM_EVENT = new SoundEvent(EYE_DEATH_PLATFORM);
  // Fungus
  public static final Identifier FUNGUS_IDLE = new Identifier("adventurez:fungus_idle");
  public static final Identifier FUNGUS_HURT = new Identifier("adventurez:fungus_hurt");
  public static final Identifier FUNGUS_DEATH = new Identifier("adventurez:fungus_death");
  public static SoundEvent FUNGUS_IDLE_EVENT = new SoundEvent(FUNGUS_IDLE);
  public static SoundEvent FUNGUS_HURT_EVENT = new SoundEvent(FUNGUS_HURT);
  public static SoundEvent FUNGUS_DEATH_EVENT = new SoundEvent(FUNGUS_DEATH);

  public static void init() {
    Registry.register(Registry.SOUND_EVENT, SoundInit.GOLEM_IDLE, GOLEM_IDLE_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.GOLEM_WALK, GOLEM_WALK_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.GOLEM_HIT, GOLEM_HIT_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.GOLEM_ROAR, GOLEM_ROAR_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.GOLEM_DEATH, GOLEM_DEATH_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.GOLEM_SPAWN, GOLEM_SPAWN_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.ROCK_IMPACT, ROCK_IMPACT_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.ROCK_THROW, ROCK_THROW_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.SMALL_GOLEM_IDLE, SMALL_GOLEM_IDLE_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.SMALL_GOLEM_WALK, SMALL_GOLEM_WALK_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.SMALL_GOLEM_HIT, SMALL_GOLEM_HIT_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.SMALL_GOLEM_DEATH, SMALL_GOLEM_DEATH_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.HEART_BEAT, HEART_BEAT_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.PIGLINBEAST_IDLE, PIGLINBEAST_IDLE_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.PIGLINBEAST_DEATH, PIGLINBEAST_DEATH_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.PIGLINBEAST_HURT, PIGLINBEAST_HURT_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.PIGLINBEAST_WALK, PIGLINBEAST_WALK_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.PIGLINBEAST_SHOUT, PIGLINBEAST_SHOUT_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.PIGLINBEAST_CLUBSWING, PIGLINBEAST_CLUBSWING_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.NIGHTMARE_IDLE, NIGHTMARE_IDLE_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.NIGHTMARE_DEATH, NIGHTMARE_DEATH_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.NIGHTMARE_HURT, NIGHTMARE_HURT_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.NIGHTMARE_ANGRY, NIGHTMARE_ANGRY_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.SOULREAPER_IDLE, SOULREAPER_IDLE_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.SOULREAPER_HURT, SOULREAPER_HURT_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.SOULREAPER_DEATH, SOULREAPER_DEATH_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.SPELL_CAST_SHIELD, SPELL_CAST_SHIELD_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.MAGIC_SHIELD_HIT, MAGIC_SHIELD_HIT_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.EYE_DEATH, EYE_DEATH_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.EYE_HURT, EYE_HURT_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.EYE_IDLE, EYE_IDLE_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.EYE_DEATH_PLATFORM, EYE_DEATH_PLATFORM_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.FUNGUS_IDLE, FUNGUS_IDLE_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.FUNGUS_HURT, FUNGUS_HURT_EVENT);
    Registry.register(Registry.SOUND_EVENT, SoundInit.FUNGUS_DEATH, FUNGUS_DEATH_EVENT);
  }
}